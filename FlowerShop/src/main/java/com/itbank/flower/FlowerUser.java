package com.itbank.flower;

import org.springframework.context.support.GenericXmlApplicationContext;



public class FlowerUser {

	public static void main(String[] args) {
		GenericXmlApplicationContext factory = 
		new GenericXmlApplicationContext("FlowerContext.xml");
		FlowerShopInterface f = (FlowerShopInterface)factory.getBean("f");
		
		f.welcome();
		f.member("홍길동");// 핵심내용 호출-
		f.buy("홍길동",5000);// 핵심내용 호출
		
		f.explorer();
		f.iDonknow();// 핵심내용 호출
		
		
		
		factory.close();
	}

}

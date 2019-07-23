package com.itbank.mvc11;

import org.apache.tomcat.util.buf.B2CConverter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SiteUser2 {

	public static void main(String[] args) {

		GenericXmlApplicationContext factory = new GenericXmlApplicationContext("aopContext.xml");
		BInterface b2 = (BInterface) factory.getBean("b2");
		b2.productFind("물통",1500);// 핵심내용 호출
		b2.productOrer();// 핵심내용 호출
		b2.basket();// 핵심내용 호출

		factory.close();
	}

}

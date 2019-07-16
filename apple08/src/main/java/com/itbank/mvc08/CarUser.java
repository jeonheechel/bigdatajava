package com.itbank.mvc08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CarUser {
	
	public static void main(String[] args) {
		
		ApplicationContext factory = new GenericXmlApplicationContext("context.xml");
		Car car1 = (Car)factory.getBean("car1");//이런 이름으로 만들어진 빈이 꼭 있어야 한다  // 업캐스팅 다운캐스팅 필수
		car1.open();
		car1.close();
		System.out.println("======================================================");
		
		 Car car2 = (Car)factory.getBean("car2");//이런 이름으로 만들어진 빈이 꼭 있어야 한다 // 업캐스다운캐스팅 필수 
		 car2.open(); 
		 car2.close();
		 
		
		
	}

}

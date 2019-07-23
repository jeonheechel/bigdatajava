package com.itbank.mvc11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SiteUser {

	public static void main(String[] args) {

		/*
		 * ApplicationContext factory = new
		 * GenericXmlApplicationContext("aopContext.xml"); ASite a =
		 * (ASite)factory.getBean("a"); a.personalInfo();//핵심내용 호출
		 */		
		
		
		/*
		 * ApplicationContext factory = new
		 * GenericXmlApplicationContext("aopContext.xml"); CSite c =
		 * (CSite)factory.getBean("c"); c.rderview() ;c.confirm();//핵심내용 호출
		 */		
				ApplicationContext factory = new
				 GenericXmlApplicationContext("aopContext.xml"); BSite b =
				 (BSite)factory.getBean("b"); b.ser();
				 b.jang();
				 b.buy2();//핵심내용 호출
	}

}

package com.itbank.mvc77;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class CookTest {

	public static void main(String[] args) {
		ApplicationContext factory =  new GenericXmlApplicationContext("context.xml");
		ICook cook = (ICook)factory.getBean("cook3");
		/*
		 * cook.makeRice(); cook.makeSoup(); cook.makeSalad(); cook.makeSource();
		 */
		CookManager man = new CookManager(cook);
		man.orderRice();
		man.orderShup();
		man.orderSalad();
		man.orderSource();
		
  	}

}

package com.itbank.mvc07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class TvUser4 {
	
	public static void main(String[] args) {

		//xml을 읽어서 객체를가져와서 쓸수있는것으로 가져왓다 bean객체 팩토리에 저장(설정해놓은것을 싱글톤으로 바꿔준거다)
		ApplicationContext factory =  new GenericXmlApplicationContext("context.xml");
		 Tv tv = (Tv)factory.getBean("tv");
		 tv.powerOn();
		 tv.powerOff();
		 tv.VolumeUp();
		 tv.VolumeDown();
		//
		
	}
}

package com.itbank;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

//@WebListener
public class ContextStartEnd implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("컨텍스트 소멸됨.");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("컨텍스트 생성됨.");
	}

}

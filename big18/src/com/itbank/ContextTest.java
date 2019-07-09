package com.itbank;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextTest implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("컨텍스트 종료");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("컨텍스트 시작");
	}

}

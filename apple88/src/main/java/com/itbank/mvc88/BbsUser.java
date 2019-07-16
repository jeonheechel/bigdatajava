package com.itbank.mvc88;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BbsUser {
	
	public static void main(String[] args) {
		
		ApplicationContext factory = new GenericXmlApplicationContext("context.xml");
		BbsDAO dao = (BbsDAO)factory.getBean("bbsDAO");//이런 이름으로 만들어진 빈이 꼭 있어야 한다  // 업캐스팅 다운캐스팅 필수
		BbsDTO bbsDTO = new BbsDTO();
		bbsDTO.setId("heechel");
		bbsDTO.setTitle("heechel");
		bbsDTO.setContent("heechel");
		bbsDTO.setWriter("heechle");
		dao.insert(bbsDTO);
		System.out.println("======================================================");
		

		 
		
		
	}

}

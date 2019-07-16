package com.itbank.mvc88;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MemberUser {
	
	public static void main(String[] args) {
		
		ApplicationContext factory = new GenericXmlApplicationContext("context.xml");
		MemberDAO dao = (MemberDAO)factory.getBean("memberDAO");//이런 이름으로 만들어진 빈이 꼭 있어야 한다  // 업캐스팅 다운캐스팅 필수
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("heechel");
		memberDTO.setPw("heechel");
		memberDTO.setName("heechel");
		memberDTO.setTel("heechel");
		dao.insert(memberDTO);
		System.out.println("======================================================");
		

		 
		
		
	}

}

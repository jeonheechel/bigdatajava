package com.itbank.mvc11;

import org.springframework.stereotype.Component;

@Component("a")//가 없으면 에러가 뜬다 	//asite 사용 가능("a")
public class ASite {
	
	public void personalInfo() {
		System.out.println("개인정보 보여짐!!!");
	}

}

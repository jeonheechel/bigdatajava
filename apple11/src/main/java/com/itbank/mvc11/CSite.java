package com.itbank.mvc11;

import org.springframework.stereotype.Component;

@Component("c")//가 없으면 에러가 뜬다 	//asite 사용 가능("a")
public class CSite {
	
	public void rderview() {
		System.out.println("주문정보보기!!!");
	}
	public void confirm() {
		System.out.println("확인!!!");
	}

}

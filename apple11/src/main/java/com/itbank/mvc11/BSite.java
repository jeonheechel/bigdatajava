package com.itbank.mvc11;

import org.springframework.stereotype.Component;

@Component("b")//가 없으면 에러가 뜬다 	//asite 사용 가능("a")
public class BSite {
	
	public void ser() {
		System.out.println("물건검색!!!");
	}
	public void jang() {
		System.out.println("장바구니!!!");
	}
	public void buy2() {
		System.out.println("주문!!!");
	}
	

}

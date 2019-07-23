package com.itbank.flower;

import org.springframework.stereotype.Component;

public class Flower implements FlowerShopInterface {

	@Override
	public String member(String name) {
		System.out.println(name + "님 회원가입을 환영합니다!");
		
		return "";
	}

	@Override
	public String buy(String name,int price) {
		System.out.println(name +"님  구매금액은"+price+"입니다!");
		
		return "";
	}

	@Override
	public void iDonknow() {
		int[] num = {1,2};
		num[2] = 3;//에러 발생
		System.out.println("알수없는 에러입니다~");
	}

	@Override
	public void welcome() {
		System.out.println("안녕하세용~");
	}

	@Override
	public void explorer() {
		System.out.println("쇼핑몰 투어시작");
		for(int i=0; i < 5000; i++) {
			System.out.print("");
		}
	}

}

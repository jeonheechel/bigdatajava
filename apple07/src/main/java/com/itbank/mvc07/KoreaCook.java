package com.itbank.mvc07;

public class KoreaCook implements Cook {

	@Override
	public void cook() {
		System.out.println("한식을 요리하다!");
	}

	@Override
	public void eat() {
		System.out.println("한식을 먹다!!");
	}

	@Override
	public void pay() {
		System.out.println("가격을 10000원 지불하다");
	}

}

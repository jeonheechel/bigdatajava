package com.itbank.mvc07;

public class JapanCook implements Cook {

	@Override
	public void cook() {
		System.out.println("일식을 요리하다!!");
	}

	@Override
	public void eat() {
		System.out.println("일식을 먹다!!");
	}

	@Override
	public void pay() {
		System.out.println("가격을 1만엔 지불하다");
	}

}

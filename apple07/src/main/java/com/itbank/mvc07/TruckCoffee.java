package com.itbank.mvc07;

public class TruckCoffee implements Coffee {

	@Override
	public void make() {
		System.out.println("트럭에서 커피를 만들다");
	}

	@Override
	public void pay() {
		System.out.println("트럭에서 계산기로 계산하다");
	}

}

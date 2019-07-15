package com.itbank.mvc07;

public abstract class ShopCoffee implements Coffee{
	//인터페이스는 추상메서드만 가지는것
	//추상클래스는 다쓸수 있는것 , 객체생성 불가
	public abstract void prepare();//추상메서드다 일반 메서드도 들어가고 추상도 들어갓으니 추상메서드(abstract)가 하나라도 포함되면 불안전하다(추상클래스)

	//자식이 꼭 구현하도록 강제성을 주기위해서  abstract을 쓴것이다
	//오버라이드는 강제성이 없다(안할수도 있다)
	@Override
	public void make() {
		System.out.println("가게에서 커피를 만들다!");
	}

	@Override
	public void pay() {
		System.out.println("가게에서 포스기로 계산하다");
	}

	
	
}

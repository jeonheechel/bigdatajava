package com.itbank.mvc07;

public class CoffeeUser {
	public static void main(String[] args) {
		//추상클래스는 업캐스팅의 대상이 된다.
		//인터페이스는 업캐스팅의 대상이 된다.
		//추상클래스와 인터페이스는 타입으로 쓸수 있다.
		//의존성(결합도)를 낮추기 위해 형변환을 사용하는거다
		ShopCoffee shop = new MyShopCoffee();//업캐스팅 시켜놓은것이다 의존성을 낮추기 위해서
		shop.make();
		shop.pay();
		shop.prepare();
		
		ShopCoffee truck = new ChainShopCoffee();
		truck.make();
		truck.pay();
		truck.prepare();
	}

}

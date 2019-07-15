package com.itbank.mvc07;

public class CookUser {

	public static void main(String[] args) {

		KoreaCook kc = new KoreaCook();
		
		kc.cook();
		kc.eat();
		kc.pay();
		System.out.println();
		JapanCook jc = new JapanCook();
		jc.cook();
		jc.eat();
		jc.pay();
		
	}

}

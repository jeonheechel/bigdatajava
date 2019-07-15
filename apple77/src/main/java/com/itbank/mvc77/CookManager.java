package com.itbank.mvc77;

public class CookManager {
	ICook ICook ;
	
	public  CookManager() {
		
	}
	
	public CookManager(ICook cook) {//void가 없으면 생성자
		ICook = cook;
		
	}
	
	//응집도 이다
	public void orderRice() {//void가 있으면 메서드
		ICook.makeRice();
	
	}
	public void orderShup() {
		ICook.makeSoup();
		
	}
	public void orderSalad() {
		ICook.makeSalad();
		
	}
	public void orderSource() {
		ICook.makeSource();
		
	}

	
}

package com.itbank.mvc06;

public class 빨간나무문 implements Door {

	@Override
	public void open() {
		System.out.println("빨간나무문 open");
	}

	@Override
	public void close() {
		System.out.println("빨간나무문  close");
	}

	@Override
	public void key() {
		System.out.println("빨간나무문  key");
	}

	@Override
	public void made() {
		System.out.println("빨간나무문  재질");
	}

}

package com.itbank.mvc11;

import org.springframework.stereotype.Component;

@Component("b2")
public class BSite2 implements BInterface {

	@Override
	public String productFind(String name,int price) {
		System.out.println(name + "물건 검색!");
		System.out.println( "가격은! " + price+" 원");
		return "검색 완료ok";
	}

	@Override
	public void basket() {
		int[] num = {1,2};
		num[2] = 3;//에러 발생
		System.out.println("장바구니!");
	}

	@Override
	public void productOrer() {
		System.out.println("물건 주문하다!");
	}

}

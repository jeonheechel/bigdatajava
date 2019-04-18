package control;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 오늘의 치킨 가격을 얼마인가요?입력받으세요
		 * 9000원을 넘으면 내일 시킬게요 끊고 안넘으면 
		 * 주문하겠습니다
		 */
		System.out.println("오늘의 치킨가격은 얼마인가요?");
		Scanner sc =new Scanner(System.in);
		int one = sc.nextInt();
		if(one >=9000){
			System.out.println("내일 다시주문할게요");
		}else{
			System.out.println("빨리 보내주세요 주문할게요");
		}
		
		
		
		
		
		
	}

}

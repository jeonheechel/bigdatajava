package control;

import java.util.Scanner;

/*
 * 저기요
 * ------------
 * 메뉴를 고르세요
 * -------------
 * 1.자장면2.짬뽕3.우동
 * --------------
 * 당신의선택은 : x
 * 당신은 xxx를 주문하셧습니다
 */
public class IfTest2 {
//								  배열의뜻
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("저기요");
		System.out.println("--------------------");
		System.out.println("메뉴를 고르시오!");
		System.out.println("--------------------");
		System.out.println("1.자장면 2.짬뽕 3.우동");
		System.out.println("--------------------");
		int food = sc.nextInt();//함수라고 다른언어에서는 표현한다
		//int food1 = sc.nextInt();메서드==함수 같은뜻이다(명령어)
		//System.out.print("당신의 선택은?    "+food1);
		System.out.print("당신의 선택은?    "+food);
	
		System.out.println();
		
		
		//if뒤에는 반드시 조건을 쓴다!!!
		//조건의 결과는 boolean(논리형 타입이다, true/false)
		//int food=333;//콘솔에서 1번 입력할시
		if(food == 1 ) {
			System.out.println("짜장면 선택하셧군요 주문!!!");
		}else if(food==2){
			System.out.println("짬뽕을 선택하셧군요 주문!!!!");
		}else if(food==3) {
			System.out.println("우동을 선택하셧군요 주문!!!!!");
		}else {
			System.out.println("다시선택하세요! 그런메뉴 없습니다!!!");
		}
			
		
		
		
	}//main end.

}//class end

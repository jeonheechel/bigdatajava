package java24;

import java.util.Random;

public class MathTest {

	public static void main(String[] args) {

		System.out.println(Math.random());//0~1되기 전까지의 더블값 
		int num = (int)(Math.random()+10);//더큰값을 하고싶으면 
		System.out.println(num);
		
		
		 double num2 = 12345.6789;
		System.out.println(Math.ceil(num2));//뒤자르고 무조건 올림
		System.out.println(Math.floor(num2));//무조건 내려버림
		System.out.println(Math.round(num2));//반올림 하기
		num2 = 1000; 
		
		
		final double NUM=1000;
		//NUM=2000; 변경 불가능하다
		//상수는 한번 넣어두고 변하지않아야 하는 데이터를 넣어둘때 사용
		//상수는 final을 키워드를 사용. 상수에 들어간 데이터는 변경불가
		//일반 변수와 비교하기 위해 대문자로 써두는것이 일반적이다
		
		int num3 = -100;
		System.out.println(Math.abs(num3));//절대값
		
		int num4 = -200;
		System.out.println(Math.max(num3, num4));//최대값
		System.out.println(Math.min(num3, num4));//최소값
		
		int num5 = -3;
		System.out.println(Math.pow(num5, 3));//승
		
		int num6 = 5;
		System.out.println(Math.sqrt(num6));
		
		Random r = new Random();
		//r.setSeed(100);//이게 잇으면 뮤조건 똑같은 값이 나온다
		for (int i = 0; i < 10; i++) {
			
			System.out.println(r.nextInt(100));
		}
		
		
		
	}

}

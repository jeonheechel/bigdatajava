package 반복문;

import java.util.Scanner;

public class WhileTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 두개의 입력값을 받아서 
		//첫번째 값부터 두번째 값까지 더합니다
		System.out.println("두수입력");
		System.out.println("숫자1입력>>");
		int num1 = sc.nextInt();
		System.out.println("숫자2입력>>");
		int num2 = sc.nextInt();
		
		//int num1=n1;//초기값
		//int num2=n2;
		int sum=0;
		while(num1<=num2) {//조건식
			
			sum+=num1;//더하는식
			
			num1++;//증감식
			
			System.out.println("1번째 수부터 2번째 수까지 돌아간 수"+num1);
		}
		System.out.println("총합"+sum);
		
				
	}

}

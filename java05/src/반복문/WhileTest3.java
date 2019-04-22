package 반복문;

import java.util.Scanner;

public class WhileTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 두개의 입력값을 받아서 
		//첫번째 값부터 두번째 값까지 더합니다
		
		int num1=11;//초기값
		int num2=20;
		int sum=0;
		while(num1<=num2) {//조건식
			
			sum+=num1;//더하는식
			
			num1++;//증감식
			
			System.out.println("11~20까지 돌아간 횟수"+num1);
		}
		System.out.println("총합"+sum);
		
				
	}

}

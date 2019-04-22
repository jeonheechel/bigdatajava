package 반복문;

import java.util.Scanner;

public class WhileTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1~9까지 곱하는 식
		//
		
		int num1=1;//초기값
		int num2=9;
		int sum=1;
	
		while(num1<=num2) {//조건식
			
			sum=sum*num1;//곱하는 식
			//sum+=num1;//더하는식
			
			
			num1++;//증감식
			
			System.out.println("1~9까지 곱한 횟수"+num1);
			System.out.println("몇번 곱해졋나 구하는 식"+sum);
		}
		System.out.println("총합"+sum);
		
				
	}

}

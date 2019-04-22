package 반복문;

import java.util.Scanner;

public class ForTest1 {
	//int test=1;//전역변수(globaL)
	
	
	public void end() {
		//System.out.println(sum);
		//변수의 사용범위가 다르기 때문에 쓸수 없다
		
	}
	
	public static void main(String[] args) {
		
		
		//for(초기값; 조건식; 증감식) {
		int sum=0;//지역변수라고 부른다(local)
		int start;
		for (start=1 ; start <=10 ; start++) {
			//sum=sum+start;
			sum += start;
			System.out.println("한수마다 누적수 :"+sum);
			System.out.println("start가 돌아간 횟수"+start+"회");
		}
		System.out.println("1 부터 10까지의 총합은 :"+sum);
		
	}

}

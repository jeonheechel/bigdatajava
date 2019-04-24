package 배열;

import java.util.Scanner;

public class 배열Quiz3 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] num =  new int[5];
//		for (int i = 0; i < num.length; i++) {
//			System.out.println("정수 5개 입력 >>");
//			num[i] = sc.nextInt();
//			
//		}
//		
//		System.out.println("======================");
//		for (int i : num) {
//			System.out.println(i);
//		}
		
		int[] num =  new int[5];
		//1~5
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		
		for (int i : num) {
			System.out.println(i);
		}
		
		
		
		
	}

}

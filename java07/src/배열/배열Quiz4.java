package 배열;

import java.util.Scanner;

public class 배열Quiz4 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] num =  new int[4];
//		for (int i = 0; i < num.length; i++) {
//			System.out.println("숫자4개 입력");
//			num[i] = sc.nextInt();
//				
//		}
//		System.out.println("=====index번호 출력 =====");
//		for (int i : num) {
//			if(i==33) {
//				System.out.println("num[2]");
//			}
//		}
		
		int[] num = {11,22,33,44};
		for (int i = 0; i < num.length; i++) {
			if(num[i] == 33) {
				System.out.println(i);
			}
		}
		
		
		
		
	}

}

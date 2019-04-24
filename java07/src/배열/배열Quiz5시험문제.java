package 배열;

import java.util.Scanner;

public class 배열Quiz5시험문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num =  new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.println("5명의 성적 입력>>");
			num[i] = sc.nextInt();
				
		}
		int sum1=0;
		double total=0;
		for (int i : num) {
			sum1 +=i;
		}
		System.out.println(sum1);
		total= sum1/5;
		System.out.println(total);
		
		
	}

}

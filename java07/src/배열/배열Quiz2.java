package 배열;

import java.util.Scanner;

public class 배열Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num =  new int[3];
		for (int i = 0; i < num.length; i++) {
			System.out.println("입력하세요");
			num[i] = sc.nextInt();
		}//											연산식은 ()로 묶어야한다
		System.out.println(num[0]+"+"+num[2]+"은 "+(num[0]+num[2])+"입니다");
	}

}

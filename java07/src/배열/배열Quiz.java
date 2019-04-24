package 배열;

import java.util.Scanner;

public class 배열Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] jjs =  new String[3];
		for (int i = 0; i < jjs.length; i++) {
			System.out.println("입력하세요");
			jjs[i] = sc.next();
		}
		System.out.println("**"+jjs[0]+"보다는  "+jjs[2]+"**입니다");
	}

}

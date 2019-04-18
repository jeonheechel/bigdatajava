package control;

import java.util.Scanner;

public class IfTest4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("두수를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("입력한수는 "+a+"과"+b+"이고 두수중 큰수는");
		if(a>b) {
			System.out.println(a+"의 수가 더큽니다");
		}else {
			System.out.println(b+"의 수가더큽니다");
		}
		
	}

}

package 배열까지정리문제;

import java.util.Scanner;

public class 파티참석문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] names = new String[5];
		int[]  age= new int[5];
		
		System.out.println("이름과 나이를 입력하세요.");
		//입력 받는것
		int num = 0;
		for (int i = 0; i < age.length; i++) {
			System.out.print("입력>>>");
			names[i]=sc.next();
			age[i]=sc.nextInt();
			num++;
			
		}
		System.out.println("전체 인원수는"+num);
		System.out.println();
		System.out.println("파티 참석자 명단입니다");
		for (int i = 0; i < age.length; i++) {
			System.out.println("이름은:"+names[i]+","+"나이는:"+age[i]);
		}
		
		//평균 출력
		double total = 0.0;
		double total2 = 0.0;
		for (int i = 0; i < age.length; i++) {
			 total += age[i];
			 
		}
		total2 = total/5;
		System.out.println("파티 참석자 나이 평균"+total2);
		
	}

}

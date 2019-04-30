package 생성자;

import java.util.Scanner;

public class 쇼핑몰 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[3];
		int[] age = new int[3];
		String[] tel = new String[3];
		String[] addr = new String[3];
								
		System.out.println("쇼핑몰 가입 정보를 입력해주세요");
		
		for (int i = 0; i < 3; i++) {
			System.out.print("가입할 이름 :");
			 name[i] = sc.next();
			System.out.print("가입할 나이 :");
			 age[i] = sc.nextInt();
			System.out.print("가입할 연락처 :");
			 tel[i] = sc.next();
			System.out.print("가입할 주소 :");
			 addr[i] = sc.next();
			
		}
		Member m1 = new Member(name[0],age[0],tel[0],addr[0]);
		Member m2 = new Member(name[1],age[1],tel[1],addr[1]);
		Member m3 = new Member(name[2],age[2],tel[2],addr[2]);
		
		
		
		
		System.out.println("----------------------------");
		System.out.println("쇼핑몰 회원가입 명단입니다");
		System.out.println("============================");
		System.out.println("이름        나이        연락처        주소");
		
		System.out.println("----------------------------");
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
		
	}

}

package jdbc;

import java.util.Scanner;

public class DB입력스캐너 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("----회원가입정보입력----");
		System.out.print("전화번호:");
		String tel =sc.next();
		System.out.print("아이디:");
		String id =sc.next();
		
		
		DB처리2업데이트 db = new DB처리2업데이트();
		try {//에러처리;
			db.update(tel,id);
		} catch (Exception e) {//잡는부분
			System.out.println("에러발생!! 에러발생!!");
			e.printStackTrace();
		}
	}
	
}

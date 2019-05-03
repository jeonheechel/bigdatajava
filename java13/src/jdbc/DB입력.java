package jdbc;

import java.util.Scanner;

import jdbc.DB처리;

public class DB입력 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("----회원가입정보입력----");
		System.out.println("아이디:");
		String id =sc.next();
		System.out.println("패스워드:");
		String pw =sc.next();
		System.out.println("이름:");
		String name =sc.next();
		System.out.println("연락처:");
		String tel =sc.next();
		
		DB처리 db = new DB처리();
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
		dto.setTel(tel);
		try {//에러처리;
			db.insert(dto);
		} catch (Exception e) {//잡는부분
			System.out.println("에러발생!! 에러발생!!");
			e.printStackTrace();
		}
	}

}

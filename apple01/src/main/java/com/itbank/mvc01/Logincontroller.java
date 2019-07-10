package com.itbank.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Logincontroller {
	
	
	
	@RequestMapping("loginCheck")
	public void login(@RequestParam ("id") String id, @RequestParam("pw") String pw ) {
		System.out.println("입력한 ID: "+id);
		System.out.println("입력한 PW: "+pw);
		System.out.println("로그인Check 처리 요청됨");
		System.out.println("로그인Check 처리 완료");
	}
	
	@RequestMapping("loginCheck2")
	public String login2( String id, String pw ) {
		String sId = "root";
		String sPw = "1234";
		if(sId.equals(id) && sPw.equals(pw)) {
			return "loginOk";
		}else {
			return "loginNot";
		}
	}
	
	
	@RequestMapping("memberDatail")
	public void detail() {
		System.out.println("DAO의 db연동 처리");
		System.out.println("상세 정보 받아옴..");
		System.out.println("views아래로 결과를 넘김.");
	}
	@RequestMapping("memberDelete")
	public void delete() {
		System.out.println("회원정보 조회 완료");
		System.out.println("삭제요청에 들어갑니다");
	}
}

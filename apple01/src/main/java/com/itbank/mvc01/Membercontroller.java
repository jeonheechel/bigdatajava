package com.itbank.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Membercontroller {

	@RequestMapping("insert2")
	public void insert(MemberDTO memberDTO , MemberDAO memberDAO) {//변수가 똑같으면 다넣어준다. 객체를 만들때에는 앞에만 소문자로 만들어주면 된다
		
		 memberDAO.insert(memberDTO);//그냥 넘긴것
		 memberDAO.insert2(memberDTO);//암호화 한것
		/*
		 * System.out.println("입력한 ID: "+memberDTO.getId());
		 * System.out.println("입력한 PW: "+memberDTO.getPw());
		 * System.out.println("입력한 TEL: "+memberDTO.getTel());
		 * System.out.println("입력한 NAME: "+memberDTO.getName());
		 * System.out.println("로그인Check 처리 요청됨"); System.out.println("로그인Check 처리 완료");
		 */
	}
	
//	@RequestMapping("delete")
//	public void delete(MemberDTO memberDTO , MemberDAO memberDAO) {//dao는 한개만 있으면 된다 굳이 다르게 이렇게 하면 메모리를 엄청 낭비한다
//		//아직 완성된 코드는 아니다 저편리하고 간단해 질수 있다
//		memberDAO.delete(memberDTO);
//	
//	}
	
}

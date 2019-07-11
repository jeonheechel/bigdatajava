package com.itbank.mvc03;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	
	@RequestMapping("loginCheck")//로그인 체크라는 요청이 들어오면 이 메소드를 실행하라
	public String login(Model model, MemberDTO memberDTO, ArrayList<String> list) {//이놈은 메서드다 호출하지않으면 실행이 안된다
		System.out.println("로그인처리");
		model.addAttribute("result","내가 넘어갑니다");//스트링을 넘겨준다
		
		memberDTO.setId("spring");
		memberDTO.setPw("spring");
		memberDTO.setName("spring");
		memberDTO.setTel("spring");
		model.addAttribute("MemberDTO",memberDTO);
		
		list.add("감자");
		list.add("고구마");
		list.add("양파");
		model.addAttribute("list",list);
		
		return "loginResult";//이렇게 리턴해주면 해당 페이지로 바로 이동한다
		//string 파일을 리턴해주면 view아래로 가서 이 이름으로 된 ???.jsp파일을 찾아서 찾아서 넘겨준다 
	}
	
}

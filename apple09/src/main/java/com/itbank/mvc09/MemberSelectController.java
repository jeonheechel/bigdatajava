package com.itbank.mvc09;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberSelectController {
	
	@Autowired
	//@Qualifier("da01") dao가 두개 일 때 이름으로 한번 더 검색해야 함.
	MemberDAO dao;
	
	@RequestMapping("select.do")
	public void select(MemberDTO memberDTO, Model model) /*여기서 만드는 것은 프로토 타입*/ {
		MemberDTO dto = dao.select(memberDTO);
		model.addAttribute("dto", dto);
	}
	
	@RequestMapping("selectAll.do")
	public void selectAll(Model model){
		List<MemberDTO> list = dao.selectAll();
		model.addAttribute("list", list);
	}
}

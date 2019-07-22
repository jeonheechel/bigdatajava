package com.itbank.mvc09;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsSelectController {
	
	@Autowired
	//@Qualifier("dao1") dao가 두개 일 때 이름으로 한번 더 검색해야 함.
	BbsDAO dao;
	
	

	@RequestMapping("bbsselect.do")
	public void select(BbsDTO bbsDTO, Model model) /*여기서 만드는 것은 프로토 타입*/ {
		BbsDTO dto = dao.select(bbsDTO);
		model.addAttribute("dto", dto);
	}
	
	@RequestMapping("bbsselectAll.do")
	public void selectAll(Model model){
		List<BbsDTO> list = dao.selectAll();
		model.addAttribute("list", list);
	}
}

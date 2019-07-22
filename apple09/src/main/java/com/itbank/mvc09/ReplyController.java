package com.itbank.mvc09;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReplyController {
	
	@Autowired
	ReplyDAO dao;
	
	@RequestMapping("replyinsert.do")
	public String name(ReplyDTO replyDTO) {
		dao.insert(replyDTO);
		return "replyinsert";
	}
	
	@RequestMapping("replyselect.do")
	public void select(ReplyDTO replyDTO, Model model) /*여기서 만드는 것은 프로토 타입*/ {
		ReplyDTO dto = dao.select(replyDTO);
		model.addAttribute("dto", dto);
	}
	
	@RequestMapping("replyselectAll.do")
	public String selectAll(Model model){
		List<ReplyDTO> list = dao.selectAll();
		model.addAttribute("list", list);
		return "bbsselect";
	}
	
	
	
}

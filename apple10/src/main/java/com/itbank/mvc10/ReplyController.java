package com.itbank.mvc10;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReplyController {

	@Autowired
	ReplyDAO dao;
	

	
	@RequestMapping("replyInsert.do")
	public void insert(ReplyDTO replyDTO){
		dao.insert(replyDTO);
		System.out.println("insert요청!");
	}
	
	@RequestMapping("replyAll.do")
	public void selectAll(Model model) {
		List<ReplyDTO> list = dao.selectAll();
		model.addAttribute("list", list);
	}
	

	
	
	
}

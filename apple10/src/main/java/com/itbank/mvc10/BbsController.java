package com.itbank.mvc10;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@Autowired
	BbsDAO dao;
	
	@Autowired
	myCommentDAO cdao;
	
	@RequestMapping("bbsinsert.do")
	public void insert(BbsDTO bbsDTO){
		dao.insert(bbsDTO);
	}
	
	@RequestMapping("bbsselect.do")
	public void select(BbsDTO bbsDTO, Model model) {
		BbsDTO dto = dao.select(bbsDTO);
		model.addAttribute("bdto", dto);
		List<myCommentDTO> list = cdao.selectAll(bbsDTO.getId());
		model.addAttribute("clist",list);
		
	}
	
	@RequestMapping("bbsselectAll.do")
	public void selectAll(Model model){
		model.addAttribute("blist", dao.selectAll());
	}
	
	@RequestMapping("comment.do")
	public void commentInsert(myCommentDTO mycommentDTO, Model model){
		cdao.insert(mycommentDTO);
		System.out.println("댓글 등록");
				
		model.addAttribute("cdto",mycommentDTO);
		
	}
	
	
}

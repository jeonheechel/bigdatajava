package com.itbank.mvcSpring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MusicController {

	@Autowired //레포지토리로 넣어놓은걸 가져온것
	MusicDAO dao;
	

	
	@RequestMapping("input.do")//insert문
	public String insert(MusicDTO musicDTO){
		dao.insert(musicDTO);
		return "inputView";
	}
	@RequestMapping("update.do")//update문
	public String update(MusicDTO musicDTO){
		dao.update(musicDTO);
		return "updateView";
	}
	@RequestMapping("delete.do")//delete문
	public String delete(MusicDTO musicDTO){
		dao.delete(musicDTO);
		return "deleteView";
	}
	
	@RequestMapping("select.do")//한개만 가져오는 문
	public String select(MusicDTO musicDTO, Model model) {
		MusicDTO dto = dao.select(musicDTO);
		model.addAttribute("dto", dto);
		return "selectView";
		
	}
	
	@RequestMapping("selectAllView.do")//모두 값을 가져오는 문
	public String selectAll(Model model){
		model.addAttribute("list", dao.selectAll());
		return "selectAllView";
	}
	

	
	
}

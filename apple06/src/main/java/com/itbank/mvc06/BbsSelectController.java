package com.itbank.mvc06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsSelectController {
	
	@Autowired//getInstance역활을 해준다 
	//객체 이름이 아니고 타입 가지고 찾는다
	BbsDAO bbsDao;
	
		@RequestMapping("select")
		public void select(Model model, BbsDTO bbsDTO) throws Exception {
			
			bbsDTO = bbsDao.select(bbsDTO);
			model.addAttribute("bbsDTO", bbsDTO);
			System.out.println("컨트롤러 호출확인..");
		
			
		}

}

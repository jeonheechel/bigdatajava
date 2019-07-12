package com.itbank.mvc06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired//getInstance역활을 해준다 
	//객체 이름이 아니고 타입 가지고 찾는다
	BbsDAO bbsDao;
	
		@RequestMapping("bbsInsert")
		public void insert(BbsDTO bbsDTO) throws Exception {
			bbsDao.insert(bbsDTO);
			System.out.println("컨트롤러 호출확인..");
		
		
		}

}

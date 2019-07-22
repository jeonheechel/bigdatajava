package com.itbank.mvc10;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public class myCommentDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void insert(myCommentDTO mycommentDTO){
		my.insert("cDAO.insert",mycommentDTO);
		System.out.println("댓글 입력!");
	}
	
	public List<myCommentDTO> selectAll(String id){
		System.out.println("cDAO selectAll!");
		return my.selectList("cDAO.selectAll", id);
	}
	
}

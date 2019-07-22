package com.itbank.mvc09;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//@Component
//@Service
@Repository //db용 bean
public class ReplyDAO {	
	
	@Autowired
	SqlSessionTemplate myBatis; //변수 이름은 중요하지 않음.
	
	public void insert(ReplyDTO replyDTO) {
		myBatis.insert("rDAO.insert", replyDTO);
	}
	
	public ReplyDTO select(ReplyDTO replyDTO) {
		return myBatis.selectOne("rDAO.select", replyDTO);
	}
	public List<ReplyDTO> selectAll(){
		return myBatis.selectList("rDAO.selectAll");
	}
	

}

package com.itbank.mvc09;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//@Component
//@Service
@Repository //db용 bean
public class BbsDAO {	
	
	@Autowired
	SqlSessionTemplate myBatis; //변수 이름은 중요하지 않음.
	
	

	public BbsDTO select(BbsDTO bbsDTO) {
		return myBatis.selectOne("bDAO.select", bbsDTO);
	}
	public List<BbsDTO> selectAll(){
		return myBatis.selectList("bDAO.selectAll");
	}
	

}

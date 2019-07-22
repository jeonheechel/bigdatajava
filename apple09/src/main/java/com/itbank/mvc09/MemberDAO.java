package com.itbank.mvc09;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//@Component
//@Service
@Repository //db용 bean
public class MemberDAO {	
	
	@Autowired
	SqlSessionTemplate myBatis; //변수 이름은 중요하지 않음.
	
	
	public void insert(MemberDTO memberDTO) {
		myBatis.insert("mDAO.insert", memberDTO);
		System.out.println("myBatis호출");
	}
	
	public void delete(MemberDTO memberDTO) {
		myBatis.delete("mDAO.delete", memberDTO);
	}
	public void update(MemberDTO memberDTO) {
		myBatis.update("mDAO.update", memberDTO);
	}
	public MemberDTO select(MemberDTO memberDTO) {
		return myBatis.selectOne("mDAO.select", memberDTO);
	}
	public List<MemberDTO> selectAll(){
		return myBatis.selectList("mDAO.selectAll");
	}
	

}

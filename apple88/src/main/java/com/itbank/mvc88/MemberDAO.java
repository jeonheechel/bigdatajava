package com.itbank.mvc88;


import org.mybatis.spring.SqlSessionTemplate;


public class MemberDAO {
	
	SqlSessionTemplate myBatis;
	
	public MemberDAO(SqlSessionTemplate myBatis){
		this.myBatis = myBatis;
	}
	
	public void insert(MemberDTO memberDTO) {
		
		myBatis.insert("mDAO.insert", memberDTO);//이거 한줄로 다된다
		
	}

}

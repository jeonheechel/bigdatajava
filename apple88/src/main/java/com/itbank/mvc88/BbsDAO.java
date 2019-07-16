package com.itbank.mvc88;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;



public class BbsDAO {

SqlSessionTemplate myBatis;
	
	public BbsDAO(SqlSessionTemplate myBatis){
		this.myBatis = myBatis;
	}
	
	public void insert(BbsDTO bbsDTO) {
		
		myBatis.insert("bDAO.insert", bbsDTO);//이거 한줄로 다된다
		
	}
	
	
	
	
}

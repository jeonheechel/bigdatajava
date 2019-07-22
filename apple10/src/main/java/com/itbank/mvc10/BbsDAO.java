package com.itbank.mvc10;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void insert(BbsDTO bbsDTO) {
		my.insert("bDAO.insert", bbsDTO);
	}
	
	public void update(BbsDTO bbsDTO) {
		my.update("bDAO.update", bbsDTO);
	}
	
	public void delete(BbsDTO bbsDTO) {
		my.delete("bDAO.delete", bbsDTO);
	}
	
	public BbsDTO select(BbsDTO bbsDTO) {
		System.out.println("bbs select");
		return my.selectOne("bDAO.select", bbsDTO);
	}
	
	public List<BbsDTO> selectAll() {
		return my.selectList("bDAO.selectAll");
	}
	
}

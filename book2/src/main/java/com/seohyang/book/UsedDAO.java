package com.seohyang.book;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import oracle.net.aso.b;

import java.util.List;

//@Component 의 자식
//@Service
@Repository		//DB 용 Bean
public class UsedDAO {
	
	
	@Autowired
	SqlSessionTemplate my;
	
	public void insert(UsedDTO boardDTO) {
		my.insert("boDAO.insert", boardDTO);
		System.out.println("myBatis호출");
	}
	
	public void delete(UsedDTO boardDTO) {
		my.delete("boDAO.delete", boardDTO);
		
	}
	
	public void update(UsedDTO boardDTO) {
		my.update("boDAO.update", boardDTO);
	}
	public UsedDTO select(UsedDTO boardDTO) {
		return my.selectOne("boDAO.select", boardDTO);
	}
	
	public List<UsedDTO> selectAll() {
		//Mapper 파일에 있는 resultMap 으로 list를 생성해주기 떄문에 List 를 생성해주지 않아도 된다.
		return my.selectList("boDAO.selectAll");
	}
	
	
}

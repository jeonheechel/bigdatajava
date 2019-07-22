package com.itbank.mvc10;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// @Component의 자식들 : @Service, @Repository	/ @Bean은 spring framework 3점 때에 사용하던 것(지금도 사용하고 있음)
// @Service --> Spring 버전에 따라 다름
@Repository	// annotation을 사용해서 DB용 Bean을 만들 때 사용
public class MemberDAO {

	@Autowired	//Autowired는 자료형(SqlSessionTemplate 자료형을 가지고 검색해서 찾아옴 --> myBatis 정의한 것은 my로 정해도 상관없음(주소 값을 가져 오는 것이기 때문에)
	SqlSessionTemplate my;	//--> my라고 정의해도 상관이 없음
	
	public void insert(MemberDTO memberDTO){
		my.insert("mDAO.insert", memberDTO);
		System.out.println("myBatis insert호출");
	}
	
	public void delete(MemberDTO memberDTO) {
		my.delete("mDAO.delete", memberDTO);
	}
	
	public void update(MemberDTO memberDTO) {
		my.update("mDAO.update", memberDTO);
	}
	
	public MemberDTO select(MemberDTO memberDTO) {
		// select의 결과값이 1개 일 때는 selectOne메소드 사용
		return my.selectOne("mDAO.select", memberDTO);
	}
	
	public List<MemberDTO> selectAll() {
		return my.selectList("mDAO.selectAll");
	}
	
	
	
}

package bean;

import java.sql.*;
import java.util.ArrayList;

public class MemberDAO {
	DBConnectionMgr mgr;
	public MemberDAO() {
		
		mgr = DBConnectionMgr.getInstance();//한개밖에 못만든다
	}
	public void insert(MemberDTO dto) throws Exception {
		
		//1.2단계를 해주는 DBconnectinMgr 객체 필요
		Connection con = mgr.getConnection();
		
		
		
		//3단계 sql문 결정
		String sql = "insert into member value(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,dto.getId());
		ps.setString(2,dto.getPw());
		ps.setString(3,dto.getName());
		ps.setString(4,dto.getTel());
		
		//4단계 sql문 전달요청
		ps.executeUpdate();
	}
	
	
	
		  //어레이 리스트에 멤버 dto만 넣겟습니다 라는 뜻
		  //제너릭 프로그램(객체생성시 타입을 결정가능)
		  //형변환이 필요없어서 내부적인 처리속도가 더빠르다!
	public ArrayList<MemberDTO> selectAll() throws Exception {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>(); 
		
		//1.2단계를 해주는 DBconnectinMgr 객체 필요
		Connection con = mgr.getConnection();
		
		
		
		//3단계 sql문 결정
		String sql = "select * from member ";
		PreparedStatement ps = con.prepareStatement(sql);
		
		
		
		//4단계 sql문 전달요청
		ResultSet rs =  ps.executeQuery();
		MemberDTO  dto2 = null;
		while(rs.next()) {
			dto2 = new MemberDTO();
			String id = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
			dto2.setId(id);
			dto2.setPw(pw);
			dto2.setName(name);
			dto2.setTel(tel);
			list.add(dto2);
			
		}
		return list;
	}
	
	
	
	public MemberDTO select(MemberDTO dto) throws Exception {
		
		//1.2단계를 해주는 DBconnectinMgr 객체 필요
		Connection con = mgr.getConnection();
		
		
		
		//3단계 sql문 결정
		String sql = "select * from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,dto.getId());
		
		
		//4단계 sql문 전달요청
		ResultSet rs =  ps.executeQuery();
		MemberDTO  dto2 = null;
		while(rs.next()) {
			dto2 = new MemberDTO();
			String id = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
			dto2.setId(id);
			dto2.setPw(pw);
			dto2.setName(name);
			dto2.setTel(tel);
			
		}
		return dto2;
	}
	
	public void update(MemberDTO dto) throws Exception {
		
		//1.2단계를 해주는 DBconnectinMgr 객체 필요
		Connection con = mgr.getConnection();
		
		
		
		//3단계 sql문 결정
		String sql = "update member set  id= ?, pw= ?, tel= ?, addr= ?, tall= ?, kg= ?, sex= ?, age=? , email= ?, grade= ?   where id= ? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,dto.getId());
		ps.setString(2,dto.getPw());
		ps.setString(3,dto.getName());
		ps.setString(4,dto.getTel());
		ps.setString(5,dto.getId());
		
		//4단계 sql문 전달요청
		ps.executeUpdate();
	}
		
		
		
		
	

}

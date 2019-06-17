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
		String sql = "insert into user value(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,dto.getId());
		ps.setString(2,dto.getPw());
		ps.setString(3,dto.getTel());
		ps.setString(4,dto.getAddr());
		ps.setInt(5,dto.getTall());
		ps.setDouble(6,dto.getKg());
		ps.setString(7,dto.getSex());
		ps.setInt(8,dto.getAge());
		ps.setString(9,dto.getEmail());
		ps.setString(10,dto.getGrade());
		
		//4단계 sql문 전달요청
		ps.executeUpdate();
		mgr.freeConnection(con,ps);
	}
	

	public MemberDTO select(MemberDTO dto) throws Exception {
		
		//1.2단계를 해주는 DBconnectinMgr 객체 필요
		Connection con = mgr.getConnection();
		
		
		
		//3단계 sql문 결정
		String sql = "select* from user where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,dto.getId());
		
		
		//4단계 sql문 전달요청
		ResultSet rs =  ps.executeQuery();
		
		MemberDTO  dto2 = null;
		while(rs.next()) {
			dto2 = new MemberDTO();
			String id = rs.getString(1);
			String pw = rs.getString(2);
			String tel = rs.getString(3);
			String addr = rs.getString(4);
			String tall = rs.getString(5);
			String kg = rs.getString(6);
			String sex = rs.getString(7);
			String age = rs.getString(8);
			String email = rs.getString(9);
			String grade = rs.getString(10);
			dto2.setId(id);
			dto2.setPw(pw);
			dto2.setTel(tel);
			dto2.setAddr(addr);
			dto2.setTall(Integer.parseInt(tall));
			dto2.setKg(Double.parseDouble(kg));
			dto2.setSex(sex);
			dto2.setAge(Integer.parseInt(age));
			dto2.setEmail(email);
			dto2.setGrade(grade);
			
		}
		return dto2;
	}
	
	
	public MemberDTO idfind(MemberDTO dto) throws Exception {
		
		//1.2단계를 해주는 DBconnectinMgr 객체 필요
		Connection con = mgr.getConnection();
		
		
		
		//3단계 sql문 결정
		String sql = "select * from user where tel = ? AND addr=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,dto.getTel());
		ps.setString(2,dto.getAddr());
		
		
		
		//4단계 sql문 전달요청
		ResultSet rs =  ps.executeQuery();
		
		MemberDTO  dto2 = null;
		while(rs.next()) {
			dto2 = new MemberDTO();
			String id = rs.getString(1);
			String pw = rs.getString(2);
			String tel = rs.getString(3);
			String addr = rs.getString(4);
			String tall = rs.getString(5);
			String kg = rs.getString(6);
			String sex = rs.getString(7);
			String age = rs.getString(8);
			String email = rs.getString(9);
			String grade = rs.getString(10);
			dto2.setId(id);
			dto2.setPw(pw);
			dto2.setTel(tel);
			dto2.setAddr(addr);
			dto2.setTall(Integer.parseInt(tall));
			dto2.setKg(Double.parseDouble(kg));
			dto2.setSex(sex);
			dto2.setAge(Integer.parseInt(age));
			dto2.setEmail(email);
			dto2.setGrade(grade);
			
		}
		return dto2;
	}
	
	
	
	public MemberDTO pwfind(MemberDTO dto) throws Exception {
		
		//1.2단계를 해주는 DBconnectinMgr 객체 필요
		Connection con = mgr.getConnection();
		
		
		
		//3단계 sql문 결정
		String sql = "select * from user where id=? AND tel=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,dto.getId());
		ps.setString(2,dto.getTel());
		
		
		
		
		//4단계 sql문 전달요청
		ResultSet rs =  ps.executeQuery();
		
		MemberDTO  dto2 = null;
		while(rs.next()) {
			dto2 = new MemberDTO();
			String id = rs.getString(1);
			String pw = rs.getString(2);
			String tel = rs.getString(3);
			String addr = rs.getString(4);
			String tall = rs.getString(5);
			String kg = rs.getString(6);
			String sex = rs.getString(7);
			String age = rs.getString(8);
			String email = rs.getString(9);
			String grade = rs.getString(10);
			dto2.setId(id);
			dto2.setPw(pw);
			dto2.setTel(tel);
			dto2.setAddr(addr);
			dto2.setTall(Integer.parseInt(tall));
			dto2.setKg(Double.parseDouble(kg));
			dto2.setSex(sex);
			dto2.setAge(Integer.parseInt(age));
			dto2.setEmail(email);
			dto2.setGrade(grade);
			
		}
		return dto2;
	}
	
	
	
	public void update(MemberDTO dto) throws Exception {
		
		//1.2단계를 해주는 DBconnectinMgr 객체 필요
		Connection con = mgr.getConnection();
		
		
		
		//3단계 sql문 결정
		String sql = "update user set  id= ?, pw= ?, tel= ?, addr= ?, tall= ?, kg= ?, sex= ?, age= ?, email= ?, grade= ?     where id= ? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,dto.getId());
		ps.setString(2,dto.getPw());
		ps.setString(3,dto.getTel());
		ps.setString(4,dto.getAddr());
		ps.setInt(5,dto.getTall());
		ps.setDouble(6,dto.getKg());
		ps.setString(7,dto.getSex());
		ps.setInt(8,dto.getAge());
		ps.setString(9,dto.getEmail());
		ps.setString(10,dto.getGrade());
		ps.setString(11,dto.getId());
		
		//4단계 sql문 전달요청
		ps.executeUpdate();
		mgr.freeConnection(con,ps);
	}
	
public void delete(MemberDTO dto) throws Exception {
		
		//1.2단계를 해주는 DBconnectinMgr 객체 필요
		Connection con = mgr.getConnection();
		
		
		
		//3단계 sql문 결정
		String sql = "delete  from user where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,dto.getId());
		
		
		//4단계 sql문 전달요청
		ps.executeUpdate();
		mgr.freeConnection(con,ps);
	}
		
	
	  public MemberDTO idcheck(MemberDTO dto) throws Exception {
	  
	  //1.2단계를 해주는 DBconnectinMgr 객체 필요 Connection con = mgr.getConnection();
	 Connection con = mgr.getConnection();
	  
	  
	  //3단계 sql문 결정 String sql = "select * from user where id=? ";
	  String sql = "select * from user where id=? ";
	  PreparedStatement ps = con.prepareStatement(sql);
	  ps.setString(1,dto.getId());
	  
	  
	  
	  //4단계 sql문 전달요청 ResultSet rs = ps.executeQuery();
	  ResultSet rs =  ps.executeQuery();
	  
	  MemberDTO dto2 = null; 
	  while(rs.next()) { 
		  dto2 = new MemberDTO(); 
		  String id = rs.getString(1);
	  
	  dto2.setId(id);
	  
	  
	  } return dto2; 
	  
	  }
	 


//public int idCheck(String id){
//    int x = -1;
//   PreparedStatement ps = null;
//   ResultSet rs = null;
//   try{
//    Connection con = mgr.getConnection();
//    String sql = "select * from user where id=?";
//    ps = con.prepareStatement(sql);
//    ps.setString(1, id);
//    rs = ps.executeQuery();
//    if(rs.next()){
//      x = 1; //이미 존재하는 회원
//    }else {
//      x = -1; //가입 가능한 회원아이디
//    }
//   }catch(Exception e){
//    e.printStackTrace();
//   } finally {
//      try {
//         if(rs !=null) rs.close();
//         if(ps != null) ps.close();
//      }catch(Exception e) {
//         e.printStackTrace();
//      }
//   }
//   return x; //데이터베이스 오류
//   
//  }
		
		
	

}

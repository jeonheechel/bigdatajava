package bean;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;




public class StarDAO {
	static StarDAO dao;
	static StarDTO dto;

	//dao의 단계를 조금 효율적으로 변경
//	public void insert(StarDTO dto) throws Exception {
//		
//		Class.forName("com.mysql.jdbc.Driver");
//		System.out.println("드라이버 설정 ok<br>");
//		String url = "jdbc:mysql://localhost:3306/member";
//		String user = "root";
//		String pwd = "1234";
//		
//		Connection con = null;
//		PreparedStatement ps = null;
//		con = DriverManager.getConnection(url, user, pwd);
//		
//		String sql = "insert into star values(?,?,?,?,?)";
//		ps = con.prepareStatement(sql);
//		
//		ps.setString(1,dto.getId());
//		ps.setInt(2,dto.getNum());
//		ps.setInt(3,dto.getTop());
//		ps.setInt(4,dto.getUnder());
//		ps.setInt(5,dto.getShoes());
//		ps.executeUpdate();
//	}
	
//	public void delete(StarDTO dto) throws Exception {
//		
//		Class.forName("com.mysql.jdbc.Driver");
//		System.out.println("드라이버 설정 ok<br>");
//		String url = "jdbc:mysql://localhost:3306/member";
//		String user = "root";
//		String pwd = "1234";
//		
//		Connection con = null;
//		PreparedStatement ps = null;
//		con = DriverManager.getConnection(url, user, pwd);
//		
//		String sql = "delete from star where id=?";
//		ps = con.prepareStatement(sql);
//		
//		ps.setString(1,dto.getId());
//		
//		ps.executeUpdate();
//	}
	
public void select(String Id) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("드라이버 설정 ok<br>");
		String url = "jdbc:mysql://localhost:3306/member";
		String user = "root";
		String pwd = "1234";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		con = DriverManager.getConnection(url, user, pwd);
		
		String sql = "select * from star where id=?";
		ps = con.prepareStatement(sql);
		ps.setString(1,Id);
		
	
		rs = ps.executeQuery();
		
		while (rs.next()) {
			dto = new StarDTO();
			String id = rs.getString(1);
			String num = rs.getString(2);
			String top = rs.getString(3);
			String under = rs.getString(4);
			String shoes = rs.getString(5);
			int num2 = ParseInt(num);
			int top2 = ParseInt(top);
			int under2 = ParseInt(under);
			int shoes2 = ParseInt(shoes);
			 
			dto.setId(id);
			dto.setNum(num2);
			dto.setTop(top2);
			dto.setUnder(under2);
			dto.setShoes(shoes2);
			System.out.println(id);
			System.out.println(num2);
			System.out.println(top2);
			System.out.println(under2);
			System.out.println(shoes2);
			
			
			

		}
	}

private int ParseInt(String shoes) {
	// TODO Auto-generated method stub
	return 0;
}

	
	
	
	
}

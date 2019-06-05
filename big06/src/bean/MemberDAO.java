package bean;

import java.sql.*;

public class MemberDAO {
	//dao의 단계를 조금 효율적으로 변경
	public void insert(MemberDTO dto) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("드라이버 설정 ok<br>");
		String url = "jdbc:mysql://localhost:3306/bigdata";
		String user = "root";
		String pwd = "1234";
		
		Connection con = null;
		PreparedStatement ps = null;
		con = DriverManager.getConnection(url, user, pwd);
		
		String sql = "insert into member values(?,?,?,?)";
		ps = con.prepareStatement(sql);
		
		ps.setString(1,dto.getId());
		ps.setString(2,dto.getPw());
		ps.setString(3,dto.getName());
		ps.setString(4,dto.getTel());
		ps.executeUpdate();
}
}

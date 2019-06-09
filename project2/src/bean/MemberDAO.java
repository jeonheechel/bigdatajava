package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {

	//dao의 단계를 조금 효율적으로 변경
	public void insert(MemberDTO dto) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("드라이버 설정 ok<br>");
		String url = "jdbc:mysql://localhost:3306/member";
		String user = "root";
		String pwd = "1234";
		
		Connection con = null;
		PreparedStatement ps = null;
		con = DriverManager.getConnection(url, user, pwd);
		
		String sql = "insert into user values(?,?,?,?,?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		
		ps.setString(1,dto.getId());
		ps.setString(2,dto.getPw());
		ps.setString(3,dto.getTel());
		ps.setString(4,dto.getAddr());
		ps.setInt(5,dto.getTall());
		ps.setDouble(6,dto.getKg());
		ps.setString(7,dto.getSex());
		ps.setInt(8,dto.getAge());
		ps.setString(9,dto.getEmail());
		ps.executeUpdate();
}
}

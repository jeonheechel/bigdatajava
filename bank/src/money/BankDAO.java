package money;

import java.sql.*;
import java.util.ArrayList;







public class BankDAO {
	
	ResultSet rs;
	Connection con;
	PreparedStatement ps;
	String url;
	String user;
	String password;
	BankDTO dto = null;
	
	public BankDTO insert(String Id,String Name,String Age,String Tel) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");//www.naver.com=>com.naver.www
		//자바이외의 파일을 다룰때는 예외처리를 꼭해라!
		System.out.println("1. 드라이버 설정 OK.....");
		
		
//		2.DB연결(DB명,id,pw)
		 url = "jdbc:mysql://localhost:3306/bank";
		 user = "root";
		 password = "1234";
		 con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK...");
		//db버에서  mysql에서 오른쪽클릭에서 에디트 커넥트 세팅
		
		
//		3.SQL선택
		String sql = "insert into member values(?,?,?,?)";
		// 객체화
		 ps =  con.prepareStatement(sql);
		 ps.setString(1, Id);
		 ps.setString(2, Name);
		 ps.setString(3, Age);
		 ps.setString(4, Tel);
		
		 
		System.out.println("3. SQL문 결정 OK....");
		
		
//		4.SQL전송
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 완료");
		return null;

		
	}
		
		
		
	
	public BankDTO update(String Id,String Tel) throws Exception {
		
		
		
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("1. 드라이버 설정 OK.....");
		
		

		 url = "jdbc:mysql://localhost:3306/bank";
		 user = "root";
		 password = "1234";
		 con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK...");
		
		
		

		String sql = "update member set Tel=? where id=?";
	
		 ps =  con.prepareStatement(sql);
		 ps.setString(1, Tel);
		 ps.setString(2, Id);
		
		
		 
		System.out.println("3. SQL문 결정 OK....");
		
		

		ps.executeUpdate();
		System.out.println("4. SQL문 전송 완료");
		return null;

		
	}
	public BankDTO delete(String Id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("1. 드라이버 설정 OK.....");
		
		

		 url = "jdbc:mysql://localhost:3306/bank";
		 user = "root";
		 password = "1234";
		 con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK...");
		
		
		

		String sql = "delete from member where id=?";
	
		 ps =  con.prepareStatement(sql);
		 ps.setString(1, Id);
		 
		
		
		 
		System.out.println("3. SQL문 결정 OK....");
		
		

		ps.executeUpdate();
		System.out.println("4. SQL문 전송 완료");
		return null;
		
		
	}
	public BankDTO select(String Id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("1. 드라이버 설정 OK.....");
		
		

		 url = "jdbc:mysql://localhost:3306/bank";
		 user = "root";
		 password = "1234";
		 con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK...");
		
		
		try {
			// 3. SQL문 결정(객체화)
			String sql = "select * from member where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, Id);
			System.out.println("3 ok");

			// 4. SQL문 전송
			rs = ps.executeQuery();
			System.out.println("4 ok");

			if (rs.next()) {
				dto = new BankDTO();
				String id = rs.getString(1);
				String name = rs.getString(2);
				String age = rs.getString(3);
				String tel = rs.getString(4);
				
				dto.setId(id);
				dto.setName(name);
				dto.setAge(age);
				dto.setTel(tel);
				
				
				

			} else {
				System.out.println("검색 결과가 없습니다.");
			}

		} catch (Exception e) {
			System.out.println("DB처리중 에러 발생! id");
			System.out.println(e.getMessage());
		} finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (Exception e2) {
			}
		}
		return dto;
	}
	
	
	public ArrayList selectAll() throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("1. 드라이버 설정 OK.....");
		
		

		 url = "jdbc:mysql://localhost:3306/bank";
		 user = "root";
		 password = "1234";
		 con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK...");
		
		ArrayList list = new ArrayList();
		try {
			
			// 3. SQL문 결정(객체화)
			String sql = "select * from member";
			ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 객체화 OK");

			// 4. SQL문 전송
			rs = ps.executeQuery();
			System.out.println("4. SQL문 전송 OK");

			// SQL문의 결과가 있으면, 받아서 처리

			while (rs.next()) {
				dto = new BankDTO();
				String id = rs.getString(1);
				String name = rs.getString(2);
				String age = rs.getString(3);
				String tel = rs.getString(4);
				

				dto.setId(id);
				dto.setName(name);
				dto.setAge(age);
				dto.setTel(tel);
				
				list.add(dto);

			} 

		} catch (Exception e) {
			System.out.println("DB처리 중 에러 발생..");
			System.out.println(e.getMessage());
		} finally {
			// 에러발생 여부와 상관없이 무조건 실행시켜야 하는 코드
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				// e.printStackTrace();
				System.out.println("자원 해제 중 에러 발생!!");
			} // catch
		} // try-catch-finally
		
		
		return list;
	}
}





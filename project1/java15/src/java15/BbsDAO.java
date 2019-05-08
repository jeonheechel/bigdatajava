package java15;

import java.sql.*;

public class BbsDAO {
	String url = "jdbc:mysql://localhost:3306/bigdata";
	String user = "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	//CRUD
	//각각을 메소드로 만들어야 한다!
	//SQL문은  select * from bbs where id = ?
	public BbsDTO select(String inputId)  {//메서드 만드는중
		
		BbsDTO  dto = null;//변수의 생존범위: 선언의 위치
		
		//1. 드라이버 설정
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.드라이버 설정 ok.. ");
			
			//2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2.DB 연결  ok.. ");
			
			//3. SQL문 결정(객체화)
			String sql = "select * from bbs where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputId);
			System.out.println("3.SQL 문 객체화 ok.. ");
			
			
			//4. SQl문을 전송
			rs = ps.executeQuery();
			System.out.println("4.SQL 문 전송 ok.. ");
			
			// SQl 문의 결과가 있으면 받아서 처리해라!
			
			if(rs.next()) {
				dto = new BbsDTO();
				String id = rs.getString(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String etc = rs.getString(4);
				//위에서 검색한 값을 순서대로 dto.에다가 넣어준다는 뜻이다
				dto.setId(id);
				dto.setTitle(title);
				dto.setContent(content);
				dto.setEtc(etc);
						
			}else {
				System.out.println("검색 결과가 없습니다!!");
			}
			
			
		} catch (Exception e) {
			System.out.println("DB처리중 에러발생");
			System.out.println(e.getMessage());
			
		} finally {
			//에러 발생 여부와 상관없이 무조건 실행 시켜야하는 코드는 여기다 넣는다
			 try {
				rs.close();
				ps.close();
				con.close();
			} catch (Exception e) {
				//e.printStackTrace();안써도 그만이다
				System.out.println("자원 해제중 에러발생!!");
			}//catch
			 
		}//try-catch-finally
		return dto;
						
	}//select
	
public void insert(BbsDTO dto)   {//메서드 만드는중
	
		//변수의 생존범위: 선언의 위치
		
		//1. 드라이버 설정
	
		
			try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.드라이버 설정 ok.. ");
			
			//2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2.DB 연결  ok.. ");
			
			//3. SQL문 결정(객체화)
		    String sql = "insert into bbs values (?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getTitle());
			ps.setString(3, dto.getContent());
			ps.setString(4, dto.getEtc());
			System.out.println("3.SQL 문 객체화 ok.. ");
			
			
			//4. SQl문을 전송
			ps.executeUpdate();
			System.out.println("4.SQL 문 전송 ok.. ");
			
			} catch (Exception e) {
				e.printStackTrace();
			}
	
	
	}


public void update(BbsDTO dto)   {//메서드 만드는중
	
	//변수의 생존범위: 선언의 위치
	
	//1. 드라이버 설정

	
		try {
			Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.드라이버 설정 ok.. ");
		
		//2. DB연결
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB 연결  ok.. ");
		
		//3. SQL문 결정(객체화)
	    String sql = "update bbs set title = ? where id = ?";;
		ps = con.prepareStatement(sql);
		ps.setString(1, dto.getTitle());
		ps.setString(2, dto.getId());
		
		System.out.println("3.SQL 문 객체화 ok.. ");
		
		
		//4. SQl문을 전송
		ps.executeUpdate();
		System.out.println("4.SQL 문 전송 ok.. ");
		
		} catch (Exception e) {
			e.printStackTrace();
		}


}

public void delete(String id)   {//메서드 만드는중
	
	//변수의 생존범위: 선언의 위치
	
	//1. 드라이버 설정

	
		try {
			Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.드라이버 설정 ok.. ");
		
		//2. DB연결
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB 연결  ok.. ");
		
		//3. SQL문 결정(객체화)
	    String sql = "delete from bbs where id = ? ";
		ps = con.prepareStatement(sql);
		ps.setString(1, id);
		
	
		
		
		System.out.println("3.SQL 문 객체화 ok.. ");
		
		
		//4. SQl문을 전송
		ps.executeUpdate();
		System.out.println("4.SQL 문 전송 ok.. ");
		
		} catch (Exception e) {
			e.printStackTrace();
		}


}



	
	
}//class

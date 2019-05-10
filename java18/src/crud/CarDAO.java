package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;





public class CarDAO {
	String url = "jdbc:mysql://localhost:3306/car";
	String user = "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	
	




	//select
	public ArrayList select(String Id) {// 메서드 만드는중
		ArrayList list = new ArrayList();
		CarDTO dto = null;// 변수의 생존범위: 선언의 위치

		// 1. 드라이버 설정
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.드라이버 설정 ok.. ");

			// 2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2.DB 연결  ok.. ");

			// 3. SQL문 결정(객체화)
			String sql = "select * from carsale where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, Id);
			System.out.println("3.SQL 문 객체화 ok.. ");

			// 4. SQl문을 전송
			rs = ps.executeQuery();
			System.out.println("4.SQL 문 전송 ok.. ");

			// SQl 문의 결과가 있으면 받아서 처리해라!

			while (rs.next()) {
				dto = new CarDTO();
				String id = rs.getString(1);
				String name = rs.getString(2);
				String content = rs.getString(3);
				String price = rs.getString(4);
				// 위에서 검색한 값을 순서대로 dto.에다가 넣어준다는 뜻이다
				dto.setId(id);
				dto.setName(name);
				dto.setContent(content);
				dto.setPrice(price);
				list.add(dto);
			}

		} catch (Exception e) {
			System.out.println("DB처리중 에러발생");
			System.out.println(e.getMessage());

		} finally {
			// 에러 발생 여부와 상관없이 무조건 실행 시켜야하는 코드는 여기다 넣는다
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (Exception e) {
				// e.printStackTrace();안써도 그만이다
				System.out.println("자원 해제중 에러발생!!");
			} // catch

		} // try-catch-finally
		return list;

	}// select
	
	
	
	public ArrayList selectAll() {
		ArrayList list = new ArrayList();
		CarDTO  dto = null;
		// 1. 드라이버 설정
				try {
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("1.드라이버 설정 ok.. ");

					// 2. DB연결
					con = DriverManager.getConnection(url, user, password);
					System.out.println("2.DB 연결  ok.. ");

					// 3. SQL문 결정(객체화)
					String sql = "select * from carsale ";
					ps = con.prepareStatement(sql);
					
					System.out.println("3.SQL 문 객체화 ok.. ");

					// 4. SQl문을 전송
					rs = ps.executeQuery();
					System.out.println("4.SQL 문 전송 ok.. ");

					// SQl 문의 결과가 있으면 받아서 처리해라!

		
		while(rs.next()) {
			dto = new CarDTO();
			String id = rs.getString(1);
			String name = rs.getString(2);
			String content = rs.getString(3);
			String price = rs.getString(4);
			//위에서 검색한 값을 순서대로 dto.에다가 넣어준다는 뜻이다
			dto.setId(id);
			dto.setName(name);
			dto.setContent(content);
			dto.setPrice(price);
			list.add(dto);
					
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
		
		return list;
	





}// selectall
	
	
	
	public void insert(CarDTO dto) {// 메서드 만드는중

		// 변수의 생존범위: 선언의 위치

		// 1. 드라이버 설정

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.드라이버 설정 ok.. ");

			// 2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2.DB 연결  ok.. ");

			// 3. SQL문 결정(객체화)
			String sql = "insert into carsale values (?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getContent());
			ps.setString(4, dto.getPrice());
			System.out.println("3.SQL 문 객체화 ok.. ");

			// 4. SQl문을 전송
			ps.executeUpdate();
			System.out.println("4.SQL 문 전송 ok.. ");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void update(CarDTO dto) {// 메서드 만드는중

		// 변수의 생존범위: 선언의 위치

		// 1. 드라이버 설정

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.드라이버 설정 ok.. ");

			// 2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2.DB 연결  ok.. ");

			// 3. SQL문 결정(객체화)
			String sql = "update carsale set price = ? where id = ? ";
			;
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getPrice());
			ps.setString(2, dto.getId());

			System.out.println("3.SQL 문 객체화 ok.. ");

			// 4. SQl문을 전송
			ps.executeUpdate();
			System.out.println("4.SQL 문 전송 ok.. ");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void delete(CarDTO dto) {// 메서드 만드는중

		// 변수의 생존범위: 선언의 위치
		
		// 1. 드라이버 설정

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.드라이버 설정 ok.. ");

			// 2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2.DB 연결  ok.. ");

			// 3. SQL문 결정(객체화)
			String sql = "delete from carsale where id = ? ";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());

			System.out.println("3.SQL 문 객체화 ok.. ");

			// 4. SQl문을 전송
			ps.executeUpdate();
			System.out.println("4.SQL 문 전송 ok.. ");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	


}

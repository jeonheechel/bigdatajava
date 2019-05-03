package jdbc;

import java.sql.*;

public class DB처리 {
	//멤버변수 
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url;
	String user;
	String password;
	
	public String[] select(String id) throws Exception {
		
//		1.드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");//www.naver.com=>com.naver.www
		//자바이외의 파일을 다룰때는 예외처리를 꼭해라!
		System.out.println("1. 드라이버 설정 OK.....");
		
//		2.DB연결(DB명,id,pw)
		 url = "jdbc:mysql://localhost:3306/bigdata";
		 user = "root";
		 password = "1234";
		 con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK...");
		//db버에서  mysql에서 오른쪽클릭에서 에디트 커넥트 세팅
		
		
//		3.SQL선택
		String sql = "select * from member where id=?";
		// 객체화
		 ps =  con.prepareStatement(sql);
		 ps.setString(1, id);
		
		System.out.println("3. SQL문 결정 OK....");
		

		

//		4.SQL전송
		rs = ps.executeQuery();//검색 결과 값을 받아아와야 한다
		System.out.println("4. SQL문 전송 완료");
		String[] mem = null;
		if(rs.next()) {//레코드가 존재한다
			mem = new String[4];
			String s1 = rs.getString(1);//id
			String s2 = rs.getString(2);//pw
			String s3 = rs.getString(3);//name
			String s4 = rs.getString(4);//tel
			mem[0]=s1;
			mem[1]=s2;
			mem[2]=s3;
			mem[3]=s4;
//			System.out.println("검색된 ID:"+s1);
//			System.out.println("검색된 PW:"+s2);
//			System.out.println("검색된 NAME:"+s3);
//			System.out.println("검색된 TEL:"+s4);
		}else {//레코드가 없음
			System.out.println("검색 결과가 없습니다");
			
		}
		return mem;
		
	}
	
	
	
	
	
	
	
	
	//멤버 메소드
	public void insert(MemberDTO dto) throws Exception {
		
//		1.드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");//www.naver.com=>com.naver.www
		//자바이외의 파일을 다룰때는 예외처리를 꼭해라!
		System.out.println("1. 드라이버 설정 OK.....");
		
//		2.DB연결(DB명,id,pw)
		 url = "jdbc:mysql://localhost:3306/bigdata";
		 user = "root";
		 password = "1234";
		 con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK...");
		//db버에서  mysql에서 오른쪽클릭에서 에디트 커넥트 세팅
		
		
//		3.SQL선택
		String sql = "insert into member values(?,?,?,?)";
		// 객체화
		 ps =  con.prepareStatement(sql);
		 ps.setString(1, dto.getId());
		 ps.setString(2, dto.getPw());
		 ps.setString(3, dto.getName());
		 ps.setString(4, dto.getTel());
		 
		System.out.println("3. SQL문 결정 OK....");
		

		

//		4.SQL전송
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 완료");
	
		
		
	}
	
//	//멤버 메소드
//		public void insert(String id ,String pw ,String name ,String tel) throws Exception {
//			
////			1.드라이버 설정
//			Class.forName("com.mysql.jdbc.Driver");//www.naver.com=>com.naver.www
//			//자바이외의 파일을 다룰때는 예외처리를 꼭해라!
//			System.out.println("1. 드라이버 설정 OK.....");
//			
////			2.DB연결(DB명,id,pw)
//			 url = "jdbc:mysql://localhost:3306/bigdata";
//			 user = "root";
//			 password = "1234";
//			 con = DriverManager.getConnection(url, user, password);
//			System.out.println("2. DB연결 OK...");
//			//db버에서  mysql에서 오른쪽클릭에서 에디트 커넥트 세팅
//			
//			
////			3.SQL선택
//			String sql = "insert into member values(?,?,?,?)";
//			// 객체화
//			 ps =  con.prepareStatement(sql);
//			 ps.setString(1, id);
//			 ps.setString(2, pw);
//			 ps.setString(3, name);
//			 ps.setString(4, tel);
//			 
//			System.out.println("3. SQL문 결정 OK....");
//			
//
//			
//
////			4.SQL전송
//			ps.executeUpdate();
//			System.out.println("4. SQL문 전송 완료");
//		
//			
//			
//		}

	
}

package jdbc;

import java.sql.*;

import javax.swing.JOptionPane;

public class Quiz1 {
	
	public static void main(String[] args) throws Exception {
		
//		문제 1
//		myphone 이라는 db에 product테이블(id,title,price,company)
//
//		2.
//		값  : 	p100 apple 100 appcom
//		      	p200 banana 50 bacom
		
		//1.드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");//www.naver.com=>com.naver.www
		//자바이외의 파일을 다룰때는 예외처리를 꼭해라!
		System.out.println("1. 드라이버 설정 OK.....");
		
		
//		2.DB연결(DB명,id,pw)
		String url = "jdbc:mysql://localhost:3306/myphone";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK...");
		
		
		
//		3.SQL선택
		String id = JOptionPane.showInputDialog("id입력");
		String title = JOptionPane.showInputDialog("title입력");
		String price = JOptionPane.showInputDialog("price입력");
		String company = JOptionPane.showInputDialog("company입력");
		String sql = "insert into product values(?,?,?,?)";
		System.out.println(sql);
		
		// 객체화
		PreparedStatement ps =  con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setString(3, price);
		ps.setString(4, company);
		System.out.println("3. SQL문 결정 OK....");
		
		
//		4.SQL전송
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 완료");
		
	}

}

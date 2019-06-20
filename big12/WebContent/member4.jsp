<%@ page language="java" contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ page import="java.sql.*" %>

<%
String driverName = "com.mysql.jdbc.Driver";   
String jdbcUrl ="jdbc:mysql://localhost:3306/member";
String dbId = "root";
String dbPass = "1234";
%>

<%
	//전송된 데이터에 대한 인코딩 처리
	request.setCharacterEncoding("utf-8");
	//전송된 데이터 반환
	String id = request.getParameter("id");
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = "";
	String result ="";
	
	try{
		Class.forName(driverName);
		conn = DriverManager.getConnection(jdbcUrl,dbId,dbPass);
		
		sql = "select id from user where id=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		rs = pstmt.executeQuery();
		
		if(rs.next() == true){	//id 존재
%>
		아이디 중복됨
		
		
<%			
		}else{	//id 미존재
%>
		
		아이디 사용가능
		
<%			
		}
		
	}catch(Exception e) {
%>
	{	"result":"failure"	}
<%
		e.printStackTrace();
	}finally{
		if(rs!=null)try{rs.close();}catch(SQLException e){}
		if(pstmt!=null)try{pstmt.close();}catch(SQLException e){}
		if(conn!=null)try{conn.close();}catch(SQLException e){}
	}
	
	
	
%>



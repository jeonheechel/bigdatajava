<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.itbank.mvc06.DBConnectionMgr"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	
		<%
			DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		 	Connection con =  mgr.getConnection();
		 	out.print("오라클 DB연결 성공.!");
		 	String sql = "insert into member values('win5','win5','win5','win5')";
		 	//String sql = "delete member where id=('win5')";
		 	//String sql = "update member set id=('win77') where id=('win4')";
		 	PreparedStatement ps = con.prepareStatement(sql);
		 	ps.executeUpdate();
		 	out.print("오라클 SQL전송 성공.!");
		 	/* mvc1의 값넣는 방식이다 이건 */
		%>
	
	</body>
</html>
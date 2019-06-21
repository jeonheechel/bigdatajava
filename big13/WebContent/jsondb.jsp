<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="bean.DBConnectionMgr"%>
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
			DBConnectionMgr mgr = null;
			mgr = DBConnectionMgr.getInstance();
			
			Connection con = mgr.getConnection();
			
			String sql = "insert into jsontable value(?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, request.getParameter("name"));
			ps.setString(2, request.getParameter("tel"));
			
			ps.executeUpdate();
		
		%>
	
	</body>
</html>
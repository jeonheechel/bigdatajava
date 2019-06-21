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
			
			String sql = "insert into xmltable values(?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, request.getParameter("id"));
			ps.setString(2, request.getParameter("first_name"));
			
			ps.executeUpdate();
		
		%>
	
	</body>
</html>
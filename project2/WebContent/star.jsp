<%@page import="bean.StarDAO"%>
<%@page import="bean.StarDTO"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<jsp:useBean id="dto" class="bean.StarDTO"></jsp:useBean>
		<jsp:setProperty property="*" name="dto"/>
		
		<%
		
		StarDAO dao = new StarDAO();
		dao.insert(dto);
		
		%>
	</body>
</html>
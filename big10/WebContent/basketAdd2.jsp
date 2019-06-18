<%@page import="bean.BasketDTO"%>
<%@page import="java.util.ArrayList"%>
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
		String pId = request.getParameter("pId");
		String count = request.getParameter("count");
	
		Cookie cookie1 = new Cookie(pId,count); 
		response.addCookie(cookie1);
		/* Cookie cookie2 = new Cookie(count,"1000"); 
		response.addCookie(cookie2); */
		
		response.addCookie(cookie1);
	
	%>
	
	
	</body>
</html>
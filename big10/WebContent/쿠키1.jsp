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
	Cookie cookie1 = new Cookie("hi","cookiehello..");  
	cookie1.setMaxAge(360);
	response.addCookie(cookie1);
	Cookie cookie2 = new Cookie("subject","jsp"); 
	cookie2.setMaxAge(360);
	response.addCookie(cookie2);
	Cookie cookie3 = new Cookie("name","hong"); 
	cookie3.setMaxAge(360);
	response.addCookie(cookie3);

	%>
	<jsp:forward page="쿠키2.jsp"></jsp:forward>
	
	</body>
</html>
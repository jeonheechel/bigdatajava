<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<%
			String color = request.getParameter("color");
		
		%>
	</head>
	
	<body bgcolor="<%=color %>">
	
	</body>
</html>
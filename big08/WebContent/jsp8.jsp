<%@page import="java.util.Enumeration"%>
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
		Enumeration<String> headers = request.getHeaderNames();
		
		while(headers.hasMoreElements()){
			String s = headers.nextElement();
			out.write(s+"<br>");
		}
	%>
	</body>
</html>
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
	
		session.setAttribute("id", "apple");
		application.setAttribute("count", 100);
	
	%>
	
	세션값 출력:${ id }<br>
	어플리 케이션값 출력:${ count }<br>
	
	<hr>
	
	<%
		int c = (Integer)application.getAttribute("count");
		int total = c+1;
		application.setAttribute("count", total);
	%>
	
	<a href="set속성2.jsp">set속성2.jsp</a>
	
	</body>
</html>
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
	
		String pw = (String)session.getAttribute("pw");/* 장바구니가 비어있으면 널 처리를 꼭 해줘야 한다 */
	
	%>
	<hr>
	<%=pw %>
	</body>
</html>
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
		//포스트 방식의 요청인경우 한글처리를 따로 해주어야 함!!! 꼭!
		request.setCharacterEncoding("utf-8");
		String find = request.getParameter("find");
	
	%>
	검색요청된 스트링 :<%=find %>
	</body>
</html>
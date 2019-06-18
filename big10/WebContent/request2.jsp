<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	${param.test }
	
	<!-- a태그만으로는 넘아기지 않는다 forwoad를 써야한다 -->
	<a href="request6.jsp">나는 클라이언트의 호출 request 가 사라진다</a>
	
	</body>
</html>
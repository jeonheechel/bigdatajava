<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>검색 리스트</h1>
		<c:forEach var="dto" items="${list}">
			아이디: ${dto.id}<br>
			패스워드: ${dto.pw}<br>
			이름: ${dto.name}<br>
			전화번호: ${dto.tel}<br>
			<hr color="red">
		</c:forEach>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><!-- 지시자 라고한다 -->
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			pageContext.setAttribute("name", "park");//페이지 내에서 이용가능

		%>
		<c:set var="age" value="100" scope="session">
		</c:set>
		
		
		<c:set var="count" value="200" scope="application">
		</c:set><!-- 스크립트릿이 훨씬 간단하다 -->
		
	
	<h1>${name}님 환영합니다.</h1>
	
	<a href="jstl2.jsp">다음 페이지</a>
	</body>
</html>
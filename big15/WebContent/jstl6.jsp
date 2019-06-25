<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><!-- 지시자 라고한다 -->
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		숫자:<fmt:formatNumber value="123456789" type="number"></fmt:formatNumber><br>
		패턴:<fmt:formatNumber value="1234.56789" pattern="0.000"></fmt:formatNumber><br>
		정수:<fmt:parseNumber value="1234.56789" integerOnly="true"></fmt:parseNumber><br>
		<c:set var="date" value="<%=new Date() %>"/>
		날짜만 길게 :<fmt:formatDate value="${ date}" type="date" dateStyle="full"/><br>
		날짜만 짧게 :<fmt:formatDate value="${ date}" type="date" dateStyle="short"/><br>
		시간만 길게 :<fmt:formatDate value="${ date}" type="time" dateStyle="full"/><br>
		두개다 길게 길게 :<fmt:formatDate value="${ date}" type="both" dateStyle="full"/><br>
	</body>
</html>
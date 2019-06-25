<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><!-- 지시자 라고한다 -->
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<sql:setDataSource
			url="jdbc:mysql://localhost:3306/bigdata"
			driver="com.mysql.jdbc.Driver"
			user="root"
			password="1234"
			scope="application"
			var="db"
		/>
		
		<sql:query var="list" dataSource="${db}">
			select * from member
		</sql:query>
		<c:forEach var="imsi" items="${list.rows}">
			${imsi.id}<br>
		</c:forEach>
		
	<%-- 	<sql:update dataSource="${db}">
			insert into member values (?,?,?,?)
			<sql:param value="final"></sql:param>
			<sql:param value="final"></sql:param>
			<sql:param value="final"></sql:param>
			<sql:param value="final"></sql:param>
			
		</sql:update> --%>
		
		
	</body>
</html>
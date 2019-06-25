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
			select * from bbs
		</sql:query>
		<c:forEach var="imsi" items="${list.rows}">
			<table border="1" bordercolor ="black">
				<tr height="100" align="center">
					<td>id</td>
					<td>title</td>
					<td>content</td>
					<td>etc</td>
				</tr>
				<tr height="100" align="center">
					<td>${imsi.id}</td>
					<td>${imsi.title}</td>
					<td>${imsi.content}</td>
					<td>${imsi.etc}</td>
				</tr>

			</table>
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
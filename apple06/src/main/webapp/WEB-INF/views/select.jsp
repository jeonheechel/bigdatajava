<%@page import="com.itbank.mvc06.BbsDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body bgcolor="blue">
	
<%-- 	${bbsDTO.id}
	${bbsDTO.title}
	${bbsDTO.content}
	${bbsDTO.writer} --%>
		 <h1>검색완료 완료!</h1>
		<form action="update">
			<input type="text" name="id" value=${bbsDTO.id} ><br>
			<input type="text" name="title" value=${bbsDTO.title} ><br>
			<input type="text" name="content" value=${bbsDTO.content} ><br>
			<input type="text" name="writer" value=${bbsDTO.writer} ><br>
			<input type="submit" value="서버로 전송">
		</form> 
		
	</body>
</html>
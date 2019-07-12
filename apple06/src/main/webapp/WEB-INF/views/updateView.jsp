<%@page import="com.itbank.mvc06.BbsDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body bgcolor="red">
		 <h1>수정완료 완료!</h1>
	
 	${bbsDTO.id}
	${bbsDTO.title}
	${bbsDTO.content}
	${bbsDTO.writer} 
		<!-- <form action="update">
			<input type="text" name="id" value=${bbsDTO.id} >
			<input type="text" name="title" value=${bbsDTO.title} >
			<input type="text" name="content" value=${bbsDTO.content} >
			<input type="text" name="writer" value=${bbsDTO.writer} >
			<input type="submit" value="서버로 전송"> 
		</form> -->
		
	</body>
</html>
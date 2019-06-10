<%@page import="bean.BbsDAO"%>
<%@page import="bean.BbsDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	</head>
	<body>
	<jsp:useBean id="dto" class="bean.BbsDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="dto"/>
	
	<%/* 스크립트릿 */
		//자동 임포크가 jsp 에서는 컨트롤+ 쉬프트+ m
		BbsDAO dao = new BbsDAO();
		BbsDTO dto2 = dao.select(dto);
		
	%>
	
	

	찾은 ID: <input type="text"  name="id" class="alert alert-secondary" value=<%=dto2.getId() %> readonly="readonly"><!--  표현식--><br>
	찾은 TITLE: <input type="text"  name="pw" class="alert alert-secondary" value=<%=dto2.getTitle() %>><!--  표현식--><br>
	찾은 CONTENT: <input type="text" name="name" class="alert alert-secondary" value=<%=dto2.getContent() %>><!--  표현식--><br>
	찾은 ETC: <input type="text" name="tel" class="alert alert-secondary" value=<%=dto2.getEtc() %>><!--  표현식--><br>
	
	
	
	
	</body>
</html>
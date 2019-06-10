<%@page import="bean.BbsDAO"%>
<%@page import="bean.BbsDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<jsp:useBean id="dto" class="bean.BbsDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="dto"/>
	
	<%
		BbsDAO dao = new BbsDAO();
		dao.insert(dto);
	%>
	글입력 완료
	
	</body>
</html>
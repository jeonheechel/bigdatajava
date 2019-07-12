<%@page import="bean.BbsDTO"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<%
		out.print("오라클 DB연결 성공.!");
		BbsDAO dao = new BbsDAO();
		BbsDTO dto = new BbsDTO();
		dto.setId("400");
		dto.setTitle("oracle2");
		dto.setContent("love oracle2");
		dto.setWriter("jung2");
		dao.insert(dto);
		out.print("오라클 SQL전송 성공.!");
	%>
	
	</body>
</html>
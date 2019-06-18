<%@page import="bean.MemberDAO"%>
<%@page import="bean.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>



<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
		<title>아이디 중복 확인</title>
	</head>
	<body>
	
	
	
	
	
	
	<jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean>
		<jsp:setProperty property="*" name="dto"/>
	
	<%
		String id = request.getParameter("id");
		session.setAttribute("id", id);
	
		MemberDAO dao = new MemberDAO();
		MemberDTO dto2 = dao.idcheck(dto);
		
		
		
		
		
		
		
	%>
	
	${id }
	
	</body>
</html>
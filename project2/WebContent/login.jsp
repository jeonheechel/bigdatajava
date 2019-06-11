<%@page import="bean.MemberDAO"%>
<%@page import="bean.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean>
		<jsp:setProperty property="*" name="dto"/>
		
		<%
		MemberDAO dao = new MemberDAO();
		MemberDTO dto2 = dao.select(dto);
		
		if(dto2 != null){
			
		   response.sendRedirect("main.jsp");
		
		
		 
		 }else{
			 
			 response.sendRedirect("login.html");
			
		 }
		
		%>
	</body>
</html>
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
		String id = request.getParameter("id");
		MemberDAO dao = new MemberDAO();
		MemberDTO dto2 = dao.select(dto);
		
		if(dto2 != null){
			
		   response.sendRedirect("main.jsp");
		   session.setAttribute("id", id);
		
		 
		 }else{
			 
			 response.sendRedirect("index.html");
			
		 }
		
		%>
	</body>
</html>
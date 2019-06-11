
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
	
	<!-- import + new  기능-->
	<!-- import bean.MemberDTO; , MemberDTO dto = new MemberDTO();  -->
	<jsp:setProperty property="*" name="dto"/>
	<%
		MemberDAO dao = new MemberDAO();
		dao.update(dto);
	response.sendRedirect("main.jsp");
	%>
	
	
	
	</body>
</html>
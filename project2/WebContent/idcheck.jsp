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
	out.print
		MemberDAO dao = new MemberDAO();
		MemberDTO dto2 = dao.select(dto);
		
		
	%>
	<%
	if(id.equals(dto2.getId()) ){
	%>
	<img src="2.png" width="290" height="166">
	<!-- 아이디가 이미 존재할때 이미지 -->
	<%}else{ %>
	<img src="3.png" width="290" height="166">
	<!-- 아이디가 존재하지 않을 때 이미지 -->
	<%} %>
	</body>
</html>
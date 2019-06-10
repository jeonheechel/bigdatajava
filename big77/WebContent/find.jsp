<%@page import="bean.MemberDTO"%>
<%@page import="bean.MemberDAO"%>
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
	<!-- 액션태그 -->
	<jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="dto"/>
	
	<%/* 스크립트릿 */
		//자동 임포크가 jsp 에서는 컨트롤+ 쉬프트+ m
		MemberDAO dao = new MemberDAO();
		MemberDTO dto2 = dao.select(dto);
		
	%>
	검색결과 입니다
	<hr>
		<form action="update.jsp">
		수정할 ID: <input type="text"  name="id" value=<%=dto2.getId() %> readonly="readonly"><!--  표현식--><br>
		수정할 PW: <input type="text"  name="pw" value=<%=dto2.getPw() %>><!--  표현식--><br>
		수정할 NAME: <input type="text" name="name" value=<%=dto2.getName() %>><!--  표현식--><br>
		수정할 TEL: <input type="text" name="tel" value=<%=dto2.getTel() %>><!--  표현식--><br>
		<button type="submit" class="btn btn-primary">제출</button>
		</form>
	</body>
</html>
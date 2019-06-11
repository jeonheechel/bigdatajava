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
		
		
		

	%>
		
	<hr>
		<form action="update2.jsp">
		수정할 ID: <input type="text"  name="id" value=<%=dto2.getId() %> readonly="readonly"><!--  표현식--><br>
		수정할 PW: <input type="text"  name="pw" value=<%=dto2.getPw() %>><!--  표현식--><br>
		수정할 TEL: <input type="text" name="tel" value=<%=dto2.getTel() %>><!--  표현식--><br>
		수정할 ADDR: <input type="text" name="addr" value=<%=dto2.getAddr() %>><!--  표현식--><br>
		수정할 TALL: <input type="text" name="tall" value=<%=dto2.getTall() %>><!--  표현식--><br>
		수정할 KG: <input type="text" name="kg" value=<%=dto2.getKg() %>><!--  표현식--><br>
		수정할 SEX: <input type="text" name="sex" value=<%=dto2.getSex() %> readonly="readonly"><!--  표현식--><br>
		수정할 AGE: <input type="text" name="age" value=<%=dto2.getAge() %>><!--  표현식--><br>
		수정할 EMAIL: <input type="text" name="email" value=<%=dto2.getEmail() %>><!--  표현식--><br>
		수정할 GRADE: <input type="text" name="grade" value=<%=dto2.getGrade() %> readonly="readonly"><!--  표현식--><br>
		<button type="submit" class="btn btn-primary">제출</button>
		</form>
		
	
	
	
	</body>
</html>
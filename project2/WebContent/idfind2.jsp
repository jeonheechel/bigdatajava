<%@page import="bean.MemberDAO"%>
<%@page import="bean.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type="text/javascript">
		alert("찾으시는 id는?!");
		</script>
	</head>
	<body>
	<jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="dto"/>
	
	<%
	
	MemberDAO dao = new MemberDAO();
	MemberDTO dto2 = dao.idfind(dto);
	
	
	%>
	ID:<%=dto2.getId() +"입니다"%>
	
	
	
	
	</body>
</html>
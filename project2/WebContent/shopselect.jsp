<%@page import="bean.StarDAO"%>
<%@page import="bean.StarDTO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<jsp:useBean id="dto" class="bean.StarDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="dto"/>
	<%
		StarDAO dao = new StarDAO();
	    StarDTO dto2 = dao.select(dto);
	
	
	%>
	<form action="shopupdate.jsp">
		검색된 ID: <input type="text"  name="id" value=<%=dto2.getId() %> readonly="readonly"><!--  표현식--><br>
		검색된 STARNUM: <input type="text"  name="starnum" value=<%=dto2.getStarnum() %> ><!--  표현식--><br>
		검색된 TOP: <input type="text" name="top" value=<%=dto2.getTop() %>><!--  표현식--><br>
		검색된 UNDER: <input type="text" name="under" value=<%=dto2.getUnder() %>><!--  표현식--><br>
		검색된 SHOES: <input type="text" name="shoes" value=<%=dto2.getShoes() %>><!--  표현식--><br>
		
		<button type="submit" class="btn btn-primary">수정</button>
		</form>
	
	</body>
</html>
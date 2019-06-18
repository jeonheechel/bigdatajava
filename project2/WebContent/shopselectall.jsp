
<%@page import="java.util.ArrayList"%>
<%@page import="bean.StarDTO"%>
<%@page import="bean.StarDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
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
	ArrayList<StarDTO> list = dao.selectAll(dto);
		
	%>
	<body>
	
	<center>
		<h4></h4>
		<table border="1" bordercolor="red" width="600">
			<tr align="center">
				<td>아이디</td>
				<td>스타번호</td>
				<td>상의</td>
				<td>하의</td>
				<td>신발</td>
			</tr>
			<%for(int i = 0 ; i < list.size() ; i++) {
			 	StarDTO dto2 = list.get(i);
			%>
			<tr align="center">
				<td><a href="shopselect.jsp?id=<%=dto2.getId() %>"><%=dto2.getId() %></a></td>
				<td><%=dto2.getStarnum() %></td>
				<td><%=dto2.getTop() %></td>
				<td><%=dto2.getUnder() %></td>
				<td><%=dto2.getShoes() %></td>
			</tr>
			<%} %>
		</table>
	</center>
	
	</body>
</html>
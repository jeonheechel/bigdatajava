<%@page import="com.itbank.mvcSpring.MusicDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>	
	<body>
	<!-- 표현식으로 -->
		<%
		List<MusicDTO> list = (List)request.getAttribute("list");
		
		for(MusicDTO musicDTO : list){
			%>
				<hr size="2" color="red">
				아이디 : <%=musicDTO.getId() %><br>
				제목 : <%= musicDTO.getName() %><br>
				내용 : <%= musicDTO.getPrice() %><br>
				작가 : <%= musicDTO.getSinger() %><br>
			<%
		}
		
		
		%>
		
	</body>
</html>
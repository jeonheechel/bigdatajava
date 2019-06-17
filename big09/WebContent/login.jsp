<%@page import="java.nio.channels.SeekableByteChannel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String dbId = "root";
		String dbPw = "1234";
		if((id.equals(dbId))&&(pw.equals(dbPw))){
			session.setAttribute("id", id);
			//setAttribute할때
			//session의 이름은 String타입이고
			//session의 속성의 값은 object타입
			//값은 아무 타입이나 가능(업캐스팅, 자동형변환)
			
		}else{
			response.sendRedirect("login.html");
		}
	
	%>
	${id}<br>
	
	<%=session.getAttribute("id") %>
	
	<%
	
		String sId = (String)session.getAttribute("id");/*넣을때는 오브젝이지만 꺼낼때는 다운캐스팅해서 꺼내야 한다!  */
	
	%>
	
	
	</body>
</html>
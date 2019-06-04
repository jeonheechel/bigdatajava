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
			String name = request.getParameter("name");
			String phone = request.getParameter("phone");	
			String year = request.getParameter("year");	
			String month = request.getParameter("month");	
			String day = request.getParameter("day");	
			String email = request.getParameter("email");	
			String gender = request.getParameter("gender");	
		%>
		
		<h1>당신이 입력한 정보는 아래와 같습니다</h1>
		<hr color="blud"><br>
		ID:<%= id %><br>
		PW:<%= pw %><br>
		NAME:<%= name %><br>
		PHONE:<%= phone %><br>
		YEAR:<%= year %><br>
		MONTH:<%= month %><br>
		DAY:<%= day %><br>
		EMAIL:<%= email %><br>
		GENDER:<%= gender %><br>
	
	</body>
</html>
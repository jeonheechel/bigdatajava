<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<%//스크립트릿(이안에는 자바 코드만 들어갈수 있다)
	for (int i =0; i<10 ; i++){
	%>	
	
	<table border="1" bordercolor="red">
		<tr width="500" align="center">
			<td width="100">과목</td>
			<td width="100">점수</td>
			<td width="100">학점</td>
		
		
		</tr>
		<tr>
			<td width="100">영어</td>
			<td width="100">100</td>
			<td width="100">A</td>
		
		
		</tr>
	</table>
	
	<% 
		}
	%>
	
	</body>
</html>
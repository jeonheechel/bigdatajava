<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
			<meta charset="UTF-8">
			<title>Insert title here</title>
			<link rel="stylesheet" type="text/css" href="style2.css">
			
			
			
			
			
			
	</head>
	<body>
	<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	
	%>
			<div id="total">
			<table id="top" border="1" bordercolor ="green">
			<tr>
			<td colspan="2">정보출력</td>
			</tr>
			<tr >
				<td class="t1">ID<br></td>
				<td class="t2"><%= id%><br></td>
			<tr >
				<td class="t1">PW <br></td>
				<td class="t2"><%= pw%><br></td>
			<tr >
				<td class="t1">NAME <br></td>
				<td class="t2"><%= name%><br></td>
			<tr >
				<td class="t1">TEL <br></td>
				<td class="t2"><%= tel%><br></td>
			</tr>
			</table>
			<div id="top2">
            <ul>
               <li><%= id%></li>
               <li><%= pw%></li>
               <li><%= name%></li>
               <li><%= tel%></li>
            </ul>
         </div>
		
		</div>
	</body>
</html>
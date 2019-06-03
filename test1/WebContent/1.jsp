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
			<td colspan="2"><%=id %> 님 환영합니다!</td>
			</tr>
			<tr >
				<td class="t1">ID<br></td>
				<td class="t2"><%= id%><br></td>
			

			</tr>
			</table>
			<div id="top2">
            <ul>
               <li><a href="sing01.html">메인창으로 가기!</a></li>

            </ul>
         </div>
		
		</div>
		
	</body>
	
</html>
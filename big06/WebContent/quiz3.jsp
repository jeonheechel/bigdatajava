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
	
		String travel  = request.getParameter("travel");
		String count  = request.getParameter("count");
		int count123 = Integer.parseInt(count);
		
		if(count123 < 3){
			out.print(travel+"여행을 더가실수 잇겟군요");
		}else{
			out.print(travel+"여행을 더가실수 없겟군요");
		}
	%>
	
	</body>
</html>
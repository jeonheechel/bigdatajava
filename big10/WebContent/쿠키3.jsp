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
		Cookie[] cookies = request.getCookies();
		for(Cookie c: cookies){//하나씩 가져올땐 포이치문을 써도 된다
			String name = c.getName();
			String value = c.getValue();
			/*out.write("제품명"+name+ "<br>");
			 out.write("제품가격"+value+ "<br>"); */
			out.write("<hr>");  
			 if(!(name.equals("JSESSIONID"))){
				 out.write("제품명"+name+ "<br>");
				 out.write("제품가격"+value+ "<br>"); 
			 }
		
		
		
		}
	%>
	
	
	</body>
</html>
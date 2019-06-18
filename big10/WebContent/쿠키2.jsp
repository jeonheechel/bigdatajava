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
			/* out.write(name+ "<br>");
			out.write("<hr>"); */
			if(name.equals("name")){
				String value = c.getValue();
				out.write(name+"<br>");
				out.write(value+"<br>");
				out.write("<hr>");
			}else if(name.equals("JSESSIONID")){
				out.write("<hr>");
			}else if(name.equals("hi")){
				String value = c.getValue();
				out.write(name+"<br>");
				out.write(value+"<br>");
				out.write("<hr>");
			}else if(name.equals("subject")){
				String value = c.getValue();
				out.write(name+"<br>");
				out.write(value+"<br>");
				out.write("<hr>");
			}
		}
		
	%>
	
	
	</body>
</html>
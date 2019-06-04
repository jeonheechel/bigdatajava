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
			String num1 = request.getParameter("num1");
			String num2 = request.getParameter("num2");
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			int num = 0;
			for(int i = n1; i <= n2 ; i++){
				num += i;
			}
			out.print("두수의합:"+num);
		%>

</body>
</html>
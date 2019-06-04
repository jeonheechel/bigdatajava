<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<!-- 선언문  (전역변수 초기화됨)-->
	<%!
	 	String name ;
		public String test(){
			return 1000 +"원";
		}
	%>
	<!-- 스크립트릿 (지역변수라서 쓰레기값이 들어가있다)-->
	<%
		String test = "";
		/* PrintWriter out = new PrintWriter(); */
		out.print(100+200+"<br>");
	%>
	<!-- 표현식 -->
	<%= 100+200 %><br>
	<%= name %><%= test %><br>
	<%= test() %>
	
	
	
	
	
	</body>
</html>
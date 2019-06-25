<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><!-- 지시자 라고한다 -->
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			String[] study = {"자바","안드로이드","빅데이터"};
			String foods = "감자,고구마,양파,수박";
		%>
		<!-- el은 변수값을 프린트 불가 -->
		<!-- el은 속성값 출력 가능 -->
		<c:set var="study" value="<%=study %>" scope="application"/>
		<c:forEach var="imsi" items="${study}">
			${imsi}
		</c:forEach>
		<br>
		<c:forTokens var = "imsi" items="<%=foods %>" delims=",">
		${imsi}
		 </c:forTokens>
		<c:redirect url="http://www.naver.com">
		</c:redirect>
		<hr color="red">
		<% response.sendRedirect("http://www.naver.com"); %> 
		<br>
		<c:catch var="e">
			<%
				int[] num = {1,2};
				num[2] = 3;
			%>
		</c:catch>
		에러정보 ${e} 
	</body>
</html>
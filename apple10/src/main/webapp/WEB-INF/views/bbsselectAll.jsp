<%@page import="com.itbank.mvc10.BbsDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 표현식으로 -->
<%
	List<BbsDTO> list = (List)request.getAttribute("blist");
	
	for(BbsDTO bbdto : list){
		%>
			<hr size="2" color="red">
			아이디 : <a href="bbsselect.do?id=<%=bbdto.getId() %>"><%= bbdto.getId() %></a><br>
			제목 : <%= bbdto.getTitle() %><br>
			내용 : <%= bbdto.getContent() %><br>
			작가 : <%= bbdto.getWriter() %><br>
		<%
	}
%>

	<j:forEach var="bdto" items="${blist}">
		<hr size="4" color="blue">
	아이디 : ${bdto.id }<br>
	제목 : ${bdto.title }<br>
	내용 : ${bdto.content }<br>
	작가 : ${bdto.writer }<br>
	</j:forEach>

</body>
</html>
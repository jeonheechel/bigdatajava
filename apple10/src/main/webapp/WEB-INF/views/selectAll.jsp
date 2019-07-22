<%@page import="com.itbank.mvc10.MemberDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>selectAll 페이지</h1>
<h2>검색 리스트</h2>
<!-- jstl이 안되는 경우 -->
<%
	List<MemberDTO> list = (List)request.getAttribute("list");
	for(MemberDTO dto : list){
		%>
			<hr color="blue">
			아이디 :  <a href="select2.do?id=<%=dto.getId() %>"><%= dto.getId() %></a><br>
			패스워드 : <%=dto.getPw() %><br>
			이름 : <%= dto.getName() %><br>
			전화번호 : <%= dto.getTel() %><br>
		<%
	}
%>

<hr size="3" color="red">
전체댓글>>
 <c:forEach var="cdto" items="${list2}">
 <br>
 <img src="resources/01.jpeg" style="width: 50px  ; height: 50px">
 아이디: ${cdto.id }<br>
 내용: ${cdto.content }<br>

	
</c:forEach> 

<hr size="3" color="red">

<!-- jstl이 되는 경우 -->
<%-- <c:forEach var="dto" items="${list}">
<hr color="blue">
아이디 : ${dto.id }<br>
패스워드 : ${dto.pw }<br>
이름 : ${dto.name }<br>
전화번호 : ${dto.tel }<br>
</c:forEach> --%>
<!-- 서버내부에서 넘길 때 : 가능 -->
<!-- views 밑에 있는 것에서 찾음 -->
<%-- <jsp:forward page="select.jsp"></jsp:forward> --%>
<!-- forward로 client의 member3를 잡아 줄 수 있나? 못잡음 -->
<%-- <jsp:forward page="member3.jsp"></jsp:forward> --%>
<!-- /를 추가해줌으로써 webapp에서 찾게끔 할 수 있으나 클라이언트의 마지막 요청 페이지 주소만 남아있음 -->
<%-- <jsp:forward page="/member3.jsp"></jsp:forward> --%>
<!-- 정석적인 방법 -->
<%-- <%
	response.sendRedirect("member3.jsp");
%> --%>

</body>
</html>
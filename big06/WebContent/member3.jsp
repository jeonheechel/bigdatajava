<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<!-- 쉽게 받는법 아래의 것을 한줄로 만든것이다 임포트,객체생성 이것저것 다해준다-->
	<!-- 액션태그라고 부른다 -->
	<!-- id에 변수명/ class에 파일 경로 -->
	<jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean>
	<!-- 파라미터를 받아서 dto에 넣어주는 역할이다  이름과 아이디는 같아야 한다-->
	<!-- setProperty는 set메소드를 일련적으로 호출하는것으로 생각/property는 변수들 all 을 의미/name는  id와 일치해야 한다  -->
	<jsp:setProperty property="*" name="dto"/>

<%

/* 	MemberDTO dto = new MemberDTO();
	dto.setId(request.getParameter("id"));
	dto.setPw(request.getParameter("pw"));
	dto.setName(request.getParameter("name"));
	dto.setTel(request.getParameter("tel")); */

%>

DTO에 들어간 값 출력

<hr color="green">
id:<%=dto.getId() %><br>
pw:<%=dto.getPw() %><br>
name:<%=dto.getName() %><br>
tel:<%=dto.getTel() %><br>

	</body>
</html>
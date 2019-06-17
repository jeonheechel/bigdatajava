<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	
	<jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean><!-- import와 new -->
	<jsp:setProperty property="*" name="dto"/><!-- *은 모든것을 dto에 넣어준다는 뜻이다 set메서드 -->
	
	
	<jsp:getProperty property="id" name="dto"/><!-- 정석 코드다 -->
	<br>
	${dto.id} <!-- EL로 하나만 출력할때에는 이렇게 한다 get메서드를 호출하는것이다--><br>
	<%=dto.getId() %>
	
	</body>
</html>
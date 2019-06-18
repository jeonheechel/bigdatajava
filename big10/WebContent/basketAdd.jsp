<%@page import="bean.BasketDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<jsp:useBean id="dto" class="bean.BasketDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="dto"/>
	<!-- 한꺼번에 넣기 위하여 썻다  -->
	
	<%
		//장바구니 세션이 이미 있는지 없는지 체크
		//널이면 만들어 달라는 뜻이다
		ArrayList<BasketDTO> list = (ArrayList<BasketDTO>)session.getAttribute("basket");
		if(list == null){
			
		//장바구니로 사용할 Arraylist 생성
		list = new ArrayList<>();
		list.add(dto);
		session.setAttribute("basket", list);
			
		}else{//널이 아닐경우 그럴때에는 있을떼에는 붙여준다
			list.add(dto);
			session.setAttribute("basket", list);
		}
		
	
	%>
	<!--  <a href="basketView.jsp">장바구니 보러가기</a>-->
	<%-- <jsp:forward page="장바구니에넣기.jsp"></jsp:forward> --%>
	<jsp:forward page="basketView.jsp"></jsp:forward>
	
	</body>
</html>
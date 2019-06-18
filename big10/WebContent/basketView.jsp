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
	   <%
      ArrayList<BasketDTO> list = (ArrayList<BasketDTO>)session.getAttribute("basket");
      %>
      장바구니에 들어간 물건의 개수: <%= list.size() %>
      <hr>
      <%
         for(int i = 0; i < list.size(); i++){
            BasketDTO dto = list.get(i);
            %><br>
      제품명: <%= dto.getpId() %>, 수량 <%= dto.getCount() %>, 가격<%= dto.getPrice() %>
       <%}
      %>
		
		
		
	
	
	
	</body>
</html>
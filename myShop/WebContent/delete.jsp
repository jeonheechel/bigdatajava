<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="product.ProductDAO"%>
	<%@page import="product.ProductDTO"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<jsp:useBean id="dto" class="product.ProductDTO"></jsp:useBean>
      <jsp:setProperty property="*" name="dto"/>
       <% 
      
      ProductDAO dao = new ProductDAO();
      dao.delete(dto);
      
       response.sendRedirect("main.html");
      
      %>
	
	</body>
</html>
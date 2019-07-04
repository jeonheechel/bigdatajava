<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
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
      ArrayList<ProductDTO> list =  dao.selectAll();
      
      %>
     <%for(int i = 0 ; i < list.size() ; i++) {
    	 ProductDTO dto2 = list.get(i);
	 %>
      
	
		
	
	  
       <hr color="red">
      		검색된 ID <input type="text"  value = <%= dto2.getId() %> readonly="readonly"><br>
      		검색된 PRO <input type="text" value = <%= dto2.getPro() %> readonly="readonly"><br>
      		검색된 COM <input type="text"value = <%= dto2.getCom() %> readonly="readonly"><br>
      		검색된 PRICE <input type="text" value = <%= dto2.getPrice() %> readonly="readonly"><br> 
      		
     <% } %>
	</body>
</html>
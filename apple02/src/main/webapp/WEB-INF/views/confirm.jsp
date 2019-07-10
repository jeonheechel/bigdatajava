<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body bgcolor="blue">
	
		검색된 ID:${productDTO.productid }<br>
		검색된 NAME:${productDTO.productname }<br>
		검색된 PRICE:${productDTO.productprice }<br>
		검색된 MILE:${productDTO.productmile }<br>
		<a href="product.jsp">메인으로</a>
		
	</body>
</html>
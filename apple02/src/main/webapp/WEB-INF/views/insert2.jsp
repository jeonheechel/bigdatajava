<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body bgcolor="lime">
	<table style="border: 1px solid black; " >
	<tr style="border: 1px solid black;">
		<td style="border: 1px solid black; ">ID</td>
		<td style="border: 1px solid black; ">NAME</td>
		<td style="border: 1px solid black; ">PRICE</td>
		<td style="border: 1px solid black; ">MILE</td>
	</tr>
	<tr style="border: 1px solid black;">
		<td style="border: 1px solid black; ">${productDTO.productid}</td>
		<td style="border: 1px solid black; ">${productDTO.productname}</td>
		<td style="border: 1px solid black; ">${productDTO.productprice}</td>
		<td style="border: 1px solid black; ">${productDTO.productmile}</td>
	</tr>
	</table>
		<a href="product.jsp">메인으로</a>
	
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>여기는 로그인후 메인페이지!!</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script type="text/javascript">
		alert("환영합니당~!");
		</script>
	</head> 
	<body>
	<h4>로그인후 메인페이지!</h4>
	${id}님 환영합니당~!!!<br><br>
	<a href="update.html">${id}님회원정보 조회및 수정및 삭제</a><br>
	<a href="shop1.html">${id}님회원 장바구니 조회및 수정및 삭제</a><br>
	<a href="shop2.html">${id}님회원 장바구니 추가</a><br>
	
	
	
	
	</body>
</html>
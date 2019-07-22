<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="insert.do">
			아이디: <input type="text" name= "id"><br>
			패스워드: <input type="text" name= "pw"><br>
			이름: <input type="text" name= "name"><br>
			전화번호: <input type="text" name= "tel"><br>
			<input type="submit" value="회원가입">		
		</form>
		<br>
		<hr>
		<form action="select.do">
			아이디: <input type="text" name= "id"><br>
			<input type="submit" value="서버로 전송">		
		</form>
		<br>
		<hr>
		<a href="selectAll.do">전체 검색</a>
	</body>
</html>
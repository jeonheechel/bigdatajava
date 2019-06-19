<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script type="text/javascript">
			$(function(){
				console.log("문서 loding ok....");
				var h2 = $("h2").text();
				//태그 사이에 내용(content)을 가지고 오는 경우
				console.log(h2);
				$("h1").text(h2);
				$("h1").css("background","lime");
			});
		
		
		</script>
	</head>
	<body>
		<h2>안녕하십니까..!</h2>
		<h1></h1>
	
	</body>
</html>
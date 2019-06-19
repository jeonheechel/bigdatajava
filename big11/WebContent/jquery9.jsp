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
				$("#base").before("<li>내가 형 입니다!</li>");
				$("#base").after("<li>내가 동생 입니다!</li>");
				$("ul").prepend("<li>내가  첫째 형  입니다!</li>");
				$("ul").append("<li>내가  막내 동생 입니다!</li>");
				
				
			});
		
		
		</script>
	</head>
	<body>
		<ul>
			<li id="base">-------------- 내가 기준 --------------
		</ul>
	
	</body>
</html>
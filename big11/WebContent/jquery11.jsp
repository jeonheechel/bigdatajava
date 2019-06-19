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
				
				/* $("li").css("background","lime"); */
				/*  $("li").empty();   자식을 지우기 때문에 li밑에 텍스트만 지운다*/ // 자식 del 
				/* $("li").remove();   자기자신만 지우기때문에 li가 사라진다*///자신 del
				/* $("button").click(function(){
					$("li").addClass("aqua");
				}); */
				
				$("#b1").click(function(){
					$("li").addClass("aqua");
				});
				
				$("#b2").click(function(){
					$("li").removeClass("aqua");
				});
				
			});
		
		
		</script>
		<style type="text/css">
		.aqua{
			background: aqua;
		}
		
		</style>
		
	</head>
	<body>
	<button type="button" id = "b1">나를 눌러요</button>
	<button type="button" id = "b2">나를 눌러요</button>
		<ul>
			<li>감자</li>
			<li>고구마</li>
			<li>양파</li>
		</ul>
	
	</body>
</html>
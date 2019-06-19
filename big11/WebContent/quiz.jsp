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
			$("#btn").click(function(){
				var value1 = $("input").val();
				$("#base").append("<br>"+value1)
			
			
			
			});
		});	
		
		
		</script>
	</head>
	<body>
		글입력:<input type="text"> 
			<button type="button" id="btn">댓글달기</button>
			<ul>
			<li>1번글 피츄!</li>
			<li id="base">---------------이아래로 댓글--------------</li>
			
			</ul>
	
	</body>
</html>
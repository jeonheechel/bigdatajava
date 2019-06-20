<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script type="text/javascript">
			$(function () {
				$("#data").load("2019-02-02.txt");
				$(document).ready();
				
				
				$("#button").click(function () {
					

				var date = $("#date").val().length;
				console.log(date);
				if(date < 1){
					alert("날짜를 입력해주세요..!!");
					return false;
				}else{
					alert("당신이 입력한 날짜는 " + $("#date").val());
				}

				$("#content").val($("#data").text());
				$("#form").submit();
				});
			});
		
			
		</script>
	</head>
	<body>
		<div id="data"></div>
		<form action="dairy.jsp" id="form">
			날짜:<input type="text" id="date" name="date"><br>
			제목:<input type="text" id="title" name="title"><br>
			내용:<input type="text" id="content" name="content"><br>
			<button type="button" id="button">서버로 전송</button>
	
			
		
		
		
		
		</form> 
	</body>
</html>
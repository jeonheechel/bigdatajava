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
			var food_check = true;
			$("#food").change(function(){
				if(food_check==true){
					$("#u1 input").attr("checked",true);
					food_check = false;
				}else{
					$("#u1 input").attr("checked",false);
					food_check = true;
				}
			})

			

			var place_check = true;
			$("#place").change(function(){
				if(place_check==true){
					$("#u2 input").attr("checked",true);
					place_check = false;
				}else{
					$("#u2 input").attr("checked",false);
					place_check = true;
				}
			})
		});
		
		</script>
	</head>
	<body>
		<ul id="u1"><input type="checkbox" value="음식" id="food">음식
		<li><input type="checkbox" value="양파">양파</li>
		<li><input type="checkbox" value="감자">감자</li>
		<li><input type="checkbox" value="고구마">고구마</li>
	</ul>



	<ul id="u2"><input type="checkbox" value="장소" id="place">장소
		<li><input type="checkbox" value="공원">공원</li>
		<li><input type="checkbox" value="주차장">주차장</li>
		<li><input type="checkbox" value="놀이동산">놀이동산</li>
	</ul>
	</body>
</html>
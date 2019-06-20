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
				$("#form").submit(function(){
					var d = $(this).serialize();//자동으로 키:밸류형태를 만들어 주는거
					$.ajax({
						url: "member2.jsp",//요청하면 실행한 결과값을 준다
						data: d,
						success: function(result) {//()안의 값은 ajax통신이 성공하면 결과 값을 받아주는곳
								alert("ajax통신 성공2!!");
								$("#result").text(result);
						}

				});
					return false;


				});
			});
		
			
		</script>
	</head>
	<body>
			<div id="result"></div>

			<form action="" id="form">
				이름:<input type="text" name="name" value="hong gil dong"><br>
				
			<button type="submit" id="button">AJAX 통신</button>
		 </form>

	</body>
</html>
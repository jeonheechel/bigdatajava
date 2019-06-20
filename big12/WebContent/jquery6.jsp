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
						url: "member3.jsp",
						data: d,
						success: function(result) {//(안의 값은 ajax통신이 성공하면 값을 넣어주는곳)
								alert("ajax통신 성공3!!");//
								$("#result").text(result);//
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
				이름:<input type="text" name="id" ><br>
				
			<button type="submit" id="button">AJAX 통신</button>
		 </form>

	</body>
</html>
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
				$.ajax({
					url: "json/MOCK_DATA3.json",
					dataType: "json",
					success: function(result) {
							alert("json문서 연결 성공");
							var list = result;
							if(list.length > 0){
								$("#div").html("rank존재 확인!"+"<br>");
								$(list).each(function(index, member){//1번째 인덱스 2번째 그객체가 들어간다
									var id = member.id;
									var first_name = member.first_name;
									var last_name = member.last_name;
									var email = member.email;
									var gender = member.gender;
									var ip_address = member.ip_address;
									//$("#div").append(index +"-이름 : "+name+" <br>");
									//$("#div").append(index +"-연락처 : "+tel+" <br>");
									$.ajax({
										url: "quizjsondb.jsp",
										data: {
											"id" : id,
											"first_name" : first_name,
											"last_name" : last_name,
											"email" : email,
											"gender" : gender,
											"ip_address" : ip_address
										},
										success: function(){
											console.log("ok");
											
										}

									});

								});
							}
						}
					});
				});
			
		
		
		</script>
	</head>
	<body>
		인기검색어 순위
		<hr color="red">
			<div id="div">
				
			</div>


	
	</body>
</html>
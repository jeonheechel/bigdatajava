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
					url: "xml/dataset1.xml",
					dataType: "xml",
					success: function(result) {
							alert("xmlquiz문서 연결 성공");
							var list = result;
							if($(result).find("record").length > 0){
							$(result).find("record").each(function(){

							/*	alert($(this).find("name").text());
								alert($(this).find("tel").text());//창으로 띄우기*/
								var id = $(this).find("id").text();
								var first_name = $(this).find("first_name").text();
								$.ajax({
										url: "xmldb.jsp",
										data: {
											"id" : id,
											"first_name" : first_name
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
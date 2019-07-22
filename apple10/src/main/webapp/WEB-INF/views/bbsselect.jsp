<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- ajax CDN -->
<head><script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.4.1.min.js"></script></head>

<script type="text/javascript">
	
	$(function(){
		
		$("#btn1").click(function(){
			
			var d = $("#comment").serialize();
			$.ajax({
				url: "comment.do",
				data: d,
				success: function(result){
					alert("ajax 통신 완료!");
					alert(result);
					$("#datgle").append(result);
					
				}	//Success End
			})	//Ajax End
		})	//button End
	})	//JQuery End
		

</script>
</head>
<body>
	<h1>bbs select 페이지</h1>
	
	<table border="1" bordercolor="blue">
		<tr bordercolor="skyblue">
			<th width="100">아이디</th>
			<th width="100">제목</th>
			<th width="100">내용</th>
			<th width="100">작가</th>
		</tr>
		<tr bordercolor="red">
			<td>${bdto.id }</td>
			<td>${bdto.title }</td>
			<td>${bdto.content }</td>
			<td>${bdto.writer }</td>
		</tr>
	</table>
	<hr color="green">
		<form id="comment">
			작성자 : <input type="text" name="writer"><br>
			입력  : <input width="300" type="text" name="content">
			<input type="hidden" name="id" value="${bdto.id}">
			<button type="button" id="btn1">댓글달기</button>
		</form>
	<hr color="green">
	<ul>
		<c:forEach var="cdto" items="${clist}">
			<li type="none"><img src="resources/datgle.png" width="50" height="50">${cdto.writer } : ${cdto.content }</li>
		</c:forEach>
		<li type="none" id="datgle"></li>
	</ul>

</body>
</html>
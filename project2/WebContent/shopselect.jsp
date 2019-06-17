<%@page import="bean.StarDTO"%>
<%@page import="bean.StarDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8"> 
		<title>Insert title here</title> 
		<script type="text/javascript"> 
 
 			function update(){
	
 				document.choice.action="shopupdate.jsp"
	
 				document.choice.submit();
 				
		}	function del() {
			
				document.choice.action="shopdelete.jsp"
			
				document.choice.submit();
			
			
		}
 			
  
 		</script> 

		
	</head>
	
	<body>
	<jsp:useBean id="dto" class="bean.StarDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="dto"/>
	
	
	<%
		
		StarDAO dao = new StarDAO();
		StarDTO dto2 = dao.select(dto);
		
	%>
	
	검색결과 입니다
	<hr>
		<form name="choice">
		검색한 아이디 ID: <input type="text"  name="id" value=<%=dto2.getId() %> readonly="readonly"><!--  표현식--><br>
		수정할 STARNUM: <input type="text"  name="starnum" value=<%=dto2.getStarnum() %>><!--  표현식--><br>
		수정할 TOP: <input type="text" name="top" value=<%=dto2.getTop() %>><!--  표현식--><br>
		수정할 UNDER: <input type="text" name="under" value=<%=dto2.getUnder() %>><!--  표현식--><br>
		수정할 SHOES: <input type="text" name="shoes" value=<%=dto2.getShoes() %>><!--  표현식--><br>
		
		<button type="button" onclick="update()" class="btn btn-success">수정 요청</button> 
		<button type="button" onclick="del()"class="btn btn-danger">삭제 요청</button> 

 
		
		</form>
	
	</body>
</html>
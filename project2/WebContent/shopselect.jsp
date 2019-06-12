<%@page import="bean.StarDAO"%>
<%@page import="bean.StarDTO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type="text/javascript">

			function update() {

				document.choice.action="shopupdate.jsp"

				document.choice.submit();

			}

			function del() {

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
	
		if(dto2 != null){
	%>


			검색결과입니다.

			<hr color="red">

			<form name="choice">
				수정요청 ID <input type="text" name="id" value = <%= dto2.getId() %>><br>

				스타번호 수정 <input type="text" name="starnum" value =<%= dto2.getStarnum() %>><br>

				상의 수정 <input type="text" name="top" value = <%= dto2.getTop() %>><br>

				하의 수정 <input type="text" name="under" value = <%= dto2.getUnder() %>><br>

				신발 수정 <input type="text" name="shoes" value = <%= dto2.getShoes() %>><br>

				<button type="button" onclick="update()" class="btn btn-success">수정 요청</button>

				<button type="button" onclick="del()"class="btn btn-danger">삭제 요청</button>

			</form>
			
			<%  
		}else{
			out.print("그런 정보가 없습니다");
		}
			
			
			%>
		</body>

</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><!-- 지시자 라고한다 -->
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<c:set var="str" value="jspStudy :: the whole new world!!!"></c:set>
	<hr color="red">
	길이: ${fn:length(str)}<br>
	길이추출: ${fn:substring(str,0,8)}<br>
	글자이후추출: ${fn:substringAfter(str,"::")}<br>
	글자이전추출: ${fn:substringBefore(str,"::")}<br>
	
	글자대문자로추출: ${fn:toUpperCase(str)}<br>
	
	글자소문자추출: ${fn:toLowerCase(str)}<br>
	
	글자대체변환: ${fn:replace(str,"::","콜론")}<br>
	
	글자위치확인: ${fn:indexOf(str,"::")}<br>
	
	글자확인(있는지 없는지): ${fn:contains(str,"t")}<br>
	</body>
</html>
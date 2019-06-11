<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	요청방식:<%= request.getScheme()%><!-- 요청방식 --><br>
	이서버의 이름 :<%=request.getServerName() %><br>
	서버 아이피:<%=request.getLocalAddr() %><br>
	서버 포트:<%=request.getServerPort() %><br>
	클라이언트 포트:<%=request.getRemotePort() %><br>
	클라이언트호스트:<%=request.getRemoteHost() %><br>
	
	<hr>
	클라언트가 요청한 문서정보를 반환:<%=request.getRequestURI() %><br>
	클라언트가 요청한 문서정보를 반환 풀네임:<%=request.getRequestURL() %><br>
	컨텍스트 == 프로젝트(웹어플리케이션과  같은말이다) :<%=request.getContextPath() %><br>
	서비스를 처리하면서 사용되는 프로토콜의 구체적인 정보:<%=request.getProtocol() %><br>
	웹 어플리 케이션의 루트디렉터리를 기준으로 서블릿의 경로를 반환:<%=request.getServletPath() %><br>
	
	</body>
</html>
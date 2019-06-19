<%@page import="bean.MemberDAO"%>
<%@page import="bean.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="UTF-8">
      <title>Insert title here</title>
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
   </head>
   <body>
   <jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean>
      <jsp:setProperty property="*" name="dto"/>
      <%--  <%
      MemberDAO dao1 = new MemberDAO();
      dao1.insert(dto);
      
       //response.sendRedirect("login.html");
      %>  --%>
      
       <%
		String id = request.getParameter("id");
		MemberDAO dao = new MemberDAO();
		int re = dao.checkId(id);
		%>
		<%=re%>



      
      
       
   </body>
</html>
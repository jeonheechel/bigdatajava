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
       
     <%
      String sex = request.getParameter("sex");
      MemberDAO dao = new MemberDAO();
      dao.insert(dto);
      
      
     %>  
      




      
      
       
   </body>
</html>
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
<%
      MemberDAO dao = new MemberDAO();
      String id = request.getParameter("id");
      boolean result = dao.idCheck(id);
%>
<%
      if(result == true){
         out.print("입력하신 아이디는 "+id+"사용하실 수 없습니다.");
      }else{
         out.print("입력하신 "+id+"는 사용하실 수 있습니다.");
      } 
      
      
      
%>
     
      
      
       
   </body>
</html>
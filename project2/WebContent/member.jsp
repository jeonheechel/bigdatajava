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
      MemberDAO dao = new MemberDAO();
      dao.insert(dto);
      
       /*response.sendRedirect("login.html");  */
      %>
      <%
      
      String id = request.getParameter("id");
      int check = dao.idCheck(id);
      if(check == 1){%>
         <b><font color="red"><%= id %></font>는 이미 사용중인 아이디입니다.  </b>
        <form name="checkForm" method="post" action="member.html">
        <b>다른 아이디를 선택하세요.</b><br /><br />
        <input type="text" name="id">
        <input type="submit" value="ID중복확인">
        </form>       
       <%   
      } else{
      %><center>
   <b>입력하신<font color="red"><%= id %></font>는<br />
      사용하실 수 있는 ID입니다.</b><br /><br />
      <input type="button" value="닫기" onclick="setid()">      
      </center>
      <% }%>
      
      <script language="javascript">
         function setid() {
         opener.document.userinput.id.value="<%=id%>";
         self.close();
      }
      </script>
   </body>
</html>
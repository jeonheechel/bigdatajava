<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
      <head>
         <meta charset="UTF-8">
         <title>Insert title here</title>
      </head>
   <body>
      <%
         String id = request.getParameter("id");
         String pw = request.getParameter("pw");
         String name = request.getParameter("name");
         String tel = request.getParameter("tel"); 
         
         Class.forName("com.mysql.jdbc.Driver");
         out.print("드라이버 설정 ok..");
         String url = "jdbc:mysql://localhost:3306/bigdata";
         String user = "root";
         String password = "1234";
         
         
         /*insert문*/
         try{
         Connection con = DriverManager.getConnection(url, user, password);
         String sql = "insert into member values(?,?,?,?)";
         PreparedStatement ps = con.prepareStatement(sql);
         ps.setString(1, request.getParameter("id"));
         ps.setString(2, request.getParameter("pw"));
         ps.setString(3, request.getParameter("name"));
         ps.setString(4, request.getParameter("tel"));
         ps.executeUpdate();
         
         ps.close();
         con.close();
         }
         catch(SQLException e){
            out.print(e);
          }
         
         
         
         /* update문
         
         try{
         Connection con = DriverManager.getConnection(url, user, password);
         String sql = "update member set id=? where pw=?";
         PreparedStatement ps = con.prepareStatement(sql);
         ps.setString(1, request.getParameter("id"));
         ps.setString(2, request.getParameter("pw"));
         
         ps.executeUpdate();
         
         ps.close();
         con.close();
         }
         catch(SQLException e){
            out.print(e);
          }
          */
          
         /* 
         delete문
         
         try{
         Connection con = DriverManager.getConnection(url, user, password);
         String sql = "delete from member  where id=?";
         PreparedStatement ps = con.prepareStatement(sql);
         ps.setString(1, request.getParameter("id"));
         
         
         ps.executeUpdate();
         
         ps.close();
         con.close();
         }
         catch(SQLException e){
            out.print(e);
          }
          */
          
          
         /* 
         select
         
         ResultSet rs;
         
         Connection con = DriverManager.getConnection(url, user, password);
         String sql = "delete from member where=?";
         PreparedStatement ps = con.prepareStatement(sql);
         ps.setString(1, request.getParameter("id"));
         
         
         
         
         rs = ps.executeQuery();
         
         while (rs.next()) {
        	 out.write(rs.getString(1)+"");
        	 out.write(rs.getString(2)+"");
        	 out.write(rs.getString(3)+"");
        	 out.write(rs.getString(4)+"");
        	 
        	 
         }
         
        
         */
         
          
          
        
         
         
       
       
       
       
      %>
      
   </body>
</html>
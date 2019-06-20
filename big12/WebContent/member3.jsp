<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String dbId = "root";
	String id = request.getParameter("id");
	
	if(id.equals(dbId)){
		out.write("로그인 ok");	
	}else{
		out.write("로그인 not");	
	}

%>
package com.itbank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/member")
public class member extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String id;
	String pw;
	String admin;
       
    public member() {
    	
    }

	public void init(ServletConfig config) throws ServletException {
		admin = config.getInitParameter("admin");
		System.out.println("서블릿시작 "+admin);
		
		
	}

	public void destroy() {
		System.out.println("서블릿종료");
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		PrintWriter out = response.getWriter();
		out.println(" id : " + id);
		out.println(" pw : " + pw);
		out.println(" admin : " + admin);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

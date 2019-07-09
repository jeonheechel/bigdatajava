package com.itbank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Hi")
public class Hi extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String id;
	String pw;
	
	
       
    public Hi() {
    	System.out.println("Hi 기본 생성자 호출------------------------");
    }

	public void init(ServletConfig config) throws ServletException {
		id = config.getInitParameter("id");
		pw = config.getInitParameter("pw");
		System.out.println("Hi init 생성자 호출------------------------");
	}

	public void destroy() {
		System.out.println("Hi destory 생성자 호출------------------------");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("your id : " + id);
		out.println("your pw : " + pw);
		System.out.println("Hi doGet 생성자 호출------------------------");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

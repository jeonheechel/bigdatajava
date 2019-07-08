package bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/day.do")
public class MyDay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyDay() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String day = request.getParameter("day");
		String study = request.getParameter("study");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<h1 style='color : blue'>===========================================</h1>");
		out.print("<h1 style='color : red'>오늘은 "+day+"입니다</h1>");
		out.print("<h1 style='color : red'>나는 "+study+"를 배우는 중입나다</h1>");
		out.print("<h1 style='color : blue'>===========================================</h1>");
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

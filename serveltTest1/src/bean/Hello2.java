package bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/hi")//스프링에서 가장 중요한거다 기호의 이름은 @표시 표기라는 거다
public class Hello2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Hello2() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* System.out.println("Get 요청 됨"); */
		process(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* System.out.println("Post 요청 됨"); */
		process(request,response);
	}
	
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("type/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title></head></title>");
		out.println("<body>");
		out.println("<h1>hi....</h1>");
		out.println("<h2>hi2....</h2>");
		out.print("</body>");
		out.print("</html>");
	}

}

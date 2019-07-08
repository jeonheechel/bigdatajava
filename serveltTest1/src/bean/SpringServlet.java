package bean;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/spring")//스프링에서 가장 중요한거다 기호의 이름은 @표시 표기라는 거다
public class SpringServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SpringServlet() {
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
		System.out.println("Spring 클라이언트가 요청함...");
	}

}

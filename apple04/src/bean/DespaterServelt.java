package bean;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/")//이게 어노테이션이다 이거랑 서블릿이 겹치면 망한다
public class DespaterServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DespaterServelt() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get요청");
		String uri = request.getRequestURI();
		System.out.println(uri);
		String path = uri.substring(uri.lastIndexOf("/"));
		System.out.println(path);
		if(path.equals("/start.do")) {
			System.out.println("시작하는 컨트롤러 메소드 호출");
		}else if(path.equals("/bye.do")) {
			System.out.println("끝내는 컨트롤러 메소드 호출");
		}else {
			System.out.println("처리할수 있는 컨트롤러가 없음");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

package helloWorld;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



//1.HttpSerevlet 상속
//2. doGet,doPost 메서드 오버라이드 
//3. 메서드 내부 내용 기술
//4. Servlet 등록(web.xml)
//5. 등록된 서블릿 매핑(web.xml)
//6. 실행(서버 실행 후 > url 직접 입력)
//7. helloWorld 자바프로젝트 우클릭 후 run as -> run on server
public class HelloWorld extends HttpServlet{
	   @Override
	   public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	      // TODO Auto-generated method stub
	      resp.getWriter().print("<h1>hello World</h1>");
	      resp.getWriter().print("<h1>hello World</h1>");
	      resp.getWriter().print("<h1>hello World</h1>");
	      resp.getWriter().print("<h1>hello World</h1>");
	   }
	   
	}
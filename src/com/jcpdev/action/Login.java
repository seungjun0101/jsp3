package com.jcpdev.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspWriter;
import javax.xml.ws.Response;


//서블릿은 http 요청을 처리하는 자바 클래스입니다. HttpServlet을 상속받습니다.
public class Login extends HttpServlet {
	
	private static final long SerialVersionUID = 1L;
	
	//요청 Method가 Get일 때 처리되는 메소드 : 메소드 매개변수 타입 , req,resp을 인자로 요청이 들어오면 생성되는 객체 전달 받습니다.
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//request,response 외의 JSP 내장객체는 모두 선언해서 사용해야 합니다.
		//JSP내장객체 out을 선언합니다.
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter(); //JspWriter의 부모 PrintWriter 타입으로 선언. 위의 2개 resp set필요
	
		out.print("<h>JSP와 서블릿</h>");
		out.print("서블릿 너는 무엇이냐?");
	}
	
	//요청 Method가 Post일 때 처리되는 메소드
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}

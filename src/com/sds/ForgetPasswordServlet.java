package com.sds;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForgetPasswordServlet extends HttpServlet {
	
	public ForgetPasswordServlet(){
		System.out.println("I am in ForgetPasswordServlet Constructor.....................");
	}
	
	@Override
	public void init() throws ServletException {
		//destroy();
		System.out.println("I am in ForgetPasswordServlet init method........................");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("I am in ForgetPasswordServlet init method with one parameter........................");
		
		String cityName=config.getInitParameter("city");
		System.out.println("cityName>ForgetPasswordServlet> "+cityName);
		
		ServletContext ctx=config.getServletContext();
		String countryName=ctx.getInitParameter("country");
		System.out.println("countryName>ForgetPasswordServlet>"+ countryName);
		
	}
	
	@Override
	public void destroy() {
		System.out.println("I am in ForgetPasswordServlet destroy method........................");
	}
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//destroy();
		//Class.forName("LoginServlet").newInstance();
		System.out.println("I am in ForgetPasswordServlet service");
		
		
		//navigation to other pages
		RequestDispatcher rd =null;
		rd = req.getRequestDispatcher("login.jsp");
	
		rd.forward(req, resp);
	}
}
 
package com.sds;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	public LoginServlet(){//must be public...no arguments
		System.out.println("I am in LoginServlet Constructor.................");
	}
	
	@Override
	public void init() throws ServletException {
		//destroy();
		System.out.println("I am in LoginServlet init method..................");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("I am in LoginServlet init method with one parameter.................");
		
		String cityName=config.getInitParameter("city");
		System.out.println("cityName>> "+cityName);
		
		ServletContext ctx=config.getServletContext();
		String countryName=ctx.getInitParameter("country");
		System.out.println("countryName>>"+ countryName);
		
	}
	
	@Override
	public void destroy() {
		System.out.println("I am in LoginServlet destroy method.....................");
	}
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//destroy();
		//Class.forName("LoginServlet").newInstance();
		System.out.println("I am in LoginServlet service");
		
		//GET DATA
		String un = req.getParameter("uname");
		System.out.println("Username >>"+un);
		
		//Processing of data
		boolean isCorrect=false;
		if("sds".equals(un)) {
			ArrayList<String> al=new ArrayList<>();//DB call from here
			al.add("amol");
			al.add("swapnil");
			al.add("sarthak");
			req.setAttribute("data", al);
			isCorrect=true;
		}
		
		//navigation to other pages
		RequestDispatcher rd =null;
		if(isCorrect) {
			rd = req.getRequestDispatcher("inbox.jsp");
		}else {
			req.setAttribute("msg","wrong password......");
			rd = req.getRequestDispatcher("login.jsp");
		}
		
		rd.forward(req, resp);
	}
}

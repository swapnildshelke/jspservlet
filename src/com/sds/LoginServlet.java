package com.sds;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Class.forName("LoginServlet").newInstance();
		System.out.println("I am in service");
		//GET DATA
		String un = req.getParameter("uname");
		System.out.println("Username >>"+un);
		
		//Processing of data
		boolean isCorrect=false;
		if("sds".equals(un)) {
			isCorrect=true;
		}
		
		//navigation to other pages
		RequestDispatcher rd =null;
		if(isCorrect) {
			 rd = req.getRequestDispatcher("inbox.html");
		}else {
			 rd = req.getRequestDispatcher("login.html");
		}
		
		rd.forward(req, resp);
	}
}

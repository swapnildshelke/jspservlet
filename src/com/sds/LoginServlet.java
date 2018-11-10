package com.sds;

import java.io.IOException;
import java.util.ArrayList;

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

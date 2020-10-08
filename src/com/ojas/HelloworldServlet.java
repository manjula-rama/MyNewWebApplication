package com.ojas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloworldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   // private String msg;
	private int a,b;
    public HelloworldServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		//msg="hello world";
		a=5;
		b=75;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw =response.getWriter();
		//pw.println("<h1 style=color:blue;>"+msg+"</h1>");
		int c=a+b;
		pw.println("<b>"+c+"</b>");
		
	}

}

package com.ojas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeDemo
 */
public class PrimeDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimeDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");;
		PrintWriter pw= response.getWriter();
		pw.println("<form action=PrimeDemo method=POST>");
		pw.println("<table border=2>");
		pw.println("<tr><td colspan=2>enter a number</td></tr>");
		
		pw.println("<td><input type=text name=num></td></tr");
		pw.println("<tr><td colspan=2><input type=submit value=check></td></tr></table></form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw= response.getWriter();
		int num=Integer.parseInt(request.getParameter("num"));
		int i=2,flag=0;
		while(i<num) {
			if(num % i == 0) {
				flag++;
				break;
				
			}
			i++;
		}
		if(flag==0) {
			pw.println("<h1 style=color:green>"+num+" is prime</h1>");
		
	}
		else {
			pw.println("<h1 style=color:green>"+num+" is not prime</h1>");
			
		}

	}
}

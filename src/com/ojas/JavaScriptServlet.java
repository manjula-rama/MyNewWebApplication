package com.ojas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JavaScriptServlet
 */
public class JavaScriptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JavaScriptServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("s1");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("s1");
		if(name.equalsIgnoreCase("Andhrapradesh")) {
			pw.println("<h1>your state is"+name+"</h1>");
		}
		else if(name.equalsIgnoreCase("Telangana")) {
			pw.println("<h1>your state is"+name+"</h1>");
		}

	}
	}



package com.ojas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextDemo1
 */
public class ContextDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ServletContext ctx = null;
    public ContextDemo1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		ctx=config.getServletContext();
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");;
		PrintWriter pw = response.getWriter();
		ctx.setAttribute("goldrate",40000.00);
		pw.println("<h1 style=color:red>gold rate is"+ctx.getAttribute("goldrate")+"<br>");
		pw.println("srvlet version :"+ctx.getMajorVersion()+"."+ctx.getMinorVersion());
	}

}

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
 * Servlet implementation class ServletDemo
 */
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   ServletContext ctx = null;
    public ServletDemo() {
        super();
        
    }
public void init(ServletConfig config) throws ServletException {
		ctx=config.getServletContext();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String dname=ctx.getInitParameter("dname");
		String url=ctx.getInitParameter("url");
		String user=ctx.getInitParameter("user");
		String password=ctx.getInitParameter("password");
		String res="driver name="+dname+"<br>";
				res+="URL="+url+"<br>";
				res+="user="+user+"<br>";
				res+="password="+password+"<br>";
		pw.println(res);
	}

}

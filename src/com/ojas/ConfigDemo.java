package com.ojas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       String cnames="";
    public ConfigDemo() {
        super();
        }
    public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		cnames=config.getInitParameter("cname");
	}
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<form action=ConfigDemo method=Post>");
		String cns[]=cnames.split(",");
		pw.println("<table align=center cellpadding=20 border=2 bgcolor=yellow");
		pw.println("<tr><td>select course name:</td><td>");
		pw.println("<select name=cname>");
		for(String x:cns) {
			pw.println("<option>"+x+"</option>");
		}
		pw.println("</select></td></tr><tr><td colspan=2 align=center><input type=submit value=register></td></tr>");
		pw.println("</table></form>");
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");;
		PrintWriter pw=response.getWriter();
		String cnames[]= {"java",".net","testing","php"};
		double prices[]= {20000.00,15000.00,8000.00,7000.00};
		String cname=request.getParameter("cname");
		int ind=0;
		for(int i=0;i<cnames.length;i++) {
			if(cnames[i].contentEquals(cname)) {
				ind =i;
			}
		}
		pw.println("<h1 style=color:green>registration is successful");
		pw.println("your selected course is "+cname+"<br>");
		pw.println("you need to pay "+prices[ind]+"<br>");
		pw.println("thank you</h1>");
	}

}

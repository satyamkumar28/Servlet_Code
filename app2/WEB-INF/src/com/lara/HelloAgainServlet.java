package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class HelloAgainServlet extends HttpServlet{
	public void service(HttpServletRequest r1,HttpServletResponse r2)throws ServletException,IOException{
		
		PrintWriter out=r2.getWriter();
		out.println("Hello World");
		out.println("Hello World");	
	}

}

package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet1 extends HttpServlet{

    public void service(HttpServletRequest r1,HttpServletResponse r2) throws ServletException ,IOException{

        String s1=r1.getParameter("param1");
        String s2=r1.getParameter("param2");
        PrintWriter out=r2.getWriter();

        out.println("Parameter1:" +s1);
        out.println("Parameter2:" +s2);
        
    }

}
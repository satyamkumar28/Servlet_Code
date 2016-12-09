package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet1 extends HttpServlet{

    public void service(HttpServletRequest r1, HttpServletResponse r2)throws ServletException,IOException{

        String s1=r1.getParameter("param1");
        String s2=r1.getParameter("param2");
        String s3=r1.getParameter("param3");
        String s4=r1.getParameter("param4");
        String s5=r1.getParameter("param5");
        String s6=r1.getParameter("param6");

        PrintWriter out =r2.getWriter();
        out.println("param1"+s1);
        out.println("param2"+s2);
        out.println("param3"+s3);
        out.println("param4"+s4);
        out.println("param5"+s5);
        out.println("param6"+s6);
        
    }
}
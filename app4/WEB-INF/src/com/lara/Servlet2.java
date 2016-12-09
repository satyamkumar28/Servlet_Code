package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet2 extends HttpServlet{

    public void service(HttpServletRequest r1,HttpServletResponse r2) throws ServletException,IOException{

        String s1 = r1.getParameter("number1");
        String s2 = r1.getParameter("number2");

        int num1=Integer.parseInt(s1);
        int num2=Integer.parseInt(s2);
        
        PrintWriter out = r2.getWriter();

        out.println("Number1:" +num1);
        out.println("Number2:" +num2);
        out.println("Add Two Number:" + (num1+num2));
    }
}
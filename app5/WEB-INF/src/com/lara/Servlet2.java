package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Servlet2 extends HttpServlet{

    public void service(HttpServletRequest r1,HttpServletResponse r2)throws ServletException ,IOException{

        String s1 = r1.getParameter("param1");
        String[] s2 = r1.getParameterValues("param2");
        String[] s3 = r1.getParameterValues("param3");
        

        PrintWriter out = r2.getWriter();
        out.println("Parameter1:"+s1);
        out.println("Parameter2:"+Arrays.toString(s2));
        out.println("Parameter3:"+Arrays.toString(s3));
    }
}
package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet7 extends HttpServlet{

    public void service(HttpServletRequest r1,HttpServletResponse r2) throws ServletException,IOException{

        String s1=r1.getParameter("num1");
        String s2=r1.getParameter("num2");
        String s3=r1.getParameter("operator");

        int num1=Integer.parseInt(s1);
        int num2=Integer.parseInt(s2);
        

        PrintWriter out =r2.getWriter();
        out.println("First Number:"+num1);
        out.println("Second Number:"+num2);
        
        if(s3.equals("add")){
            out.println("Add Number:"+(num1+num2));
        }
        if(s3.equals("sub")){
            out.println("Add Number:"+(num1-num2));
        }
        if(s3.equals("multi")){
            out.println("Add Number:"+(num1*num2));
        }
        if(s3.equals("div")){
            out.println("Add Number:"+(num1/num2));
        }
    }
   /* private int sum(int a, int b){
        
        return (a+b);

    }
    
    private int sub(int a, int b){
        
        return (a-b);
    }
    
    private int multi(int a, int b){
        
        return (a*b);
    }
    
    private int div(int a, int b){
        
        return (a/b);
    }*/
}
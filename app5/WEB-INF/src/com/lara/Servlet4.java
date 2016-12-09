package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Servlet4 extends HttpServlet{

    public void service(HttpServletRequest r1, HttpServletResponse r2)throws ServletException,IOException{

        String s1=r1.getParameter("fName");
        String s2=r1.getParameter("lName");
        String s3=r1.getParameter("loName");
        String s4=r1.getParameter("address");
        String s5=r1.getParameter("gender");
        String[] s6=r1.getParameterValues("skill");
        String[] s7=r1.getParameterValues("edu");
        String s8=r1.getParameter("mobile");
        String s9=r1.getParameter("email");
        String s10=r1.getParameter("email1");
        String s11=r1.getParameter("dob");
        String s12=r1.getParameter("yop");

       
        FileWriter fw=new FileWriter("/home/titi/Desktop/file1.txt");
        
        
         
        PrintWriter out =r2.getWriter();
        DataInpueStream ds=new 
        out.println("First Name:"+s1);
        out.println("Last Name:"+s2);
        out.println("Lover Name:"+s3);
        out.println("Address:"+s4);
        out.println("Gender:"+s5);
        out.println("Skill"+Arrays.toString(s6));
        out.println("Education:"+Arrays.toString(s7));
        out.println("Mobile Number:"+s8);
        out.println("Email:"+(s9+s10));
        out.println("DATE OF BIRTH:"+s11);
        out.println("YEAR OF PASSING:"+s12);
        
        
    }
}
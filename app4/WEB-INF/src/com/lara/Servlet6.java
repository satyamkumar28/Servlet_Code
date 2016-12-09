package  com.lara;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet6 extends HttpServlet{

    public void service(HttpServletRequest r1,HttpServletResponse r2)throws ServletException ,IOException{

        String s1 =r1.getParameter("name1");
        String s2 = r1.getParameter("name2");

        String s3=new StringBuffer(s2).reverse().toString();
        
        PrintWriter out = r2.getWriter();

        out.println("Name1:"+s1);
        out.println("Name2:"+s2);

        out.println("Compare:"+(s1.equals(s3)));
    }
}
package pack1;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet4 extends HttpServlet{

    public void service(HttpServletRequest r1,HttpServletResponse r2) throws ServletException,IOException{

        String s1=r1.getParameter("number");
        int i =Integer.parseInt(s1);
        int factValue=1;
        
        for(int j=1;j< i;j++ ){

            factValue*=i;
        }
        PrintWriter out = r2.getWriter();
        out.println("number is:"+ i);
        out.println("factorial is :"+factValue);
                
    }
   
}
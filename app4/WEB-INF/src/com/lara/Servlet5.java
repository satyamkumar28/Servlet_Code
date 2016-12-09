package  com.lara;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet5 extends HttpServlet{

    public void service(HttpServletRequest r1,HttpServletResponse r2)throws ServletException ,IOException{

        String s1 =r1.getParameter("num1");
        String s2 = r1.getParameter("num2");

        int num1=Integer.parseInt(s1);
        int num2=Integer.parseInt(s2);

        PrintWriter out = r2.getWriter();

        out.println("NumberRows:"+num1);
       out.println("Number2:"+num2);

        for(int i=1;i<=num1;i++){
            for(int j=1;j<=i;j++){
                out.println("+");
            }
            out.println();
        }
    }
}
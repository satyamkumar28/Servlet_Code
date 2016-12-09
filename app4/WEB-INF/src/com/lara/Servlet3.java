package  com.lara;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet3 extends HttpServlet{

    public void service(HttpServletRequest r1,HttpServletResponse r2)throws ServletException ,IOException{

        String s1 =r1.getParameter("firstName");
        String s2 = r1.getParameter("lastName");

        PrintWriter out = r2.getWriter();

        out.println("FirstName:"+s1);
        out.println("LastName:"+s2);

        out.println("FullName:"+(s1+s2));
    }
}
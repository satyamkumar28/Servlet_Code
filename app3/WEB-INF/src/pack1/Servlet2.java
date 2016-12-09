package pack1;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet2 extends HttpServlet{

    public void service(HttpServletRequest r1, HttpServletResponse r2) throws ServletException,IOException{

        String s1=r1.getParameter("param1");
        PrintWriter out = r2.getWriter();
        out.println("param1 value:" +s1);
    }
}
package pack1;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet3 extends HttpServlet{

    public void service(HttpServletRequest r1,HttpServletResponse r2) throws ServletException,IOException{

        String s1=r1.getParameter("param2");
        PrintWriter out=r2.getWriter();
        out.println("String:"+s1);
        StringBuffer s2=new StringBuffer(s1);
        out.println("Reverse String:"+s2.reverse());
        
        // String s2=new StringBuffer(s1).reverse().toString();
        /*
            String s2 =revrse(s1);
            }
            Private String reverse(String s1){

                if(s1.length()==0){
                    return "";
                }
                return s1.charAt(s1.length()-1)+ reverse(s1.subString(0));
            }
        */
    }
}
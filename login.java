package logbean;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

@WebServlet("/login")
public class login extends HttpServlet {

   private static int cookieCount;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            PrintWriter writer = response.getWriter();
        String name = "Username";
        String value = request.getParameter("userName");
        Cookie cookie = new Cookie(name, value);       
         
        response.addCookie(cookie);
       
        Cookie[] cookies = request.getCookies();
        
        ServletContext sc = getServletContext(); 
        if (cookies == null) {
            writer.println("No users found");
        } else {
          
            for (Cookie aCookie : cookies) {
                String retVal = request.getParameter("userName");
                if(retVal.equals("admin")) {
                   
                   sc.getRequestDispatcher("/hello.html").forward(request, response);
                } else {
                    sc.getRequestDispatcher("/index.html").forward(request, response);
                 
                
            }
        }
        }
    }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }
    

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

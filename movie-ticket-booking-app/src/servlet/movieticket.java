package servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns ="/book")
public class movieticket extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        String contact= servletRequest.getParameter("contact");
        long phn=0;
        if(contact!=null){
            phn=Long.parseLong(contact);
        }
        String noticket=servletRequest.getParameter("noticket");
        int ticket=0;
        if(noticket!=null){
            ticket=Integer.parseInt(noticket);
        }
        String price=servletRequest.getParameter("price");
        int rate=1;
        if(price!=null){
            ticket=Integer.parseInt(price);
        }
        int total=rate*ticket;

        servletResponse.setContentType("text/html");
        PrintWriter writer= servletResponse.getWriter();
        writer.println("<h1>Thank you for booking </h1>");
        writer.println("<h2>Your payable amount is </h2>" + total);
    }
}
package servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/contact")
public class ContactServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String message = req.getParameter("message");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<html><body style='font-family: Arial; background-color:#f5f5f5; padding: 20px;'>");
        out.println("<h2>Thank You for Contacting Us!</h2>");
        out.println("<p><strong>Name:</strong> " + name + "</p>");
        out.println("<p><strong>Email:</strong> " + email + "</p>");
        out.println("<p><strong>Message:</strong> " + message + "</p>");
        out.println("<hr>");
        out.println("<a href='index.html'><button class='btn btn-danger'>Logout</button></a>");
        out.println("</body></html>");
    }
}

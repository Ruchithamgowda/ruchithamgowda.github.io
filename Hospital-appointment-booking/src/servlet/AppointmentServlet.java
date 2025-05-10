package servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/appointment")
public class AppointmentServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String fname = req.getParameter("fname");
        String lname = req.getParameter("lname");
        String email = req.getParameter("email");
        String age = req.getParameter("age");
        String address = req.getParameter("address");
        String gender = req.getParameter("gender");
        String sickness = req.getParameter("sickness");
        String mobile = req.getParameter("mobile");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<html><body style='background-color:#f0fff0; font-family: Arial; padding:20px;'>");
        out.println("<h2>Appointment Details</h2>");
        out.println("<p><strong>Name:</strong> " + fname + " " + lname + "</p>");
        out.println("<p><strong>Email:</strong> " + email + "</p>");
        out.println("<p><strong>Age:</strong> " + age + "</p>");
        out.println("<p><strong>Gender:</strong> " + gender + "</p>");
        out.println("<p><strong>Address:</strong> " + address + "</p>");
        out.println("<p><strong>Sickness:</strong> " + sickness + "</p>");
        out.println("<p><strong>Mobile:</strong> " + mobile + "</p>");

        out.println("<hr>");
        out.println("<a href='appointment.html'><button class='btn btn-success'>Book Another Appointment</button></a> ");
        out.println("<a href='index.html'><button class='btn btn-danger'>Logout</button></a>");
        out.println("</body></html>");
    }
}

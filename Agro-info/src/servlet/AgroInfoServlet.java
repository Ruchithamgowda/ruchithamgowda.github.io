package servlet;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import java.net.URLEncoder;

@WebServlet(urlPatterns = "/info")
public class AgroInfoServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name = servletRequest.getParameter("name");
        String contact = servletRequest.getParameter("contact");
        String email = servletRequest.getParameter("email");
        String region = servletRequest.getParameter("region");
        String soil = servletRequest.getParameter("soil");
        String crop = servletRequest.getParameter("crop");
        String seed = servletRequest.getParameter("seed");
        String acresStr = servletRequest.getParameter("acres");

        double acres = 0;
        if (acresStr != null && !acresStr.isEmpty()) {
            acres = Double.parseDouble(acresStr);
        }

        double rate = 5000.0; // Default rate per acre
        double total = acres * rate;

        // Google Search URL encoding
        String cropQuery = URLEncoder.encode(crop + " crop water, chemicals, and soil type info", "UTF-8");
        String soilQuery = URLEncoder.encode("which crops grow well in " + soil + " soil", "UTF-8");
        String seedQuery = URLEncoder.encode(seed + " seed suitable soil and growth info", "UTF-8");

        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();

        writer.println("<html><body style='font-family: Arial; background-color: #f0f8ff; padding: 20px;'>");

        writer.println("<h1>Thank you, Agro-Info!</h1>");
        writer.println("<h2>You've selected crop: " + crop + "</h2>");
        writer.println("<h3>Total estimated cost for " + acres + " acres is: ₹" + total + "</h3>");
        writer.println("<p>We will email suggestions to: <strong>" + email + "</strong></p>");

        writer.println("<hr>");
        writer.println("<h3>Explore More Details:</h3>");
        writer.println("<ul>");
        writer.println("<li><a href='https://www.google.com/search?q=" + cropQuery + "' target='_blank'>Crop Info: Water & Chemical usage</a></li>");
        writer.println("<li><a href='https://www.google.com/search?q=" + soilQuery + "' target='_blank'>Soil Info: Best Crops for " + soil + " soil</a></li>");
        writer.println("<li><a href='https://www.google.com/search?q=" + seedQuery + "' target='_blank'>Seed Info: Growth conditions</a></li>");
        writer.println("</ul>");

        writer.println("</body></html>");
    }
}

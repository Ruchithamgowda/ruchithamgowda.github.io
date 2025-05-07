package com.java.serv;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/volleyball", loadOnStartup = 1)
public class VolleyBallServlet extends GenericServlet {

    public VolleyBallServlet() {
        System.out.println(" VolleyBallServlet initialized – getting ready to serve!");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println(" VolleyBallServlet in action – the rally has begun!");
    }
}

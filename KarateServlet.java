package com.java.serv;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/karate", loadOnStartup = 1)
public class KarateServlet extends GenericServlet {

    public KarateServlet() {
        System.out.println(" KarateServlet constructor: Getting into the fighting stance!");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println(" KarateServlet service: Ready to unleash the knockout punch!");
    }
}

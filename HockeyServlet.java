package com.java.serv;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/hockey", loadOnStartup = 1)
public class HockeyServlet extends GenericServlet {

    public HockeyServlet() {
        System.out.println("HockeyServlet constructor called");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("Handling request in HockeyServlet");
    }
}

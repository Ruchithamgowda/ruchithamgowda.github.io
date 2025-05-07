package com.java.serv;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/cricket", loadOnStartup = 1)
public class CricketServlet extends GenericServlet {

    public CricketServlet() {
        System.out.println("CricketServlet constructor called");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("CricketServlet is handling the request");
    }
}

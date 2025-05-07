package com.java.serv;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/badminton", loadOnStartup = 1)
public class BadmintonServlet extends GenericServlet {

    public BadmintonServlet() {
        System.out.println(" BadmintonServlet constructor: Shuttle is up!");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println(" BadmintonServlet service: Smashing into the game!");
    }
}

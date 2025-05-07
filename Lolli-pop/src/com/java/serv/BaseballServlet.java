package com.java.serv;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/baseball", loadOnStartup = 1)
public class BaseballServlet extends GenericServlet {

    public BaseballServlet() {
        System.out.println("BaseballServlet constructor: Batter steps up to the plate!");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("BaseballServlet service: Fastball delivered down the middle!");
    }
}

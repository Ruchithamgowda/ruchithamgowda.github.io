package com.java.serv;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/football", loadOnStartup = 1)
public class FootBallServlet extends GenericServlet {

    public FootBallServlet() {
        System.out.println(" FootBallServlet initialized – gearing up for the kickoff!");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("FootBallServlet is processing – the match is live!");
    }
}

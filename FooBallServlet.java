package com.java.serv;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/fooball", loadOnStartup = 1)
public class FooBallServlet extends GenericServlet {

    public FooBallServlet() {
        System.out.println("FooBallServlet constructor: Entering FooBall mode!");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println(" FooBallServlet service: FooBall challenge accepted!");
    }
}

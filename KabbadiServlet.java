package com.java.serv;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/kabbadi", loadOnStartup = 1)
public class KabbadiServlet extends GenericServlet {

    public KabbadiServlet() {
        System.out.println(" KabbadiServlet constructor: Player entered the arena!");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println(" KabbadiServlet service: Defenders on alert!");
    }
}

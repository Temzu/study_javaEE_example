package com.temzu.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ForwardServlet", urlPatterns = "/forward")
public class ForwardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // обратите внимание, что здесь указывается имя сервлета
        getServletContext().getRequestDispatcher("/index.html")
                .forward(req, resp);
        String str = "dfsf";
    }
}

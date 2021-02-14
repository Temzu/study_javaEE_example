package com.temzu.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "IncludeServlet", urlPatterns = "/include")
public class IncludeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //запрашиваем текущую сессию или создаем новую
//        HttpSession sessionObj = req.getSession(true);
//        // устанавливаем время жизни сессии сек.
//        sessionObj.setMaxInactiveInterval(10 * 60);
        getServletContext().getRequestDispatcher("/header.html").include(req, resp);
        resp.getWriter().write("<p>Response body from servlet</p>");
        getServletContext().getRequestDispatcher("/footer.html").include(req, resp);
    }
}

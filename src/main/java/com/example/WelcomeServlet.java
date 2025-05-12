package com.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class WelcomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Chào mừng đến với WelcomeServlet!</h1>");
    }
}

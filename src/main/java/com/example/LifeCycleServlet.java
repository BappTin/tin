package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/lifecycle")
public class LifeCycleServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("=> LifeCycleServlet: init()");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("=> LifeCycleServlet: doGet()");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h2>Đây là LifeCycleServlet đang xử lý!</h2>");
    }

    @Override
    public void destroy() {
        System.out.println("=> LifeCycleServlet: destroy()");
    }
}

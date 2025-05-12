package com.example;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet(
        name = "LoginServlet",
        urlPatterns = {"/login"},
        initParams = {
                @WebInitParam(name = "welcomeMessage", value = "Chào mừng bạn đến với hệ thống!")
        }
)
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // Lấy thông điệp động từ initParams
        String message = getServletConfig().getInitParameter("welcomeMessage");

        // Thiết lập loại dữ liệu trả về là HTML
        resp.setContentType("text/html");

        // In ra thông điệp động
        PrintWriter out = resp.getWriter();
        out.println("<h1>" + message + "</h1>");
    }
}

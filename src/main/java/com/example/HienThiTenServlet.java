package com.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class HienThiTenServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Đặt kiểu nội dung trả về là text/html
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Họ và tên của tôi là: NGUYEN HUU GIA HUY</h1>");
    }
}

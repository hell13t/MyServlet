package com.example.myservlet;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/user")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String name = request.getParameter("name");
        String position = request.getParameter("position");

        response.getWriter().println("Employee name: " + name + ", position: " + position);

    }

    public void destroy() {
    }
}
package com.example.Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        HttpServletRequest request = (HttpServletRequest) req;
//        HttpServletResponse response = (HttpServletResponse) res;

        PrintWriter out = resp.getWriter();

        String name = req.getParameter("name");
        String password = req.getParameter("password");

        if (password.equals("123")) {
            HttpSession session = req.getSession();
            session.setAttribute("name", name);
            resp.sendRedirect("profileServlet");
        } else {
            out.print("Wrong username or password!");
            resp.sendRedirect("login.jsp");
        }
        out.close();
    }
}

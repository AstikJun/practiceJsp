package com.example.Servlets;

import com.example.utils.Validate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        HttpServletRequest request = (HttpServletRequest) req;
//        HttpServletResponse response = (HttpServletResponse) res;
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        String username = req.getParameter("username");
        String password = req.getParameter("pass");
        System.out.println(password);
        if (Validate.checkUser(username,password)) {
            HttpSession session = req.getSession();
            session.setAttribute("username", username);
            System.out.println("True");
            resp.sendRedirect("/secured/profileServlet");
        } else {
            System.out.println("false");
            out.print("Wrong password or login");
            resp.sendRedirect("/");
        }
        out.close();
    }
}

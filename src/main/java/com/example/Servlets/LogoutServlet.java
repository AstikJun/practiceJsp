package com.example.Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/logoutServlet")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html");
//        PrintWriter out = resp.getWriter();

//        HttpSession session=req.getSession(false);
//        if (session == null || session.getAttribute("name") == null) {
//            resp.sendRedirect("login.jsp");
//        } else {
//
//            session.invalidate();
//            out.print("\nYou are logged out");
//
//        }



        //out.close();
    }
}

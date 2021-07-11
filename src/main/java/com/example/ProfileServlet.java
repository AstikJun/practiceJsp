package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/profileServlet")
public class ProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        req.getRequestDispatcher("link.jsp").include(req, resp);

        HttpSession session=req.getSession(false);
        if(session!=null){
            String name=(String)session.getAttribute("name");

            out.println("Hello, "+name);
            out.println("Welcome to Profile");

        }
        else{
            out.print("Please login first");
            req.getRequestDispatcher("login.jsp").include(req, resp);
        }
        out.close();
    }
}

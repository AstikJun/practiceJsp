package com.example.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

@WebFilter("/servletFilter")
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        PrintWriter out = res.getWriter();

        String name = req.getParameter("name");
        String password = req.getParameter("password");

        if(password.equals("123")){
            HttpSession session = request.getSession();
            session.setAttribute("name", name);
            response.sendRedirect("profileServlet");
        }
        else {
            response.sendRedirect("login.jsp");
        }
    }

    @Override
    public void destroy() {

    }
}

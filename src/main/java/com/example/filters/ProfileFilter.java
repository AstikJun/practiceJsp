package com.example.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/profileFilter")
public class ProfileFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        PrintWriter out=res.getWriter();


        HttpSession session=request.getSession(false);
        if (session == null || session.getAttribute("name") == null) {
            response.sendRedirect("login.jsp");
        } else {
            String name=(String)session.getAttribute("name");
            response.sendRedirect("profile.jsp");
        }
    }

    @Override
    public void destroy() {

    }
}

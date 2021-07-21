package com.example.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/secured/*")
public class ProfileFilter implements Filter {


    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        System.out.println("Start Filter");


        HttpSession session = request.getSession(false);



        if (session != null && session.getAttribute("username") != null) {
          //  ((HttpServletResponse) res).sendRedirect("profile.jsp");
            filterChain.doFilter(request, response);
        } else {
            response.sendRedirect("/login.jsp");
        }
    }


}



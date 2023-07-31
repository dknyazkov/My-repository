package org.example;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
UserService userService=new UserService();
        String login = request.getParameter("Login");
        String password = request.getParameter("Password");

        try {
            userService.checkPassword(login,password);
            chain.doFilter(request,response);
        }
        catch (RuntimeException runtimeException)
        {
            request.getRequestDispatcher("/").forward(request,response);
        }
    }
        @Override
        public void destroy () {

        }
    }


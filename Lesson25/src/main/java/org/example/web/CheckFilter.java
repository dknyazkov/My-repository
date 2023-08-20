package org.example.web;

import org.example.exceptions.ClientNotFoundException;
import org.example.service.ClientService;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
@WebFilter("/")
public class CheckFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        ClientService clientService = new ClientService();
        String login = request.getParameter("login");
        String password = request.getParameter("password");


        try {
            clientService.checkPassword(login, password);
            chain.doFilter(request, response);
        } catch (ClientNotFoundException cl) {
            throw new ClientNotFoundException("Client or password is wrong");
        }
    }

    @Override
    public void destroy() {

    }
}
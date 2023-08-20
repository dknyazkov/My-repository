package org.example.web;

import org.example.exceptions.ClientNotFoundException;
import org.example.service.ClientService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/reg")
public class Registration extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String age = req.getParameter("age");
        String email = req.getParameter("email");
        ClientService clientService = new ClientService();
        try {
            clientService.addUser(login, password, Integer.parseInt(age), email);
            req.getRequestDispatcher("Authorization.jsp").forward(req, resp);
        } catch (ClientNotFoundException clientNotFoundException) {
            throw new ClientNotFoundException("Client or password is wrong");

        }
    }
}

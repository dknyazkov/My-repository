package org.example.web;

import org.example.domain.Activities;
import org.example.domain.Client;
import org.example.service.ClientService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create")
public class CreateTasks extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String active = req.getParameter("active");
        String login = req.getParameter("login");
        Activities activities = new Activities(active);
        Client client = ClientService.clientMap.get(login);
        client.listOfActivities.add(activities);
        req.setAttribute("client", client);
        req.setAttribute("active", client.getActivities());
        req.getRequestDispatcher("ToDo.jsp").forward(req, resp);
    }
}

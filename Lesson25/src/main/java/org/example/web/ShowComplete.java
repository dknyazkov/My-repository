package org.example.web;

import org.example.domain.Activities;
import org.example.domain.Client;
import org.example.domain.Status;
import org.example.service.ClientService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/show")
public class ShowComplete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        Client client = ClientService.clientMap.get(login);
        List<Activities> tempList = new ArrayList<>();
        for (Activities activity : client.getActivities()
        ) {
            if (activity.status.equals(Status.completed)) {
                tempList.add(activity);
            }
        }

        req.setAttribute("active", tempList);
        req.getRequestDispatcher("/ToDo.jsp").forward(req, resp);
    }
}

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
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@WebServlet("/change")
public class Change extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String status = req.getParameter("status");
        UUID uuid = UUID.fromString(req.getParameter("id"));
        Client client = ClientService.clientMap.get(req.getParameter("login"));
        Optional<Activities> first = client.getActivities().stream()
                .filter(activities -> activities.getId().equals(uuid))
                .findFirst();

        Activities activity = first.get();
        if (status.equals("created"))
            activity.setStatus("work");

        else if (status.equals("work")) {
            activity.setStatus("completed");
            activity.setComplete(true);
            client.completeActivities.add(activity);
            client.listOfActivities.remove(activity);
        }


        List<Activities> activities = client.getActivities();
        req.setAttribute("active", activities);
        req.setAttribute("client", client);
        req.getRequestDispatcher("/ToDo.jsp").forward(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}

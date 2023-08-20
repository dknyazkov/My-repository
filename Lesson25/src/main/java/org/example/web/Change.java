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
import java.util.Optional;
import java.util.UUID;

@WebServlet("/change")
public class Change extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Status status = Status.valueOf(req.getParameter("status"));
        UUID uuid = UUID.fromString(req.getParameter("id"));
        Client client = ClientService.clientMap.get(req.getParameter("login"));
        Optional<Activities> first = client.getActivities().stream()
                .filter(activities -> activities.getId().equals(uuid))
                .findFirst();

        Activities activity = first.get();
        if (status.equals(Status.created))
            activity.setStatus(Status.work);

        else if (status.equals(Status.work)) {
            activity.setStatus(Status.completed);

        }


        List<Activities> activities = new ArrayList<>();
        for (Activities act : client.getActivities()
        ) {
            if (!act.status.equals(Status.completed)) {
                activities.add(act);
            }
        }
        req.setAttribute("active", activities);
        req.getRequestDispatcher("/ToDo.jsp").forward(req, resp);

    }


}

package org.example.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/start")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/save-request.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("Name");
        String author = req.getParameter("Author");


        if (name.isBlank() || name.isEmpty() || author.isBlank() || author.isEmpty()) {
            req.setAttribute("name", name);
            req.setAttribute("author", author);
            req.getRequestDispatcher("/save-request.jsp").forward(req, resp);


        } else req.getRequestDispatcher("/success").forward(req, resp);
    }
}

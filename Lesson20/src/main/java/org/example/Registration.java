package org.example;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Registration extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login = req.getParameter("Login");
        String password = req.getParameter("Password");
        String age=req.getParameter("Age");
        String email=req.getParameter("email");
        UserService userService=new UserService();

        try
        {
        userService.addUser(login,password,Integer.parseInt(age),email);
            resp.getWriter().println("Created");}
        catch (RuntimeException runtimeException)
        {
            req.getRequestDispatcher("/error").forward(req,resp);

        }

        }
    }

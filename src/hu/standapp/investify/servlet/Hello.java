package hu.standapp.investify.servlet;

import hu.standapp.investify.model.User;

import java.io.*;
import javax.persistence.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class Hello extends HttpServlet {

    private String message;
//    @PersistenceUnit(unitName="bfsExampleUnit")
//    EntityManagerFactory emf;

    public void init() throws ServletException
    {
        // Do required initialization
        message = "Hello World";
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bfsExampleUnit");

        EntityManager em = emf.createEntityManager();
        em.clear();

        User test = new User("mani", "hali", "hu", 0, true);

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(test);
        transaction.commit();

        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");

    }

    public void destroy()
    {
        // do nothing.
    }
}
package hu.standapp.investify.servlet;

import hu.standapp.investify.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// Extend HttpServlet class
public class Hello extends HttpServlet {

    private String message;
    @PersistenceUnit(name="bfsExampleUnit")
    EntityManagerFactory emf;

    public void init() throws ServletException
    {
        // Do required initialization
        message = "Hello World";
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bfsExampleUnit");

        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");

        EntityManager em = emf.createEntityManager();
        em.clear();

        User test = new User("mani", "hali", "hu", 0, true);

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(test);
        transaction.commit();

    }

    public void destroy()
    {
        // do nothing.
    }
}
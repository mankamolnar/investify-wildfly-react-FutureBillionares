package hu.standapp.investify.servlet;

import hu.standapp.investify.model.*;


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
import javax.persistence.*;

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

        User exampleUser = new User("mani", "hali", "hu", 0, true);
        House exampleHouse = new House(1000,0000,"City city", "Address address", 1000000);
        HousePicture exampleHousePicture = new HousePicture(exampleHouse, "URL", "Description");
        MoneyPool exampleMoneyPool = new MoneyPool(0,0,1000000);
        Sharehold exampleSharehold  = new Sharehold(exampleHouse, exampleUser, 10000,10000,40);
        Market exampleMarket = new Market(exampleSharehold, 1,1, null,null);
        Investment exampleInvestment = new Investment(exampleUser, exampleMoneyPool, 5, 1000, null,null);


        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(exampleUser);
        em.persist(exampleHouse);
        em.persist(exampleHousePicture);
        em.persist(exampleMoneyPool);
        em.persist(exampleSharehold);
        em.persist(exampleMarket);
        em.persist(exampleInvestment);
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
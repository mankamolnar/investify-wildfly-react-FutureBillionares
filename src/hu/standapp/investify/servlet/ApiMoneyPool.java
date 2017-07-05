package hu.standapp.investify.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import hu.standapp.investify.ExampleData;
import hu.standapp.investify.model.MoneyPool;
import org.osgi.service.jpa.EntityManagerFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// Extend HttpServlet class
public class ApiMoneyPool extends HttpServlet {

    private String message;
    private final static Logger logger = LoggerFactory.getLogger(ApiMoneyPool.class);


    public void init() throws ServletException
    {
        // Do required initialization
        message = "{\"id\":1, \"goal\":10000000, \"payedin\":4500000, \"investors\":20, \"unitPrice\": 100000}";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ExampleData exampleData = ExampleData.getInstance();
        EntityManager em = exampleData.getEntityManager();

        long id = 1;
        MoneyPool moneyPool = em.find(MoneyPool.class, id);
        ObjectMapper mapper = new ObjectMapper();
        String objAsJSON = mapper.writeValueAsString(moneyPool);


        response.setContentType("application/JSON");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        out.println(objAsJSON);

    }

    public void destroy()
    {
        // do nothing.
    }
}
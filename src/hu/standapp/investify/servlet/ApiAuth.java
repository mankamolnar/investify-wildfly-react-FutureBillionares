package hu.standapp.investify.servlet;

import hu.standapp.investify.ExampleData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// Extend HttpServlet class
public class ApiAuth extends HttpServlet {

    private String message;
    private final static Logger logger = LoggerFactory.getLogger(ApiAuth.class);


    public void init() throws ServletException
    {
        message = "{\"loggedIn\":true, user:{\"id\":1, \"username\":\"manka\", \"cash\": 0, \"investments\": 0, \"shareholds\": 0, \"income\": 0, \"tenantReliability\": 100}}";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        ExampleData exampleData = ExampleData.getInstance();
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        out.println(message);

    }

    public void destroy()
    {
        // do nothing.
    }
}
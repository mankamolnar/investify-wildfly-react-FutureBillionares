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
public class ApiMoneyPool extends HttpServlet {

    private String message;
    private final static Logger logger = LoggerFactory.getLogger(ApiMoneyPool.class);


    public void init() throws ServletException
    {
        // Do required initialization
        message = "{goal:1, payedin:2, investors:3}";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ExampleData.createExampleData();

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
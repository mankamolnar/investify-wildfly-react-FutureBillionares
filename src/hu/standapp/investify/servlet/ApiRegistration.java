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
public class ApiRegistration extends HttpServlet {

    private String message;
    private final static Logger logger = LoggerFactory.getLogger(ApiRegistration.class);


    public void init() throws ServletException
    {
        // Do required initialization
        message = "{registered:false, usernameOK:false, emailOK:false}";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ExampleData.createExampleData();

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        out.println(message);

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws SecurityException, IOException, ServletException {
        response.getWriter().println("<h1>success</h1>  ");
        request.getServletContext().getRequestDispatcher("/WEB-INF/web.xml").include(request, response);
    }

    public void destroy()
    {
        // do nothing.
    }
}
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
public class ApiRandomShareholdsForSale extends HttpServlet {

    private String message;
    private final static Logger logger = LoggerFactory.getLogger(ApiRandomShareholdsForSale.class);


    public void init() throws ServletException
    {
        // Do required initialization
        message = "[{id: 1, address:'2016 Leányfalu, Fecske utca 27', area:17, returnTime:14, shareholdAmount:1, unitPrice:120000, income:500, tenantReliability:100, picUrl:'http://ingatlancdn.com/photos/be/f2/22979252_110161242_l.jpg', picDescription:'haha'}, {id: 1, address:'2016 Leányfalu, Fecske utca 27', area:17, returnTime:14, shareholdAmount:1, unitPrice:120000, income:500, tenantReliability:100, picUrl:'http://ingatlancdn.com/photos/be/f2/22979252_110161242_l.jpg', picDescription:'haha'}]";
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
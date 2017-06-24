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
public class Hello extends HttpServlet {

    private String message;
    private final static Logger logger = LoggerFactory.getLogger(Hello.class);


    public void init() throws ServletException
    {
        // Do required initialization
        message = "<html>\n" +
                "<head>\n" +
                "\n" +
                "    <title>Hello React</title>\n" +
                "    <script type=\"text/javascript\" src=\"/static/react.js\"></script>\n" +
//                "    <script type=\"text/javascript\" src=\"vendor/showdown.min.js\"></script>\n" +
                "    <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n" +
                "\n" +
                "</head>\n" +
                "<body>\n" +
                "<div id=\"app\"></div>\n" +
                "<script type=\"text/javascript\" src=\"/static/bundle.js\"></script>\n" +
                "</body>\n" +
                "</html>";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ExampleData.createExampleData();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println(message);

    }

    public void destroy()
    {
        // do nothing.
    }
}
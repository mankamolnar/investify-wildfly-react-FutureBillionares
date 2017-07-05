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
        message = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">\n" +
                "<head>\n" +
                "   <meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\">" +
                "    <title>Hello React</title>\n" +
                "    <script type=\"text/javascript\" src=\"/static/react.js\"></script>\n" +
//                "    <script type=\"text/javascript\" src=\"vendor/showdown.min.js\"></script>\n" +
                "    <link href=\"https://bootswatch.com/sandstone/bootstrap.min.css\" rel=\"stylesheet\">\n" +
                "    <link href=\"/static/css/style.css\" rel=\"stylesheet\">\n" +
                "\n" +
                "</head>\n" +
                "<body>\n" +
                "<div id=\"app\"></div>\n" +
                "<script type=\"text/javascript\" src=\"/static/bundle.js\"></script>\n" +
                "</body>\n" +
                "</html>";
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
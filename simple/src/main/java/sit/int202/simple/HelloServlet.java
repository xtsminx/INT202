package sit.int202.simple;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h3>This is my first servlet</h3>");
        out.println("hr");
        out.println("Your browser is " + request.getHeader("User-Agent"));
        out.println("<br><a href='index.jsp'>Back to Home</a>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
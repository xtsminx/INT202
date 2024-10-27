package sit.int202.simple;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "MyProfile", value = "/My-profile")
public class MyProfile extends HttpServlet {
    private String id;
    private String name;
    private double gpax;

    public void init() {
        id = "66130500066";
        name = "Pannakan Tongsan";
        gpax =4.00;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>My Profile</h1>");
        out.println("<p>ID: " + id + "</p>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>GPAX: " + gpax + "</p>");
        out.println("<br><a href='index.jsp'>Back to Home</a>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}

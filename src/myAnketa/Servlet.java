package myAnketa;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Servlet extends HttpServlet {
    static final String TEMPLATE = "<html>" +
            "<head><title>Anketa</title>"+"<style>\n" +
            "body {" +
            "background-color: red;" +
            "}" +
            "h1 {"+"text-align: center;"+
            "color: #00FF00;" +
            "}" +
            "h2 {" +"text-align: center;"+
            "color: rgb(0,0,255)" +
            "}" +
            "</style>"+"</head>" +
            "<body>" +
            "<h1>YOUR DATA:</h1>"+
            "<h2>%s</h2>" +
            "</body>" +
            "</html>";


    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String age=req.getParameter("age");
        String quastionOne=req.getParameter("quastionOne");
        String quastionTwo=req.getParameter("quastionTwo");
        StringBuilder sb=new StringBuilder();

        sb.append(" Your firstName : "+firstName+"<br>").append("Your lastName : "+lastName+"<br>").append("Your age : "+age+"<br>").append("What city are you from? : "+quastionOne+"<br>").append("   What are you doing in your free time? : "+quastionTwo+"<br>");
        String msg=sb.toString();

        resp.getWriter().println(String.format(TEMPLATE, msg));
    }
}

package com.github.lacquerednocap.FirstJavaEE;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;


@WebServlet("/greeting")
public class FirstServlet extends HttpServlet {

    private final String link = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        HttpSession session = request.getSession();
        Integer count = (Integer) session.getAttribute("count");
        session.setAttribute("count", count == null ? count = 1 : ++count);



        if (Objects.equals(firstName, null) && Objects.equals(lastName, null)) {
            firstName = "FirstName";
            lastName = "LastName";
        } else if ( !(firstName.equals("Arkady") && lastName.equals("Novokhatsky")) ) {
            response.sendRedirect(link);
        }

//        RequestDispatcher dispatcher = request.getRequestDispatcher("/firstJsp.jsp");
//        dispatcher.forward(request, response);

        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<h1>" + count + "</h1>");
        pw.println("<h1> Hello, " + firstName + " " + lastName.charAt(0) + ". " + "</h1>");
        pw.println("</html>");
    }
}

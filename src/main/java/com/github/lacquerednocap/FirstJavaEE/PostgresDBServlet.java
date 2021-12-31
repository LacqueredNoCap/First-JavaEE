package com.github.lacquerednocap.FirstJavaEE;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Objects;

public class PostgresDBServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "LacqDB");
             Statement state = conn.createStatement()) {

            ResultSet rs = state.executeQuery("SELECT name FROM cats WHERE shop_id = 3");

            out.println("<html><body>");
            while (rs.next()) {
                out.println("<h1>" + rs.getString("name") + "</h1>");
            }
            out.println("</html></body>");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }
}
package com.github.lacquerednocap.FirstJavaEE.Cookies;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class SetCookiesServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long value = new Random().nextLong();
        Cookie cookie1 = new Cookie("id", "" + value);
        Cookie cookie2 = new Cookie("sport", "Basketball");

        cookie1.setMaxAge(24 * 60 * 60); // - one hour cookie lifetime
        cookie2.setMaxAge(24 * 60 * 60); // - one hour cookie lifetime

        response.addCookie(cookie1);
        response.addCookie(cookie2);
    }
}

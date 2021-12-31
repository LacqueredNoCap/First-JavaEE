package com.github.lacquerednocap.FirstJavaEE.Cookies;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class DeleteCookiesServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie2 = new Cookie("id", ""); // rewrite cookie2 value before delete

        cookie2.setMaxAge(0); // 0 lifetime , default is 0 - alive until the F5 happens

        response.addCookie(cookie2); // add a cookie that will be removed immediately
    }
}

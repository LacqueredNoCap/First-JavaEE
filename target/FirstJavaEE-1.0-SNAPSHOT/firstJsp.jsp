<%--
  Created by IntelliJ IDEA.
  User: TC
  Date: 12-Oct-21
  Time: 1:04 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page import="java.util.Date, com.github.lacquerednocap.FirstJavaEE.logic.TestClass" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
    <h1>Testing JSP</h1>
    <p>
        <%
            out.print("<p>" + "Heh, greetings" + "</p>");

            Date now = new java.util.Date();
            TestClass testClass = new TestClass();

            String str = "Current date: " + now;

            String token = request.getParameter("token");
        %>
    </p>
    <p>
        <%= str %>
    </p>
    <p>
        <%= testClass.getInfo() %>
    </p>
    <p>
        <%= token %>
    </p>
</body>
</html>

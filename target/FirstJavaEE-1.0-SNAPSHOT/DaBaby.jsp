<%--
  Created by IntelliJ IDEA.
  User: TC
  Date: 14-Oct-21
  Time: 11:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>DaBaby Lyrics</title>
</head>
<body>
    <% String verb = request.getParameter("verb");
       if (verb == null) verb = ", YO!"; %>
    <h1>BALL IF I WANT TO<%= " " + verb.toUpperCase(java.util.Locale.ROOT)%>
    </h1>
</body>
</html>

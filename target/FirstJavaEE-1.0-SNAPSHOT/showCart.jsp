<%@ page import="com.github.lacquerednocap.FirstJavaEE.logic.Cart" %>
<%--
  Created by IntelliJ IDEA.
  User: TC
  Date: 21-Oct-21
  Time: 9:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
    <% Cart cart = (Cart) session.getAttribute("cart"); %>
    <p> Cart Id: <%= cart.getId() %> </p>
    <p> Name: <%= cart.getName() %> </p>
    <p> Quantity: <%= cart.getQuantity() %> </p>
</body>
</html>

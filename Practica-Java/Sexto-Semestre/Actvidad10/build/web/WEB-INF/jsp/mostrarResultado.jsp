<%-- 
    Document   : mostrarResultado
    Created on : 29/04/2021, 07:13:53 PM
    Author     : alant
--%>
<%@page import="model.suma" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            String n1 = request.getParameter("num1");
            String n2 = request.getParameter("num2");
            suma s = new suma();
            s.hacerSuma(n1, n2);
            int resultado = s.getResulto();
        %>
        <span>El resultado es: <%=resultado%></span>
    </body>
</html>

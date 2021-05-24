<%-- 
    Document   : mostrarResultado
    Created on : 2/05/2021, 09:37:03 PM
    Author     : alant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Suma" %>
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
            Suma s = new Suma();
            s.hacerSuma(n1, n2);
            int resultado = s.getResulto();
        %>
        <span>El resultado es: <%=resultado%></span>
    </body>
</html>

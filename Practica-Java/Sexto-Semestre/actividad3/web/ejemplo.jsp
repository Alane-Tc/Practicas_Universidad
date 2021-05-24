<%-- 
    Document   : ejemplo
    Created on : 9/02/2021, 11:53:18 PM
    Author     : alant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="figures.Triangle" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actividad 2</title>
    </head>
    <body>
        <h1>Resultado: </h1>
        <% 
          String n1=request.getParameter("num1");
          String n2=request.getParameter("num2");
          
          Triangle s = new Triangle();
          s.area(n1,n2);
          s.perimeter(n1);
          int resultArea=s.getResultado();
          int resultPerimeter=s.getResultPerimeter();   
        %>
        <p>Área: <%=resultArea%></p>
        <p>Perímetro: <%=resultPerimeter%></p>
        
        <a href="index.html">
            <button type="button">Volver</button>
        </a>
        
    </body>
</html>

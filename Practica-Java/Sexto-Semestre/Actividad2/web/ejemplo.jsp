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
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
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
            <button type="button" class="btn btn-primary">Volver</button>
        </a>
         <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
    </body>
</html>

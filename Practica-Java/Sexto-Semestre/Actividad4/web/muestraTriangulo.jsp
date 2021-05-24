<%-- 
    Document   : muestraTriangulo
    Created on : 1/03/2021, 11:10:21 PM
    Author     : alant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Triangle" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actividad 4</title>
    </head>
    <body>
        <h1>Resultado: </h1>
        <%
            Triangle triangulo = (Triangle) request.getAttribute("triangulo");
            int resultArea = triangulo.getResultArea();
            int resultPerimeter = triangulo.getResultPerimeter();
        %>
         <!--<h2>El resultado del área es: <%=resultArea%></h2>
            <h2>El resultado del perímetro es: <%=resultPerimeter%></h2> -->
        <p>Area: <%=resultArea%></p>
        <p>Perimetro: <%=resultPerimeter%></p>

        <a href="calcular.jsp">
            <button type="button">Volver</button>
        </a>

    </body>
</html>
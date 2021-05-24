<%-- 
    Document   : calcular
    Created on : 24/03/2021, 01:47:15 PM
    Author     : alant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="controller.mostrarResultado" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actividad 4</title>
    </head>
    <body>
        <%
            Cookie ck[] = request.getCookies();
            if (ck != null) {
                for (int i = 0; i < ck.length; i++) {
                    if (ck[i].getName().equals("area")) {
                        out.print("<h2>Área anterior fue: " + ck[i].getValue() + "");
                    }
                    
                    if (ck[i].getName().equals("perimeter")) {
                        out.print("<h2>Perimetro anterior fue: " + ck[i].getValue() + "");
                    }
                }
            }
            
            if (request.getAttribute("flag") != null) {
                out.print("<h1>No puedes digitar números negativos</h1>");
            }
        %>
        <h1><b>Área Y Perímetro De Un Triángulo</b></h1>
        <form action="mostrarResultado" method="post">
            <label>Base: </label> <br>
            <input type="text" name="num1" value="" placeholder="Introduce La Base"> <br>
            <label>Altura: </label> <br>
            <input type="text" name="num2" value="" placeholder="Introduce La Altura"> <br> <br>
            <button type="submit">Calcular</button>
        </form>   
    </body>
</html>
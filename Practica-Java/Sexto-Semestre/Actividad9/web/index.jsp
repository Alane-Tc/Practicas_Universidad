<%-- 
    Document   : index
    Created on : 7/04/2021, 01:24:53 PM
    Author     : alant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actividad-9</title>
    </head>
    <body>
        <h1><b>Área Y Perímetro De Un Triángulo</b></h1>

        <form action="calcular.jsp" method="post">
            <input type="text" name="name" id="input-name" placeholder="Introduce tu nombre">
            <button type="submit" id="boton">Iniciar</button>
            <button type="button" id="save">Guardar</button>
        </form>

        <div id="result"></div> 
        <script src="JS/formulario.js"></script>
    </body>
</html>

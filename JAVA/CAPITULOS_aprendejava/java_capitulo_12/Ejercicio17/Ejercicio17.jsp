<%-- 
    Document   : Ejercicio17
    Created on : 15 feb 2023, 19:48:20
    Author     : perma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Elige tu coche</h1>
        <form method="POST" action="coche.jsp">
            <%-- TAMBIÉN SE PODRIA HACER CON UN SELECT Y EN EL OTRO ARCHIVO COGEMOS DEL TIRON EL STRING--%>
            <p>TAPICERÍA:</p>
            <label>Negro:</label>
            <input type="radio" name="tapiceria" value="0">
            </br>
            <label>Blanco:</label>
            <input type="radio" name="tapiceria" value="1">
            </br>
            <label>Berengena:</label>
            <input type="radio" name="tapiceria" value="2">    
            </br>
            </br>
            <p>MOLDURAS:</p>
            <label>Carbono:</label>
            <input type="radio" name="molduras" value="0">
            </br>
            <label>Madera:</label>
            <input type="radio" name="molduras" value="1">
            </br>
            <input type="submit">
        </form>
    </body>
</html>

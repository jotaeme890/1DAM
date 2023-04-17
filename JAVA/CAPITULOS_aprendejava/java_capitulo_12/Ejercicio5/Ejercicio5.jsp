<%-- 
    Document   : Ejercicio5
    Created on : 13 feb 2023, 17:05:37
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
        <h1 style="text-align: center">Transformador euro-peseta:</h1>
        <form method="POST" action="transformador.jsp">
            <div>
                <label for="cantidad">Euros:</label>
                <input type="double" name="cantidad"  min="0">
            </div>
            <div>
                <input type="submit">
            </div>
        </form>
    </body>
</html>

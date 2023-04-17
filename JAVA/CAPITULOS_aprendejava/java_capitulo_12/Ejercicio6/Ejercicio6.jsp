<%-- 
    Document   : Ejercicio6
    Created on : 13 feb 2023, 17:15:32
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
        <h1 style="text-align: center">Transformador pesetas-euros:</h1>
        <form method="POST" action="transformador.jsp">
            <div>
                <label for="cantidad">Pesetas:</label>
                <input type="double" name="cantidad" min="0">
            </div>
            <div>
                <input type="submit">
            </div>
        </form>
    </body>
</html>

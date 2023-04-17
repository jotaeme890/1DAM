<%-- 
    Document   : Ejercicio3
    Created on : 13 feb 2023, 16:50:57
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
        <form method="POST" action="hola.jsp">
            <div>
                <label for="nombre">Nombre:</label>
                <input type="text" name="nombre">
            </div>
            <div>
                <input type="submit">
            </div>
        </form>
    </body>
</html>

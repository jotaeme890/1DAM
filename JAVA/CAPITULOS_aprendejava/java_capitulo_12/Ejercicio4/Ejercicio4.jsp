<%-- 
    Document   : Ejercicio4
    Created on : 13 feb 2023, 16:58:20
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
        <h1 style="text-align: center">Calcula medias:</h1>
        <form method="POST" action="media.jsp">
            <div>
                <label for="nota1">Nota 1:</label>
                <input type="double" name="nota1"  min="0" max="10">
            </div>
            
            <div>
                <label for="nota2">Nota 2:</label>
                <input type="double" name="nota2"  min="0" max="10">
            </div>
            
            <div>
                <label for="nota3">Nota 3:</label>
                <input type="double" name="nota3"  min="0" max="10">
            </div>
            
            <div>
                <input type="submit">
            </div>
        </form>
    </body>
</html>

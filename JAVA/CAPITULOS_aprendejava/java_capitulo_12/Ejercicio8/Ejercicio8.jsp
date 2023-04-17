<%-- 
    Document   : Ejercicio8
    Created on : 14 feb 2023, 11:38:15
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
        <h1>Tabla de multiplicar</h1>
        <form method="POST" action="tabla.jsp">
            <div>
                <label name="numero">Dime un número:</label>
                <input type="number" name="numero"  min="0">
            </div>
            
            <div>
                <input type="submit">
            </div>
        </form>
    </body>
</html>

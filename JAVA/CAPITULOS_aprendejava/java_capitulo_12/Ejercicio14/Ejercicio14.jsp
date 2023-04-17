<%-- 
    Document   : Ejercicio14
    Created on : 15 feb 2023, 14:14:49
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
        <h1 style="text-align: center;">Sucesión de fibonacci</h1>
        <form method="POST" action="sucesion.jsp">
            <div>
                <label for="sucesion">Dime la longitud</label>
                <input type="number" min="0" name="sucesion">
            </div>
            
            <div>
                <input type="submit">
            </div>
        </form>
    </body>
</html>

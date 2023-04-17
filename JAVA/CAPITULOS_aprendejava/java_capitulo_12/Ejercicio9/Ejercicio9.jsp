<%-- 
    Document   : Ejercicio9
    Created on : 14 feb 2023, 11:39:04
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
        <h1>Pinta pirámides</h1>
        <form method="POST" action="piramide.jsp">
            <div>
                <label for="altura">Dime la altura de la pirámide:</label>   
                <input type="number" name="altura"  min="0">
            </div> 
            
            <div>
                <input type="submit">
            </div> 
        </form>
    </body>
</html>

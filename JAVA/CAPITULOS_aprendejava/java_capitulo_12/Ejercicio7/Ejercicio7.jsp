<%-- 
    Document   : Ejercicio7
    Created on : 13 feb 2023, 17:21:28
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
         <h1 style="text-align: center">Euro-Peseta o Peseta-Euro</h1>
        <img src="data:image/jpeg;base64,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">
       
        <form method="POST" action="transformador.jsp">
            <div>
                <label for="cantidad">Cantidad:</label>
                <input type="double" name="cantidad" min="0">
            </div>
            
            <div>
                <label>1) Euro-Pesetas:</label>
                <input type="radio" name="cambio" value="eurosPesetas">
            </div>
            
            <div>
                <label>2) Pesetas-Euros</label>
                <input type="radio" name="cambio" value="pesetasEuros">
            </div>
            
            <div>
                <input type="submit">
            </div>
        </form>
    </body>
</html>

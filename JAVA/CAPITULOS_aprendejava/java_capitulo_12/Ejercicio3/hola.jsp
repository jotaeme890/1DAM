<%-- 
    Document   : hola
    Created on : 13 feb 2023, 16:53:21
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
        <% 
            String nombre = request.getParameter("nombre");
        %>
        <p><% out.print("Hola, " + nombre);%></p>
    </body>
</html>

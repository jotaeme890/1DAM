<%-- 
    Document   : nota
    Created on : 14 feb 2023, 20:07:08
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
            int nota = 0;
            for(Integer i = 1; i<11;i++){
                nota += Integer.parseInt(request.getParameter("p"+i.toString()));
            }
        %>
        <h1>Nota de test</h1>
        <p><%out.print("Tiene un " + nota); %></p>
    </body>
</html>

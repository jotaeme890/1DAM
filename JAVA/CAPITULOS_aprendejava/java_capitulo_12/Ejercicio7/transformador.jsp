<%-- 
    Document   : transformador
    Created on : 13 feb 2023, 17:34:09
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
            double cantidad = Double.valueOf(request.getParameter("cantidad"));
            double total = 0;
            if(request.getParameter("cambio").equals("eurosPesetas")){
                total = cantidad * 166.386;
            } else{
                total = cantidad / 166.386;
            }
        %>
        <h1><% out.print("La cantidad transformada sería "+ total);%></h1>
    </body>
</html>

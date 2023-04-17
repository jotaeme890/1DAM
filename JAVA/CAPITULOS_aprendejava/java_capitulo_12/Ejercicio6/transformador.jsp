<%-- 
    Document   : transformador
    Created on : 13 feb 2023, 17:16:06
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
            double pesetas = Double.valueOf(request.getParameter("cantidad"));
            double euros = pesetas / 166.386;
        %>
        <h1><% out.print(pesetas + " pesetas en euros son: " + euros);%></h1>
    </body>
</html>

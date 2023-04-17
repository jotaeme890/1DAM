<%-- 
    Document   : transformador
    Created on : 13 feb 2023, 17:11:55
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
            double euros = Double.valueOf(request.getParameter("cantidad"));
            double pesetas = euros * 166.386;
        %>
        <h1><% out.print(euros + " euros en pesetas son: " + pesetas);%></h1>
    </body>
</html>

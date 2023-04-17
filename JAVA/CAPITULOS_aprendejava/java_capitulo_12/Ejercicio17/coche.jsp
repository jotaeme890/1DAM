<%-- 
    Document   : coche.jsp
    Created on : 15 feb 2023, 19:58:58
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
          String [] moldura = {"carbono","madera"};
          String [] tapicerias = {"negro","blanco","berengena"};
          
          int m = Integer.parseInt(request.getParameter("molduras"));
          String mol = moldura[m];
          
          int t = Integer.parseInt(request.getParameter("tapiceria"));
          String tap = tapicerias[t];
          
          String imagen = "assets/images/" +tap + mol + ".jpg";
        %>
        <h1 style="text-align: center;">Tu coche quedaría así:</h1>
        <p><img src="<%= imagen %>" style="margin-left: 16%"></p>
    </body>
</html>

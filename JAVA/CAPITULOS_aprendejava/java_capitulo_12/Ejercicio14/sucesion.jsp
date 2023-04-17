<%-- 
    Document   : sucesion
    Created on : 15 feb 2023, 14:17:23
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
        <h1 style="text-align: center;">Sucesion de Fibonacci</h1>
        <%
          int longitud = Integer.parseInt(request.getParameter("sucesion"));
          int a=0;
          int b=1;
          int c=0;
          out.print(c +" ");
          for(int i = 0; i< longitud ;i++){
               c=a+b;
               b=a;
               a=c;
               out.print(c + " ");
          }
        %>
    </body>
</html>

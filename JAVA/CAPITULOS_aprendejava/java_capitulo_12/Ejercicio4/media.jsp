<%-- 
    Document   : media.jsp
    Created on : 13 feb 2023, 17:02:01
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
            double nota1 = Integer.valueOf(request.getParameter("nota1"));
            double nota2 = Integer.valueOf(request.getParameter("nota2"));
            double nota3 = Integer.valueOf(request.getParameter("nota3"));
            double suma = nota1+nota2+nota3;
            double media = suma/3;
        %>
        <h1><%out.print("La nota media es : " + media);%></h1>
    </body>
</html>

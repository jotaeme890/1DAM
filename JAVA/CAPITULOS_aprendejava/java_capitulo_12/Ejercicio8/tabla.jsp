<%-- 
    Document   : tabla.jsp
    Created on : 14 feb 2023, 11:42:35
    Author     : perma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="assets/css/style.css" type="text/css">
        <title>JSP Page</title>
    </head>
    <body>
        <%
          int numero = Integer.valueOf(request.getParameter("numero"));  
        %>    
        <h1><% out.print("Tabla del " + numero);%></h1>
        <table>
            <%
              for(int i = 0; i<=10;i++){
                out.print("<tr>");
                
                out.print("<td>" + i + " x " + numero + "</td>");
                
                out.println("<td>" + i * numero + "</td>");
                
                out.print("</tr>");
              }  
            %>
        </table>
    </body>
</html>

<%-- 
    Document   : piramide
    Created on : 14 feb 2023, 12:38:46
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
          int altura = Integer.parseInt(request.getParameter("altura"));
        %>
        <h1>Pirámide de</h1>
        <%
            for(int i = 1; i <= altura ; i++){
                for(int j = 1; j <= altura-i;j++ ){
                //PONEMOS LA MISMA IMAGEN PERO LA PONEMOS EN HIDDEN PARA DESPREOCUPARNOS DE QUE SE DESCUADRE
                    out.print("<img src='assets/images/gato.jpg' class='hidden'>");
                }
                for(int k = 1; k <= (2*i)-1; k++){
                    out.print("<img src='assets/images/gato.jpg'>");
                }
                    out.print("</br>");
            }
        %>
    </body>
</html>

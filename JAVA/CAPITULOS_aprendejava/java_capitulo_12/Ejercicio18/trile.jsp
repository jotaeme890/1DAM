<%-- 
    Document   : trile
    Created on : 18 feb 2023, 17:37:55
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
          int bola= (int)(Math.random()*3);
          int eleccion = Integer.parseInt(request.getParameter("cubilete"));
          String cubiletes [] = {"assets/images/cubilete_sin_bola.png","assets/images/cubilete_sin_bola.png","assets/images/cubilete_sin_bola.png"};
          
          cubiletes[bola]= "assets/images/cubilete_con_1bola.png";
          String mensaje = "";
          if(eleccion==bola){
            mensaje = "¡Enhorabuena! ¡Has acertado!";
            } else {
                mensaje = "Lo siento, has perdido.";
            }
        %>
        <h1>El trile</h1>
        <table>
            <tr>
                <td><img src="<%= cubiletes[0] %>"></td>
                <td><img src="<%= cubiletes[1] %>"></td>
                <td><img src="<%= cubiletes[2] %>"></td>
            </tr>
        </table>
        <p><%= mensaje %></p>
    </body>
</html>

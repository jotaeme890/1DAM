<%-- 
    Document   : solucion
    Created on : 15 feb 2023, 14:07:12
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
          int puntos = 0;
          
          for(Integer i = 1;i<10 ;i++){
            puntos += Integer.parseInt(request.getParameter("p"+i.toString()));
          }
        %>    
        <h1 style="text-align: center;">Solución</h1>
        <%
          if (puntos <= 10) {
            out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
          }
          if ((puntos >= 11) && (puntos <= 22)) {
            out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
          }
          if (puntos > 22) {
            out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
          }  
        %>    
    </body>
</html>

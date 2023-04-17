<%-- 
    Document   : Ejercicio16
    Created on : 15 feb 2023, 17:01:47
    Author     : perma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="assets/css/style.css" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tirada de 3 dados</h1>
        <div id="principal">
            <p>
               <%
                 String [] lados ={"assets/images/as.png","assets/images/j.png","assets/images/k.png","assets/images/ocho.png","assets/images/q.png","assets/images/siete.png"};
                 for(int i = 0; i<3;i++){
                  out.print("<img src='" + lados[(int)(Math.random()*6)] +"'>");
                 }
               %>
           </p>
        </div>
        <div id='centrado'>
            <form methos="POST">
                <input type="submit" value="Otra tirada">   
            </form>
        </div>

    </body>
</html>

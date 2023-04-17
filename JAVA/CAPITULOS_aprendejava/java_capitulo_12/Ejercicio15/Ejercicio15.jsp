<%-- 
    Document   : Ejercicio15
    Created on : 15 feb 2023, 14:29:38
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
        <h1>100 números</h1>
        <%
          int n;
          for(int i = 0; i<100;i++){
            n = (int)(Math.random() * 200) + 1; 
            if(esPrimo(n)){
                 out.print("<span class='primos'>" + n + "</span>");
            } else{
                out.print(n + " ");
            }
          }
        %>   

    </body>
</html>

    <%!
       static boolean esPrimo(int n){
        if(n%2==0){
            return false;
        }
        for(int i = 2;i<n/2;i++){
            if(n%i==0){
                 return false;
            }
        }
        return true;
       }
    %>

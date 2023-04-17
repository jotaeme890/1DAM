<%-- 
    Document   : Ejercicio18
    Created on : 18 feb 2023, 17:34:09
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
        <h1>El trile</h1>
        <form method="POST" action="trile.jsp" class>
            <table>
                <tr>
                    <td>
                        <img src="assets/images/cubilete_tapando_bolas.png">
                        <input type="radio" name="cubilete" value="0">
                    </td>
                    <td>
                        <img src="assets/images/cubilete_tapando_bolas.png">
                        <input type="radio" name="cubilete" value="1">
                    </td>
                    <td>
                        <img src="assets/images/cubilete_tapando_bolas.png">
                        <input type="radio" name="cubilete" value="2">
                    </td>
                </tr>
            </table>
            <div>
                <input type="submit">
            </div>
        </form> 
    </body>
</html>

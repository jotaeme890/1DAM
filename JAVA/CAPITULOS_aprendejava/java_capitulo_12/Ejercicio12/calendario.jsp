<%-- 
    Document   : calendario
    Created on : 16 feb 2023, 9:28:46
    Author     : perma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Calendar"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calendario</h1>
        <%
            int mes = Integer.parseInt(request.getParameter("mes"));
            int anio = Integer.parseInt(request.getParameter("anio"));
            Calendar cal = Calendar.getInstance();
            cal.set(anio,mes-1,1);
            int diaSemana = cal.get(Calendar.DAY_OF_WEEK);
            
            if(diaSemana==1)
                diaSemana = 7;
                else
                diaSemana--;
                
            int diaActual=1;
            int diaMaximoMes = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        %>
        
        <table>
            <tr>
                <th>Lunes</th>
                
                <th>Martes</th>
                
                <th>Miércoles</th>
                
                <th>Jueves</th>
                
                <th>Viernes</th>
                
                <th>Sábado</th>
                
                <th>Domingo</th>                
            </tr>
            <tr>
                <%for(int cont=1;cont<diaSemana;cont++){%>
                    <td></td>
                <%}%>
                
                <%for(int cont=diaSemana;cont<=7;cont++){%>
                    <td><%out.print(diaActual++);%></td>
                <%}%>
            </tr>
            
            <%
                int semanas = (int)Math.ceil((double)(diaMaximoMes-diaActual+1) / 7);
                for(int cont =1; cont <= semanas; cont++){
                    out.println("<tr>");
                    for(int dia=1;dia<=7;dia++){
                        if(diaActual<=diaMaximoMes)
                            out.println("<td>"+ (diaActual++) + "</td>");
                        else
                            out.println("<td></td>");
                    }
                    out.println("</tr>");
                }
            %>
        </table>
    </body>
</html>

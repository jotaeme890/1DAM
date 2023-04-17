<%@page import="alumnos.Alumno"%>
<%@page import="alumnos.AlumnosService"%>
<%@page import="connection.ConnectionPool"%>
<%@page import="grupos.Grupos"%>
<%@page import="grupos.GruposService"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <%@page contentType="text/html" pageEncoding="UTF-8"%>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="assets/css/style.css">
        <title>Base de datos</title>
    </head>

    <body>
        <%
            // COGEMOS LOS DATOS DE LO QUE QUIERE HACER Y LA ID DEL ALUMNO/GRUPO
            long id = Integer.parseInt(request.getParameter("id"));
            int eleccion = Integer.parseInt(request.getParameter("opcion"));
            String objeto = request.getParameter("objeto");
            // session no existe para HttpSession
            String url = "jdbc:mysql://localhost:3306/alumno";
            String usuario = "javier";
            String clave = "1234";        
            ConnectionPool pool = new ConnectionPool(url, usuario, clave);
            // PARA SABER QUE HACEMOS CON EL OBJETO QUE ELIJA LA PERSONA
            String mensaje = "";
            if(objeto.equals("alumno")){
                AlumnosService serviceAlumno = new AlumnosService(pool.getConnection());
                switch(eleccion){
                    case 1:
            %>
                <form method='POST' action="accion.jsp?eleccion=2">
                    <label for="nombre">Nombre: </label>
                    <input type="text" name="nombre" placeholder="Ingrese su nombre">
                    <label for="nombre">Apellido: </label>
                    <input type="text" name="apellido" placeholder="Ingrese su apellido">
                </form>
            <%
                    break;
                }
            } else{
                GruposService serviceGrupo = new GruposService(pool.getConnection());
                switch(eleccion){
                    case 1:
                        %>
                            <form method='POST' action="accion.jsp?eleccion=2">
                                <label for="nombre">Curso: </label>
                                <input type="text" name="curso" placeholder="Ingrese el curso">
                                <label for="nombre">Tutor: </label>
                                <input type="text" name="tutor" placeholder="Ingrese el tutor">
                            </form>
                        <%
                    break;
                }
            }

        %>
        <h1><%=mensaje%></h1>
    </body>
</html>
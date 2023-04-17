<%@page import="alumnos.Alumno"%>
<%@page import="alumnos.AlumnosService"%>
<%@page import="connection.ConnectionPool"%>
<%@page import="grupos.Grupos"%>
<%@page import="grupos.GruposService"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <%@page contentType="text/html" pageEncoding="UTF-8"%>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="assets/css/style.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>Base de datos</title>
    </head>

    <body>
    <%
        int accion = Integer.parseInt(request.getParameter("accion")); 
        // CONEXION DE BBDD
        String url, usuario, clave, nombre, apellido, profesor;
        url = "jdbc:mysql://localhost:3306/alumnos";
        usuario = "javier";
        clave = "1234";        
        ConnectionPool pool = new ConnectionPool(url, usuario, clave);
        //Alumno service
        AlumnosService serviceAlumno = new AlumnosService(pool.getConnection());
        GruposService serviceGrupo = new GruposService(pool.getConnection());
        try{
    %>

    <%
        switch(accion){
            case 1:
            // ALUMNOS
                %>
                <h2>ALUMNOS</h2>
                <div class="table">
                    <div class="th">
                        <div class="td">Nombre</div>
                        <div class="td">Apellidos</div>
                        <div class="td">Clase</div>
                        <div class="td"></div>
                        <div class="td"></div>
                    </div>
                <%
                // PARA PODER INTERACTUAR ALUMMNOS
                ArrayList<Alumno> alumnos = serviceAlumno.requestAll();
                for(Alumno al : alumnos){
                    long num = al.getId();
                    String curso = al.getCurso();
                %>
                    <div class="tr">
                        <div class="td"><%= al.getNombre()%></div>
                        <div class="td"><%= al.getApellidos()%></div>
                        <div class="td"><%= curso%></div>
                        <div class="td"> <a href="matriculacion.jsp?id=<%=num%>&accion=2"><i class="fa fa-check" aria-hidden="true"></i></a></div>
                        <div class="td"><a href="matriculacion.jsp?id=<%=num%>&accion=4"><i class="icon fa fa-trash"aria-hidden="true"></i></a></div>
                    </div>
                <%}
                %>
                <div class = "centrar">
                    <form method='POST' action='index.jsp'> <button type='submit'>Salir</button> </form>
                </div>

                <%
            break;
            //GRUPOS
            case 2:
                %>
                <h2>CURSOS</h2>
                <div class="table">
                    <div class="th">
                        <div class="td">Clase</div>
                        <div class="td">Tutor</div>
                        <div class="td"></div>
                        <div class="td"></div>
                    </div>
                <%
                // PARA PODER INTERACTUAR GRUPOS
                Long idAl = Long.parseLong(request.getParameter("id"));
                ArrayList<Grupos> grupos= serviceGrupo.requestAll();
                for(Grupos gr : grupos){
                    long num = gr.getId();
                %>
                    <div class="tr">
                        <div class="td"><%= gr.getCurso()%></div>
                        <div class="td"><%= gr.getProfesor()%></div>
                        <div class="td"><a href="matriculacion.jsp?idAl=<%=idAl%>&idGr=<%=num%>&accion=3"><i class="fa fa-check" aria-hidden="true"></i></a></div>
                        <div class="td"></div>
                    </div>
                    

                <%}
                %>
                <div class = "centrar">
                    <form method='POST' action='index.jsp'> <button type='submit'>Salir</button> </form>
                </div>
                <%
            break;
            // AÑADIR O MOD GRUPO
            case 3:
                Long idGrupo = Long.parseLong(request.getParameter("idGr"));
                Long idAlumno = Long.parseLong(request.getParameter("idAl"));
                serviceAlumno.matri(idAlumno,idGrupo);
                %>
                <h1>Alumno añadido al grupo correctamente</h1>
                <div class = "centrar">
                    <form method='POST' action='alumno.jsp?accion=1'> <button type='submit'>Salir</button> </form>
                </div>
                <%
            break;
            // ELIMINAR GRUPO
            case 4:
                Long idAlu = Long.parseLong(request.getParameter("id"));
                serviceAlumno.sacar(idAlu);
                %>
                <h1>Alumno sacado del grupo correctamente</h1>
                <div class = "centrar">
                    <form method='POST' action='alumno.jsp?accion=1'> <button type='submit'>Salir</button> </form>
                </div>
                <%
            break;
        }
        }catch(SQLException e){
            out.print("Algo ha ocurrido mal");
        } finally {
            pool.closeAll();
        }
        %>
    </body>
</html>
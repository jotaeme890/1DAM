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
        try{
    %>

    <%
        switch(accion){
            case 1:
                %>
                <h2>ALUMNOS</h2>
                <div id="crear">
                    <a class="inline icon" href="alumno.jsp?accion=4"><i class="fa fa-user-plus" aria-hidden="true"></i></a>
                </div>
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
                        <div class="td"> <a href="alumno.jsp?id=<%=num%>&accion=2"><i class="icon fa fa-trash"aria-hidden="true"></i></a></div>
                        <div class="td"> <a href='alumno.jsp?id=<%=num%>&accion=6'> <i class="icon fa fa-pencil-square-o"aria-hidden="true"></i></a></div>
                    </div>
                <%}
                %>
                </div>
                <div class = "centrar">
                    <form method='POST' action='index.jsp'> <button type='submit'>Salir</button> </form>
                </div>

                <%
            break;
            //BORRAR
            case 2:
                out.print("<h1>¿Está seguro de que quiere borrar al alumno?</h1>");
                Long num = Long.parseLong(request.getParameter("id")); 
                %>
                <div id=btn>
                    <a  href="alumno.jsp?accion=3&id=<%=num%>">
                        <button type="submit">Aceptar</button>
                    </a>
                    <a href="alumno.jsp?accion=1">
                        <button type="button" >Cancelar</button>
                    </a>
                </div>
                <%
            break;
            //BORRAR
            case 3:
                Long idBorrar = Long.parseLong(request.getParameter("id")); 
                serviceAlumno.delete(idBorrar);
                %>
                <h1>Alumno borrado correctamente</h1>
                <div class = "centrar">
                    <form method='POST' action='alumno.jsp?accion=1'> <button type='submit'>Salir</button> </form>
                </div>
                <%
                
            break;
            // CREATE
            case 4:
            %>  
                <div id="entero">
                    <div id="medio">
                        <h2>CREACIÓN DE ALUMNOS</h2>
                        <form method="POST"  action="alumno.jsp?accion=5&opcion=2">
                            <div id="formNuevo">
                                <label for="nombre">Nombre </label>
                                <input type="text" name="nombre" placeholder="Ingrese el nombre" required>
                                <label for="apellido">Apellido </label>
                                <input type="text" name="apellido" placeholder="Ingrese el apellido" required>

                                <div id=btn>
                                    <button type="submit">Crear</button>
                                    <a href="alumno.jsp?accion=1">
                                        <button type="button" >Cancelar</button>
                                    </a>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            <%
            break;
            //CREAR Y ACT USU
            case 5:
                int opcion = Integer.parseInt(request.getParameter("opcion"));
                switch(opcion){
                    case 1:
                        Long id = Long.parseLong(request.getParameter("id")); 
                        nombre = request.getParameter("nombre");    
                        apellido = request.getParameter("apellido");
                        serviceAlumno.update(id,nombre,apellido);
                        %>
                        <h1>Alumno actualizado correctamente</h1>
                        <div class = "centrar">
                            <form method='POST' action='alumno.jsp?accion=1'> <button type='submit'>Salir</button> </form>
                        </div>
                        <%
                    break;

                    case 2:
                        nombre = request.getParameter("nombre");
                        apellido = request.getParameter("apellido");
                        serviceAlumno.create(nombre,apellido);
                        %>
                        <h1>Alumno creado correctamente</h1>
                        <div class = "centrar">
                            <form method='POST' action='alumno.jsp?accion=1'> <button type='submit'>Salir</button> </form>
                        </div>
                        <%
                    break;
                }

            break;
            // UPDATE
            case 6:
            Long numero = Long.parseLong(request.getParameter("id"));  
            %>
                <div id="entero">
                    <div id="medio">
                        <h2>ACTUALIZACIÓN DE ALUMNOS</h2>
                        <form method="POST"  action="alumno.jsp?accion=5&id=<%=numero%>&opcion=1">
                            <div id="formNuevo">
                                <label for="nombre">Nuevo nombre </label>
                                <input type="text" name="nombre" placeholder="Ingrese el nuevo nombre" required>
                                <label for="apellido">Nuevo apellido </label>
                                <input type="text" name="apellido" placeholder="Ingrese el nuevo apellido" required>

                                <div id=btn>
                                    <button type="submit">Actualizar</button>
                                    <a href="alumno.jsp?accion=1">
                                        <button type="button" >Cancelar</button>
                                    </a>
                                </div>
                            </div>
                        </form>
                    </div>
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
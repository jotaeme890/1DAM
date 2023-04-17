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
        String url, usuario, clave, nombre,  profesor;

        url = "jdbc:mysql://localhost:3306/alumnos";
        usuario = "javier";
        clave = "1234";        
        ConnectionPool pool = new ConnectionPool(url, usuario, clave);
        GruposService serviceGrupo = new GruposService(pool.getConnection());
        try{
    %>

    <%
        switch(accion){
            case 1:
                %>
                <h2>CURSOS</h2>
                <div id="crear">
                    <a class="inline icon" href="grupo.jsp?accion=4"><i class="fa fa-user-plus" aria-hidden="true"></i></a>
                </div>
                <div class="table">
                    <div class="th">
                        <div class="td">Clase</div>
                        <div class="td">Tutor</div>
                        <div class="td"></div>
                        <div class="td"></div>
                    </div>
                <%
                // PARA PODER INTERACTUAR ALUMMNOS
                ArrayList<Grupos> grupos= serviceGrupo.requestAll();
                for(Grupos gr : grupos){
                    long num = gr.getId();
                %>
                    <div class="tr">
                        <div class="td"><%= gr.getCurso()%></div>
                        <div class="td"><%= gr.getProfesor()%></div>
                        <div class="td"><a href="grupo.jsp?id=<%=num%>&accion=2"><i class="icon fa fa-trash" aria-hidden="true"></i></a></div>
                        <div class="td"><a href="grupo.jsp?id=<%=num%>&accion=6"> <i class="icon fa fa-pencil-square-o" aria-hidden="true"></i></a></div>
                    </div>
                    

                <%}
                %>
                </div>
                <div class = "centrar">
                    <form method='POST' action='index.jsp'> <button type='submit'>Salir</button> </form>
                </div>
                </div>
                <%
            break;

            case 2:
                out.print("<h1>¿Está seguro de que quiere borrar al grupo?</h1>");
                Long num = Long.parseLong(request.getParameter("id")); 
                %>
                <div id=btn>
                    <a  href="grupo.jsp?accion=3&id=<%=num%>">
                        <button type="submit">Aceptar</button>
                    </a>
                    <a href="grupo.jsp?accion=1">
                        <button type="button" >Cancelar</button>
                    </a>
                </div>
                <%
            break;

            case 3:
                Long idBorrar = Long.parseLong(request.getParameter("id")); 
                serviceGrupo.delete(idBorrar);
                %>
                <h1>Grupo borrado correctamente</h1>
                <div class = "centrar">
                    <form method='POST' action='grupo.jsp?accion=1'> <button type='submit'>Salir</button> </form>
                </div>
                <%
            break;

            case 4:
            %>
                <div id="entero">
                    <div id="medio">
                        <h2>CREACIÓN DE GRUPOS</h2>
                        <form method="POST"  action="grupo.jsp?accion=5&opcion=2">
                            <div id="formNuevo">
                                <label for="clase">Clase </label>
                                <input type="text" name="clase" placeholder="Ingrese el nombre de la clase" required>
                                <label for="tutor">Tutor </label>
                                <input type="text" name="tutor" placeholder="Ingrese al tutor" required>
                                <div id=btn>
                                    <button type="submit">Crear</button>
                                    <a href="grupo.jsp?accion=1">
                                        <button type="button" >Cancelar</button>
                                    </a>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            <%
            break;

            case 5:
                int opcion = Integer.parseInt(request.getParameter("opcion"));
                switch(opcion){
                    case 1:
                        Long id = Long.parseLong(request.getParameter("id")); 
                        nombre = request.getParameter("clase");
                        profesor = request.getParameter("tutor");
                        serviceGrupo.update(id,nombre,profesor);
                        %>
                        <h1>Curso actualizado correctamente</h1>
                        <div class = "centrar">
                            <form method='POST' action='grupo.jsp?accion=1'> <button type='submit'>Salir</button> </form>
                        </div>
                        <%
                    break;

                    case 2:
                        nombre = request.getParameter("clase");
                        profesor = request.getParameter("tutor");
                        serviceGrupo.create(nombre,profesor);
                        %>
                        <h1>Grupo creado correctamente</h1>
                        <div class = "centrar">
                            <form method='POST' action='grupo.jsp?accion=1'> <button type='submit'>Salir</button> </form>
                        </div>
                        <%
                    break;
                }
            break;

            case 6:
                Long numero = Long.parseLong(request.getParameter("id"));  
                %>
                    <div id="entero">
                        <div id="medio">
                            <h2>ACTUALIZACIÓN DE GRUPOS</h2>
                            <form method="POST"  action="grupo.jsp?accion=5&id=<%=numero%>&opcion=1">
                                <div id="formNuevo">
                                    <label for="clase">Nuevo nombre de clase</label>
                                    <input type="text" name="clase" placeholder="Ingrese el nuevo nombre" required>
                                    <label for="tutor">Nuevo nombre del tutor</label>
                                    <input type="text" name="tutor" placeholder="Ingrese el nuevo tutor" required>

                                    <div id=btn>
                                        <button type="submit">Actualizar</button>
                                        <a href="grupo.jsp?accion=1">
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
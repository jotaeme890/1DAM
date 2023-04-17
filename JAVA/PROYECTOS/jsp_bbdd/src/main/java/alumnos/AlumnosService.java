package alumnos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AlumnosService {
    Connection conn;
    public AlumnosService(Connection conn){
        this.conn = conn;
    }


    // SELECT DE LA BBDD ENTERA
    public ArrayList<Alumno> requestAll() throws SQLException{
        Statement statement = null;
        ArrayList<Alumno> result = new ArrayList<Alumno>();
        statement = this.conn.createStatement();
        String sql = "SELECT a.id, a.nombre, a.apellido,g.curso, a.id_grupo FROM alumnos a left join grupos g on(a.id_grupo = g.id)";
        // Ejecución de la consulta, YA QUE EXECUTEQUERY SE USA PARA EL SELECT
        ResultSet querySet = statement.executeQuery(sql);

        // Recorrido del resultado de la consulta
        while(querySet.next()) {
            long id = querySet.getInt("a.id");
            String nombre = querySet.getString("a.nombre");
            String apellidos = querySet.getString("a.apellido");
            long idGrupo = querySet.getInt("a.id_grupo");
            String nombreCurso = querySet.getString("g.curso");

            if(nombreCurso == null){
                nombreCurso = "Sin Clase";
            } else{
                nombreCurso = querySet.getString("g.curso");
            }
            result.add(new Alumno(id, nombre, apellidos,idGrupo,nombreCurso));
        } 
        // CERRAMOS EL statement
        statement.close();    
        // DEVOLVEMOS EL ALUMNO
        return result;
    }


    // SELECT DE LA BBDD MEDIANTE ID
    public Alumno requestById(long id) throws SQLException{
        Statement statement = null;
        Alumno result = null;
        statement = this.conn.createStatement();    
        String sql = String.format("SELECT alumnos.id, alumnos.nombre, alumnos.apellido,alumnos.id_grupo, grupos.curso FROM alumnos,grupos WHERE alumnos.id_grupo = grupos.id AND id=%s", id);

        // Ejecución de la consulta, YA QUE EXECUTEQUERY SE USA PARA EL SELECT
        ResultSet querySet = statement.executeQuery(sql);

        // Recorrido del resultado de la consulta
        if(querySet.next()) {
            String nombre = querySet.getString("nombre");
            String apellidos = querySet.getString("apellido");
            long idGrupo = querySet.getInt("id_grupo");
            String nombreCurso = querySet.getString("grupo.curso");
            result = new Alumno(id, nombre, apellidos,idGrupo, nombreCurso);
        }
        // CERRAMOS EL statement
        statement.close();    
        // DEVOLVEMOS EL ALUMNO
        return result;
    }


    // INSERT DE LA BBDD, SE LE AÑADE NOMBRE Y APELLIDO, YA QUE EL ID ES AUTOINCREMENT
    public long create(String nombre, String apellidos) throws SQLException{
        Statement statement = null;
        statement = this.conn.createStatement();    
        String sql ;
            sql = String.format("INSERT INTO alumnos  (nombre, apellido,id_grupo) VALUES ('%s', '%s',null)", nombre, apellidos);
        // Ejecución de la consulta
        // ES UN ENTERO YA QUE DEVUELVE EL NUMERO DE FILAS AFECTADAS
        long affectedRows = statement.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);

        // SI NO HAY FILAS AFECTADAS DA 0
        if (affectedRows == 0) {
            throw new SQLException("Creating user failed, no rows affected.");
        }

        try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                long id = generatedKeys.getLong(1);
                // CERRAMOS EL statement
                statement.close();
                return id;
            }

            else {
                // CERRAMOS EL statement
                statement.close();
                // DEVOLVEMOS EL ERROR YA QUE NO HABRÍA DETECTADO LA ID
                throw new SQLException("Creating user failed, no ID obtained.");
            }
        }
    }


    // UPDATE DE LA BBDD
    public long update(long id, String nombre, String apellidos) throws SQLException{
        Statement statement = null;
        statement = this.conn.createStatement();    
        PreparedStatement prep = this.conn.prepareStatement("UPDATE alumnos  SET nombre = ?, apellido = ? WHERE id=?");
        prep.setString(1, nombre);
        prep.setString(2, apellidos);
        prep.setLong(3, id);

        long affectedRows = prep.executeUpdate();
        // CERRAMOS EL statement
        statement.close();

        // SI ES 0 ES QUE NO HA AFECTADO A NINGUNA FILA
        if (affectedRows == 0)
            throw new SQLException("Creating user failed, no rows affected.");
        else
            return affectedRows;
    }

    // MATRICULACION
    public long matri(long idAlumno,long idGrupo) throws SQLException{
        Statement statement = null;
        statement = this.conn.createStatement();    
        PreparedStatement prep = this.conn.prepareStatement("UPDATE alumnos  SET id_grupo = ? WHERE id=?");
        prep.setLong(1, idGrupo);
        prep.setLong(2, idAlumno);

        long affectedRows = prep.executeUpdate();
        // CERRAMOS EL statement
        statement.close();

        // SI ES 0 ES QUE NO HA AFECTADO A NINGUNA FILA
        if (affectedRows == 0)
            throw new SQLException("Creating user failed, no rows affected.");
        else
            return affectedRows;
    }

    // ELIMINAR GRUPO
    public long sacar(long idAlumno) throws SQLException{
        Statement statement = null;
        statement = this.conn.createStatement();    
        PreparedStatement prep = this.conn.prepareStatement("UPDATE alumnos  SET id_grupo = null WHERE id=?");
        prep.setLong(1, idAlumno);

        long affectedRows = prep.executeUpdate();
        // CERRAMOS EL statement
        statement.close();

        // SI ES 0 ES QUE NO HA AFECTADO A NINGUNA FILA
        if (affectedRows == 0)
            throw new SQLException("Creating user failed, no rows affected.");
        else
            return affectedRows;
    }


    // DELETE DE LA BBDD
    public boolean delete(long id) throws SQLException{
        Statement statement = null;

        statement = this.conn.createStatement();    

        String sql = String.format("DELETE FROM alumnos  WHERE id=%d", id);

        // Ejecución de la consulta
        // ES UN ENTERO YA QUE DEVUELVE EL NUMERO DE FILAS AFECTADAS
        long result = statement.executeUpdate(sql);

        // CERRAMOS EL statement
        statement.close();

        return result==1;
    }
}

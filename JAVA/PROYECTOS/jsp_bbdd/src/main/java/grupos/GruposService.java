package grupos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GruposService {
    Connection conn;
    public GruposService(Connection conn){
        this.conn = conn;
    }


    // SELECT DE LA BBDD ENTERA
    public ArrayList<Grupos> requestAll() throws SQLException{
        Statement statement = null;
        ArrayList<Grupos> result = new ArrayList<Grupos>();
        statement = this.conn.createStatement();   
        String sql = "SELECT id,curso,profesor FROM grupos";
        // Ejecución de la consulta, YA QUE EXECUTEQUERY SE USA PARA EL SELECT
        ResultSet querySet = statement.executeQuery(sql);

        // Recorrido del resultado de la consulta
        while(querySet.next()) {
            long id = querySet.getInt("id");
            String curso = querySet.getString("curso");
            String profesor = querySet.getString("profesor");
            result.add(new Grupos(id, curso,profesor));
        } 
        // CERRAMOS EL statement
        statement.close();    
        return result;
    }


    public Grupos requestById(long id) throws SQLException{
        Statement statement = null;
        Grupos result = null;
        statement = this.conn.createStatement();    
        String sql = String.format("SELECT id,curso,profesor FROM grupos WHERE curso=%s", id);

        // Ejecución de la consulta, YA QUE EXECUTEQUERY SE USA PARA EL SELECT
        ResultSet querySet = statement.executeQuery(sql);

        // Recorrido del resultado de la consulta
        if(querySet.next()) {
            String curso = querySet.getString("curso");
            String profesor = querySet.getString("profesor");
            result = new Grupos(id,curso,profesor);
        }
        // CERRAMOS EL statement
        statement.close();
        return result;
    }


    public long create(String curso, String profesor) throws SQLException{
        Statement statement = null;
        statement = this.conn.createStatement();    
        String sql = String.format("INSERT INTO grupos (curso,profesor) VALUES ('%s', '%s')", curso, profesor);

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
    public long update(long id, String curso, String profesor) throws SQLException{
        Statement statement = null;
        statement = this.conn.createStatement();    

        String sql = String.format("UPDATE grupos SET curso = '%s', profesor = '%s' WHERE id=%d", curso, profesor, id);

        // Ejecución de la consulta
        // ES UN ENTERO YA QUE DEVUELVE EL NUMERO DE FILAS AFECTADAS
        long affectedRows = statement.executeUpdate(sql);

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

        String sql = String.format("DELETE FROM grupos WHERE id=%d", id);

        // Ejecución de la consulta
        // ES UN ENTERO YA QUE DEVUELVE EL NUMERO DE FILAS AFECTADAS
        long result = statement.executeUpdate(sql);

        // CERRAMOS EL statement
        statement.close();

        return result==1;
    }
}

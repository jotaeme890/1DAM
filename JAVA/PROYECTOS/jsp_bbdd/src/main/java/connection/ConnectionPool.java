package connection;

import java.sql.*;
import java.util.ArrayList;

public class ConnectionPool {
    // ESTA CLASE SE USA PARA CONECTARNOS A LA BBDD, EN VEZ DE COGERLA DESDE DRIVERMANAGER, USAMOS ESTA CLASE PARA METER LAS CONEXIONES EN UN ARRAYLIST
    private String url;
    private String user;
    private String password; 

    private ArrayList<Connection> conns = new ArrayList<Connection>();
    // COMO SI PASASEMON 
    public ConnectionPool(String url, String user, String password){
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public Connection getConnection()throws SQLException{
        Connection _conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            _conn = DriverManager.getConnection(this.url, this.user, this.password);
            // LA AÑADIMOS AL ARRAYLIST
            this.conns.add(_conn);
        } catch (ClassNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
        return _conn;
    }
    // PARA CERRAR TODAS LAS CONEXIONES A LA VEZ
    public void closeAll() throws SQLException{
        for(Connection conn : this.conns){
            // SI NO ES NULA Y NO ESTA CERRADA SE CIERRA
            if(conn!=null && !conn.isClosed()){
                conn.close();
            }
        }
    }

    
}

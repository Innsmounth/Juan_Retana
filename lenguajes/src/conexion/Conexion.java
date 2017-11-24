
package conexion;
//este paquete es de java no del driver de mysql
import java.sql.*;

public class Conexion 
{
    public static Connection conectarse (String login,String password) throws SQLException, ClassNotFoundException
    {
        //primero escribimos la url del server de mysql
        //jcbc = java data base connector
        String url = "jdbc:mysql://localhost:3306/mysql";
        //Cargamos el cargado con codigo del driver
        //cargamos el driver de myswl para que sepa 
        //que nos conectaremos a mySQL
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(url, login, password);
        
        return con;
    
    }
}

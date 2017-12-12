
package repasofinal;
import java.sql.*;


public class Conexion 
{
public static Connection conectarse (String login,String password) throws SQLException, ClassNotFoundException
{
    String url = "jdbc:mysql://localhost:3306/mysql";
    Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(url, login, password);
        
        return con;

}
    
    
    
    
    
    
}


package conexion;
import java.sql.*;
public class ProbarConexion 
{
    public static void main(String[] args)
    {
        try
        {
        Conexion.conectarse("root", "");
        }
        catch (ClassNotFoundException e)
        {
        
        }
        catch(SQLException e)
        {
        
        }
        finally
        {
            
        }
    
    }
}

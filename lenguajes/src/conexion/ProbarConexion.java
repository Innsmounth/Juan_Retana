
package conexion;
import java.sql.*;
public class ProbarConexion 
{
    public static void main(String[] args)
    {
        Connection con = null;
        try
        {
            Conexion.conectarse("roo", "");
            System.out.println("Te conectaste");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("No se cargo ben el driver");
        }
        catch(SQLException e)
        {
            System.out.println("Error en SQL " + e.getMessage());
        }
        finally
        {
            try
            {
                if (con != null) con.close();
                System.out.println("Ya se cerro la conexion");
                
            }
                catch (SQLException ex)
            {
                
                
            }
        }
        
    }
    
 }

    

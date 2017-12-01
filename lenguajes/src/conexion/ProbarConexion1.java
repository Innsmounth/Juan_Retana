
package conexion;
import java.sql.*;
public class ProbarConexion1 
{
    public static void main(String[] args)
    {
        Connection con = null;
        try
        {
            con = Conexion.conectarse("root", "");
            System.out.println("Te conectaste");          
            System.out.println("Te conectaste muy bien");
            //CASO ESPECIAL SELECT
            //PASO 1 Generar una consulta (query)
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from tablita"); 

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

    

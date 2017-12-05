
package conexion;
import java.sql.*;
import java.util.ArrayList;
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
            ResultSet rs = st.executeQuery("select * from tablita where id = 1"); 
            
            
            //viene la traduccion
            ArrayList<Tablita> registros = new ArrayList<>();
            
            while(rs.next())
            {
                Tablita t = new Tablita();
                t.setId(rs.getInt(1));
                t.setNombre(rs.getString(2));
                registros.add(t);
            }
            
            for(Tablita t : registros)
            {
                    System.out.println("id: "+t.getId()+"  Nombre: "+t.getNombre());                
            }
                
                st.close();
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

    

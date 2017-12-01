
package conexion;
import java.sql.*;
public class ProbarConexion 
{
    public static void main(String[] args)
    {
        Connection con = null;
        try
        {
            con = Conexion.conectarse("root", "");
            System.out.println("Te conectaste");
            
            //con la conexion llamada "con"
            //vamos a generar una sentencia, la cual es una clase
            
            //Statement st = con.createStatement(); borrar comentado
            
            //generamos la tabla
            //dr comento la creacion de la tabla
            //st.execute("create table tablita(id integer primary key, nombre varchar(40) )");
            //tambien se cirran las sentencias al igual que las conexiones
            
            //Caso 1: Insert
            
            PreparedStatement st = con.prepareStatement("insert into tablita values (?,?)");
            st.setInt(1 ,2);
            st.setString(2, "Pirulas");
            st.execute();
            st.close();
            System.out.println("Registro insertado");
            
            
            st.close();
            
            //System.out.println("Se genero la tabla correctamente");
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

    

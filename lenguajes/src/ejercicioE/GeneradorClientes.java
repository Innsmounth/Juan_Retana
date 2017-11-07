
package ejercicioE;
import java.util.*;

public class GeneradorClientes {
    
    public ArrayList<Cliente>generadorCliente ()
    {
        //para cada cliente se tiene que generar una direccion
        //se le pasan los parametros que llevan string int direccion etc.
        ArrayList<Cliente> nuevo = new ArrayList<Cliente>();
        Direccion d1 = new Direccion("calle1", "colonia", "municipio", 0);
        Cliente c1 = new Cliente("CL1",12, "holaaa",d1);
        
        Direccion d2 = new Direccion("calle2", "colonia", "municipio", 0);
        Cliente c2 = new Cliente("CL1",12, "holaaa",d1);
        
        Direccion d3 = new Direccion("calle3", "colonia", "municipio", 0);
        Cliente c3 = new Cliente("CL1",12, "holaaa",d1);
        
        //Arreglo generico y se agregan los usuarios que 
        //se crearon arriba
        ArrayList<Cliente> usuario = new ArrayList<>();
        usuario.add(c1);
        usuario.add(c2);
        usuario.add(c3);
    
    return nuevo;
    }
    
}

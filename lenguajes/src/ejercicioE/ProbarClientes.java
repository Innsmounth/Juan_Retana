
package ejercicioE;


public class ProbarClientes {
   
    public static void main(String[] args) {
        GeneradorClientes nuevo = new GeneradorClientes();
        //ciclo for mejorado
        //revisar esta ultima parte
        for(Cliente c:nuevo.generadorCliente()){
            System.out.println("nombre "+c.getNombre()+" calle:"+c.getDir().getCalle()+"hola");
        }
        
    }
   
    
}


package referenciados;

import abstraccion.Usuario;


public class Prueba2 {
    
    public static void main(String[] args) {
        //Todos los referenciados pertenecen a una clase
        //Se necesita uno o mas primitivos para definirlos
        String nombre = "Juan Felipe";
        String otro = new String("Sombra");
        Usuario  u = new Usuario();
        u.setAltura(1.8f);
        u.setPeso(80);
    }
    
}


package colecciones;


import java.util.ArrayList;
import java.util.List;


public class GeneradorUsuario {
    public static void main(String[] args) {
        //Vamos a generar 5 usuarios
        Usuario u1 = new Usuario();
        u1.setNombre("Juan");
        u1.setEmail("hola");
        u1.setEdad(21);
        
        Usuario u2 = new Usuario();
        u2.setNombre("Felipe");
        u2.setEmail("raro");
        u2.setEdad(27);
        
        Usuario u3 = new Usuario();
        u3.setNombre("Pirulas");
        u3.setEmail("Pirulon");
        u3.setEdad(38);
        
        Usuario u4 = new Usuario();
        u4.setNombre("Nombre");
        u4.setEmail("Email");
        u4.setEdad(21);
        
        Usuario u5 = new Usuario();
        u5.setNombre("Rarotongo");
        u5.setEmail("pirulin");
        u5.setEdad(50);
        
        //Generamos un arreglo mutable
        
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        usuarios.add(u5);
        
        //Vamos a iterarlo para ver los nombres
        for(Usuario u : usuarios) {
            System.out.println("Nombre: "+u.getNombre()+"|  Email: "+u.getEmail());
            
            
            
        }
        
        
    }
    
}

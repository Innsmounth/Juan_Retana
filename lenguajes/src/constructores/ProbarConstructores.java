
package constructores;

import javax.swing.JFrame;


public class ProbarConstructores {
    
    public static void main(String[] args) {
        
        //creamos objeto de la clase Animal
        
        Animal algo = new Animal();
      int x;
      

//  algo.setEdad(5);
      
        
        System.out.println("Edad: " + algo.getEdad());
        System.out.println("Nombre: "+algo.getNombre());
        System.out.println("Muerde? "+algo.isMuerde());
        //System.out.println(x);
        
        
        
        Animal otro = new Animal(8);
        otro.setEdad(10);
        System.out.println(otro.getEdad());
        
        //Vamos a usar un constructor de una clase que no hemos diseñado nosotros
        
        JFrame ventana = new JFrame("hola mundo");
        
                ventana.setSize(300,300);
                ventana.setVisible(true);
        
        
    }
    
}

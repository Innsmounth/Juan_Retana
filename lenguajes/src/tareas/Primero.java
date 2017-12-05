
package tareas;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Primero extends Thread
{
    public void run()
    {
        while(true)
        {
        //aqui pones la accion del thread
        System.out.println("Soy un thread que no hace nada");
            try 
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex) 
            {
                Logger.getLogger(Primero.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
    }
    
}

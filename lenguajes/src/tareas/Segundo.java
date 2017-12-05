
package tareas;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Segundo extends Thread
{
    public void run()
    {
        while(true)
        {
        //aqui pones la accion del thread
        System.out.println("Soy el segundo thread que tampoco hace nada");
            try 
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex) 
            {
                Logger.getLogger(Segundo.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
    }
    
}

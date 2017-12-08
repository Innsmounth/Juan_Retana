
package tareas;

import java.util.Calendar;


public class RelojitoChafa implements Runnable
{
    
    public static void main(String[] args) 
    {
       //creamos el thread con esta intefaz
        Runnable r = new RelojitoChafa ();
        Thread t1 = new Thread(r);
        t1.start();
        
        
    }
    
    public  void run ()
    {
        while (true)
        {
            try{
                Calendar c = Calendar.getInstance();
                //sacamos la hora del sistema
                 Thread.sleep(1000);
                 int hora = c.get(Calendar.HOUR);
                 int minuto = c.get(Calendar.MINUTE);
                 int segundo = c.get(Calendar.SECOND);
                      System.out.println("La hora es: "+ hora+":"+minuto+":"+segundo);
                }
               catch (InterruptedException e)
                {
            
                }
        }
    }
    
    
}

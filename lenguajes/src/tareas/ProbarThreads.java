
package tareas;


public class ProbarThreads 
{
    public static void main(String[] args)
    {
        //Thread creado
        Primero p = new Primero();
        Segundo s = new Segundo();
        //Thread en estado de ejecucion
        p.start();
        s.start();
    }
}

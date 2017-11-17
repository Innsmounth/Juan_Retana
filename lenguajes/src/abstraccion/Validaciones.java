
package abstraccion;


public class Validaciones 
{
    public static void valodarNumeroNoNegativo(float numero) throws NumeroNegativoException 
    {
        if(numero < 0) throw new NumeroNegativoException();
   
    }
    
    
}

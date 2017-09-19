
package abstraccion;


public class Imc {
    
    Usuario u;
    String resultado;
    
    public String calcular () {
        float mivalor = u.peso/(u.altura * u.altura);
        resultado = " Tu imc es: "+mivalor;
        return resultado;
    }
    
}


package ejercicioE;


public class Cliente
{
   private String nombre;
   private int edad;
   private String email;
   private Direccion dir;
   
   public Cliente ()
   {
   
   }
   
   public Cliente (String nombre, int edad, String email,Direccion dir)
   {
       this.nombre = nombre;
       this.edad = edad;
       this.email = email;
       this.dir = dir;
       
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDir() {
        return dir;
    }

    public void setDir(Direccion dir) {
        this.dir = dir;
    }
    
}

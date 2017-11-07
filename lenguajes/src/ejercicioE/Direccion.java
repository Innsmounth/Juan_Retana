
package ejercicioE;


public class Direccion 
{
    private String calle;
    private String colonia;
    private String municipio;
    private long cp;
    
    //constructor por defecto
    public Direccion()
    {
    }
    //Constructor inicializando valores
    public Direccion (String calle, String colonia, String municipio,long cp)
    {
    this.calle = calle;
    this.colonia = colonia;
    this.municipio = municipio;
    this.cp = cp;
    }
    
    
    

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public long getCp() {
        return cp;
    }

    public void setCp(long cp) {
        this.cp = cp;
    }
    
}

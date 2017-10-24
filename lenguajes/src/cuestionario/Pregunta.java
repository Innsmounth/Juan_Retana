
package cuestionario;

import java.util.ArrayList;
import java.util.List;


public class Pregunta {
    private String titulo;
    private ArrayList<Opcion> opciones;

    public Pregunta(String titulo, ArrayList<Opcion> opciones) {
        this.titulo = titulo;
        this.opciones = opciones;
    }
    

    
    
    

    public ArrayList<Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<Opcion> opciones) {
        this.opciones = opciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

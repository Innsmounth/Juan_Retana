
package cuestionario;
import java.util.*;

public class GeneradorCuestionario {
   
    public ArrayList<Pregunta> generador(){
   ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();
   
   Opcion op11 = new Opcion ("Moscu",false);
   Opcion op21 = new Opcion ("Kiev",false);
   Opcion op31 = new Opcion ("Helsinki",true);
   Opcion op41 = new Opcion ("Tonaya",false);
   
   ArrayList<Opcion> opciones1 = new ArrayList<>();
   opciones1.add(op11);
   opciones1.add(op21);
   opciones1.add(op31);
   opciones1.add(op41);
   
   Pregunta p1 = new Pregunta("Capital de Finlandia",opciones1);
   preguntas.add(p1);
           
           
           
   return preguntas;
   
   
    }
    
    
}

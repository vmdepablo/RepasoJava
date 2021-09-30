
package EJ6;

/**
 *
 * @author Victor Manuel
 */
public class Persona {

    String nombre;
    private int id;
    public Persona(){
        
    }
    public Persona(String nombre){
        this.nombre = nombre;
        id++;
    }

    @Override
    public String toString() {
        return "Nombre= " + nombre;
    }

    
}

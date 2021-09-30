
package EJ6;

/**
 *
 * @author Victor Manuel
 */
public class Trabajador extends Persona{
    
    private String empresa;
    
    public Trabajador(String empresa){
        this.empresa = empresa;
    }
    public Trabajador(String empresa,String nombre){
        super(nombre);
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmpresa= " + empresa;
    }
    
}

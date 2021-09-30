
package EJ6;

/**
 *
 * @author Victor Manuel
 */
public class Comercial extends Trabajador{
    
    private double bonus;

    public Comercial(double bonus, String empresa, String nombre) {
        super(empresa, nombre);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSoy un Comercial y tengo un bonus de " + bonus;
    }
    
    
}

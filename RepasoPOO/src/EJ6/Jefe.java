
package EJ6;

/**
 *
 * @author Victor Manuel
 */
public class Jefe extends Trabajador{

    private int numEmpleados;

    public Jefe(int numEmpleados, String empresa, String nombre) {
        super(empresa, nombre);
        this.numEmpleados = numEmpleados;
    }
    
    public String getNombre(String nombre){
        return super.nombre;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSoy un Jefe y tengo " + numEmpleados + " empleados.";
    }
    
    
}

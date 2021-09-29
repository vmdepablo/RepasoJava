
package Ej4;

/**
 *
 * @author Victor Manuel
 */
public class Jefe extends Trabajador{

    private int numTrabajadores;

    public Jefe(int numTrabajadores,int numEmpleado, String nombre, int numDepart, int salario) {
        super(numEmpleado, nombre, numDepart, salario);
        this.numTrabajadores=numTrabajadores;
    }

    public int getNumTrabajadores() {
        return numTrabajadores;
    }

    public void setNumTrabajadores(int numTrabajadores) {
        this.numTrabajadores = numTrabajadores;
    }
    
    
    
}

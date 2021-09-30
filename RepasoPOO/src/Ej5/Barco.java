
package Ej5;

/**
 *
 * @author Victor Manuel
 */
public class Barco extends Vehiculo{

    public Barco(Color colores,int numSerie){
        super(colores,numSerie);
    }

    @Override
    public String toString() {
        return "Vehiculo -> " + "numSerie= " + getNumSerie() + ',' + " color= " + getColores() + ',' + " y es un BARCO";
    }
    
    
}

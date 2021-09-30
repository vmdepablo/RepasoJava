
package Ej5;
/**
 *
 * @author Victor Manuel
 */
public class Coche extends Vehiculo{

    private int cilindrada;

    public Coche(int cilindrada, Color colores, int numSerie) {
        super(colores, numSerie);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Vehiculo -> " + "numSerie= " + getNumSerie() + ',' + " color= " + getColores() + ',' + " es un COCHE con cilindrada=" + cilindrada;
    }
    
    
    
}

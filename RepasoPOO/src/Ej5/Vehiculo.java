package Ej5;

/**
 *
 * @author Victor Manuel
 */
public class Vehiculo {

    enum Color {
        ROJO, VERDE, AZUL
    }
    private Color colores;
    private int numSerie;

    public Vehiculo(Color colores, int numSerie) {
        this.numSerie = numSerie;
        this.colores = colores;
    }

    public int getNumSerie() {
        return numSerie;
    }
    
    public Color getColores() {
        return colores;
    }

    public void setColores(Color colores) {
        this.colores = colores;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "colores=" + colores + ", numSerie=" + numSerie + '}';
    }
    
    
}

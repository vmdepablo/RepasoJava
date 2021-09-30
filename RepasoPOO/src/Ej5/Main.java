
package Ej5;

import static Ej5.Vehiculo.Color.*;

/**
 *
 * @author Victor Manuel
 */

public class Main {

    public static void main(String[] args) {
        Coche coche1 = new Coche(2000,ROJO,554654);
        Barco barco1 = new Barco(AZUL,161616);
        System.out.println(coche1.toString());
        System.out.println(barco1.toString());
    } //Fin del main

}   //Fin de la clase Main

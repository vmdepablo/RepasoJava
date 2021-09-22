package Aplicacion;

import java.util.*;

/**
 *
 * @author Victor Manuel
 */

public class EJ15 {

    public static void main(String[] args) {
        String simVenta = "";
        int numVenta = 1;
        int cantidad = 0;
        int cantidadVenta;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de la venta " + numVenta + ":");
        simVenta = sc.nextLine();
        while (!simVenta.equalsIgnoreCase("*")) {
            numVenta++;
            if (simVenta.equalsIgnoreCase("*")) {
                break;
            } else {
                cantidadVenta = Integer.parseInt(simVenta);
                cantidad += cantidadVenta;
                System.out.print("Introduce la cantidad de la venta " + numVenta + ":");
                simVenta = sc.nextLine();
            }
        }
        System.out.println("La cantidad total de las ventas es: " + cantidad + "€");
    } //Fin del main

}   //Fin de la clase EJ15


package Aplicacion;
import java.util.*;
/**
 *
 * @author Victor Manuel
 */

public class EJ13 {

    public static void main(String[] args) {
        
        int ventas;
        double cant;
        int i = 1;
        double suma = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Introduzca cuantas ventas ha realizado: ");
        ventas = sc1.nextInt();
        while(i <= ventas){
            System.out.print("Introduzca la cantidad de la venta:");
            cant = sc1.nextDouble();
            suma += cant;
            i++;
        }
        System.out.println("La cantidad total vendida es: " + suma + "€");
    } //Fin del main

}   //Fin de la clase EJ13


package Ej2;
import java.util.*;
/**
 *
 * @author Victor Manuel
 */

public class Main {

    public static void main(String[] args) {
        Persona[] arrayPersonas = new Persona[3];
        for(int i = 0; i<3;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Persona " + (i+1));
            System.out.print("Introduce un nombre:");
            String nombre = sc.nextLine();
            System.out.print("Introduce un primer apellido:");
            String apellido1 = sc.nextLine();
            System.out.print("Introduce un segundo apellido:");
            String apellido2 = sc.nextLine();
            System.out.print("Introduce una edad:");
            int edad = sc.nextInt();
            arrayPersonas[i] = new Persona(nombre,apellido1, apellido2, edad);
        }
        for(int i = 0; i <= 3;i++){
            System.out.println(arrayPersonas[i]);
        }
    } //Fin del main

}   //Fin de la clase Main

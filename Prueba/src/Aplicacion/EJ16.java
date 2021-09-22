package Aplicacion;

import java.util.*;

/**
 *
 * @author Victor Manuel
 */

public class EJ16 {

    public static void main(String[] args) {
        String psw = "admin";
        String pswUser = "";
        int intentos = 3;
        while (intentos != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduzca la contraseña:");
            pswUser = sc.nextLine();
            if (!psw.equalsIgnoreCase(pswUser)) {
                intentos--;
                System.out.println("Error le quedan " + intentos + " intentos.");
                if (intentos == 0) {
                    System.out.println("Has agotado tus 3 intentos. No has acertado");
                }
            } else if (psw.equalsIgnoreCase(pswUser)) {
                System.out.println("Enhorabuena");
                break;
            }
        }
    }
}
//Fin del main

   //Fin de la clase EJ16

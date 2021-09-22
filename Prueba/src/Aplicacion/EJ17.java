package Aplicacion;

import java.util.*;

/**
 *
 * @author Victor Manuel
 */
public class EJ17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un dia de la semana:");
        String dia = sc.nextLine();
        switch (dia) {
            case "Lunes":

            case "Martes":

            case "Miercoles":

            case "Jueves":

            case "Viernes":
                System.out.println("Laboral");
                break;
            case "Sabado":

            case "Domingo":
                System.out.println("Festivo");
                break;
            default:
                System.out.println("Valor no valido");
        }
    } //Fin del main

}   //Fin de la clase EJ17

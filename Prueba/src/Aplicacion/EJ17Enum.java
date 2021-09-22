package Aplicacion;

import java.util.*;

/**
 *
 * @author Victor Manuel
 */
public class EJ17Enum {

    enum DIAS {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un dia de la semana:");
        String dia = sc.nextLine();
    
    } //Fin del main

}   //Fin de la clase EJ17Enum

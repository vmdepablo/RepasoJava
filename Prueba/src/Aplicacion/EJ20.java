package Aplicacion;

import java.util.*;

/**
 *
 * @author Victor Manuel
 */

public class EJ20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero:");
        int num = sc.nextInt();
        int contador = 0;
            for(int i = 1; i <= num;i++){
                if(num%i == 0){
                    contador++;
                }
            }
        if(contador == 2){
            System.out.println("Es primo");
        }
        else{
            System.out.println("No es primo");
        }
    } //Fin del main

}   //Fin de la clase EJ20

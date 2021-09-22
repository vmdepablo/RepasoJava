
package Aplicacion;
import java.util.*;
/**
 *
 * @author Victor Manuel
 */

public class EJ14 {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        double solPos;
        double solNeg;
        double comp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un primer número: ");
        a = sc.nextInt();
        System.out.print("Introduce un segundo número: ");
        b = sc.nextInt();
        System.out.print("Introduce un tercero número: ");
        c = sc.nextInt();
        comp = (int) Math.pow(b, 2)-(4*a*c);
        if(comp > 0){
            solPos = (-b + Math.sqrt(comp))/(2*a);
            solNeg = (-b - Math.sqrt(comp))/(2*a);
            System.out.println("El resultado positivo es: " + solPos);
            System.out.println("El resultado negativo es: " + solNeg);
        }else if(comp == 0){
            solNeg = (-1 * b - Math.sqrt(comp))/(2*a);
            System.out.println("El resultado es: " + solNeg);
        }else if(comp < 0){
            System.out.println("No hay solución");
        }
    } //Fin del main

}   //Fin de la clase EJ14

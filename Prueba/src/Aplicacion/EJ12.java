
package Aplicacion;

/**
 *
 * @author Victor Manuel
 */

public class EJ12 {

    public static void main(String[] args) {
        int par;
        int impar;
        int i=0;
        while(i<=101){
            par = i%2;
            impar =i%3;
            if(par == 0 && impar==0){
                System.out.println( i + " es divisible entre 2 y entre 3");
            }
            i++;
        }
    } //Fin del main

}   //Fin de la clase EJ12

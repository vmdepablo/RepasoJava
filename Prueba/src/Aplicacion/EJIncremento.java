package Aplicacion;

/**
 *
 * @author Victor Manuel
 */
public class EJIncremento {

    public static void main(String[] args) {
        int x=1;
        int y=1;
        while (x<4) {
            y += ++x;
            System.out.println(y + " Preincremento");
        }
        x=1;
        y=1;
        while (x<4) {
            y += x++;
            System.out.println(y + " Postincremento");
        }
    } //Fin del main

}   //Fin de la clase EJIncremento

package Aplicacion;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Victor Manuel
 */
public class EjPrintf {

    public static void main(String[] args) {
        int id = 1;
        LinkedList<String> nombres = new LinkedList();
        nombres.add("Frankz");
        nombres.add("Carlos");
        nombres.add("Diego");
        nombres.add("Víctor");
        nombres.add("Constantin");
        nombres.add("Víctor Manuel");
        nombres.add("Jorge");
        nombres.add("Sergio");
        nombres.add("Miguel Ángel");
        nombres.add("Alejandro");
        nombres.add("Eizan");
        nombres.add("Pedro Enrique");
        LinkedList<String> apellido = new LinkedList();
        apellido.add("Bañón");
        apellido.add("Bermejo");
        apellido.add("Cáceres");
        apellido.add("Caja");
        apellido.add("Carabut");
        apellido.add("De Pablo");
        apellido.add("González");
        apellido.add("Gutiérrez");
        apellido.add("Martín");
        apellido.add("Plaza");
        apellido.add("Rosa");
        apellido.add("Vidal");
        ListIterator<String> nomL = nombres.listIterator();
        ListIterator<String> apeL = apellido.listIterator();
        System.out.println("ID \t Apellidos \t Nombre \t Notas");
        System.out.println("----------------------------------------------");
        while (nomL.hasNext()) {
            System.out.printf("%-2d \t %-8s  \t %-8s \t %.2f \n", id, apeL.next(), nomL.next(), notas(nombres));
            id++;
        }
    } //Fin del main
    public static double notas(LinkedList<String> nombres) {
        double notas = 0;
        for (int i = 1; i <= nombres.size(); i++) {
            notas = Math.random() * 10;
        }
        return notas;
    }
}
   //Fin de la clase EjPrintf

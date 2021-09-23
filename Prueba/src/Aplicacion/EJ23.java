package Aplicacion;

import javax.swing.*;

/**
 *
 * @author Victor Manuel
 */
public class EJ23 {

    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("Introduce una frase: ");
        String cambio = "";
        if (cadena.contains("A")) {
            cambio = cadena.replaceAll("A", "E");
            if (cadena.contains("a")) {
                cambio = cambio.replaceAll("a", "e");
            }
        }
        System.out.println(cambio);
    } //Fin del main

}   //Fin de la clase EJ23

package Aplicacion;

import javax.swing.*;

/**
 *
 * @author Victor Manuel
 */
public class EJ22 {

    public static void main(String[] args) {

        String cadena = JOptionPane.showInputDialog("Introduce una cadena de texto");
        int numVoc = 0;
        char carac;
        int j = 0;
        for(int i = 0;i < cadena.length();i++) {
            carac = cadena.charAt(i)
            switch (carac) {
                case 'A':
                    numVoc++;
                    break;
                case 'a':
                    numVoc++;
                    break;
                case 'E':
                    numVoc++;
                    break;
                case 'e':
                    numVoc++;
                    break;
                case 'I':
                    numVoc++;
                    break;
                case 'i':
                    numVoc++;
                    break;
                case 'O':
                    numVoc++;
                    break;
                case 'o':
                    numVoc++;
                    break;
                case 'U':
                    numVoc++;
                    break;
                case 'u':
                    numVoc++;
                    break;
                
            }
        }
        String frase = cadena + " tenía " + numVoc + " vocales.";
        JOptionPane.showMessageDialog(null, frase, "Vocales en la frase", JOptionPane.INFORMATION_MESSAGE);
    } //Fin del main

}   //Fin de la clase EJ22

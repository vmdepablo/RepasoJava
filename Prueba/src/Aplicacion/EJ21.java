package Aplicacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Victor Manuel
 */
public class EJ21 {

    public static void main(String[] args) {

        int n1, n2;
        String num1 = JOptionPane.showInputDialog("Introduce un primer número");
        n1 = Integer.parseInt(num1);
        String num2 = JOptionPane.showInputDialog("Introduce un segundo número");
        n2 = Integer.parseInt(num2);
        int contador = 0;
        int num = 0;
        num = n1;
        while (num == n2) {
            for (int i = 1; n1 <= n2; i++) {
                if (num % i == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                JOptionPane.showMessageDialog(null, num);
            }
            if (num <= n1) {
                num++;
                n1++;
                contador = 0;
            }
        }
    } //Fin del main

}   //Fin de la clase EJ21

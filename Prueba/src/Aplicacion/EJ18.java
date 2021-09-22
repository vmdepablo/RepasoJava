package Aplicacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Victor Manuel
 */
public class EJ18 {

    public static void main(String[] args) {
        int n1, n2;
        String num1 = JOptionPane.showInputDialog("Introduce un primer número");
        n1 = Integer.parseInt(num1);
        String num2 = JOptionPane.showInputDialog("Introduce un segundo número");
        n2 = Integer.parseInt(num2);
        int cuenta = 1;
        if (n1 <= 0 || n2 <= 0 || n2 >= n1) {
            JOptionPane.showMessageDialog(null, "Introduce números válidos");
        } else {
            while (cuenta <= 50) {
                double op1 = n1 * Math.random() * 10;
                op1 = (int) op1;
                if (op1 <= n2 && op1 >= n1) {
                    JOptionPane.showMessageDialog(null, op1);
                    cuenta++;
                }
                op1 = 0;
            }
        }
    } //Fin del main

}   //Fin de la clase EJ18

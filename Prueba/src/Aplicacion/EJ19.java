
package Aplicacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Victor Manuel
 */

public class EJ19 {

    public static void main(String[] args) {
        
        String num = JOptionPane.showInputDialog("Introduce un numero");
        if(Integer.parseInt(num) <= 0){
            JOptionPane.showMessageDialog(null,"Introduzca un número distinto a 0");
        }
        else{
            int leng = num.length();
            String frase = "La longitud de carácteres de " + num + " es de " + leng;
            JOptionPane.showMessageDialog(null,frase);
        }
    } //Fin del main

}   //Fin de la clase EJ19

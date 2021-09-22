
package Aplicacion;
import javax.swing.*;
/**
 *
 * @author Victor Manuel
 */

public class EJ29 {

    public static void main(String[] args) {
        String frase = "Introduce un nombre";
        String mayus="MAYUSCULAS";
        String min="minusculas";
        Object[] valores ={"MAYUSCULA","minuscula"};
        String nombre = JOptionPane.showInputDialog(null,frase,"Introducción",1);
        int opcion = JOptionPane.showOptionDialog(null, "¿A qué quieres convertir?","Elección",JOptionPane.YES_NO_OPTION,1,null,valores,valores[0]);
        if(opcion == 0){
            nombre = nombre.toUpperCase();
            JOptionPane.showMessageDialog(null, nombre);
        }else if(opcion == 1){
            nombre = nombre.toLowerCase();
            JOptionPane.showMessageDialog(null, nombre);
        }
        
    } //Fin del main

}   //Fin de la clase EJ29

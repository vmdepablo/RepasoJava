package Ej1;

import java.util.LinkedList;
import java.util.ListIterator;
import javax.swing.*;

/**
 *
 * @author Victor Manuel
 */
public class main {

    public static void main(String[] args) {

        String numCoches = JOptionPane.showInputDialog("Introduce la cantidad de coches que deseas crear:");
        int num = Integer.parseInt(numCoches);
        int contador = 1;
        LinkedList<Vehiculo> listaCoches = new LinkedList();
        String marca;
        String modelo;
        String poten;
        String preci;
        double precio;
        int cv;
        while (contador <= num) {
            marca = JOptionPane.showInputDialog("Introduce la marca:");
            modelo = JOptionPane.showInputDialog("Introduce el modelo:");
            poten = JOptionPane.showInputDialog("Introduce la potencia:");
            cv = Integer.parseInt(poten);
            preci = JOptionPane.showInputDialog("Introduce el precio:");
            precio = Double.parseDouble(preci);
            Vehiculo coche = new Vehiculo(marca, modelo, cv, precio);
            listaCoches.add(coche);
            contador++;
        }
        ListIterator<Vehiculo> liCoches = listaCoches.listIterator();
        double minPrecio = 0;
        Vehiculo cocheFinal = null;
        minPrecio = listaCoches.get(0).getPrecio();
        int indice = 0;
        while (liCoches.hasNext()) {
            cocheFinal = liCoches.next();
            if (cocheFinal.getPrecio() < minPrecio){
                minPrecio = cocheFinal.getPrecio();
                indice = liCoches.nextIndex();
            }
        }

        JOptionPane.showMessageDialog(null, cocheFinal.toString());

    } //Fin del main

}   //Fin de la clase Ej1

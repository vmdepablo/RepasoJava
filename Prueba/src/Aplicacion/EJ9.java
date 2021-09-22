/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import java.util.*;

/**
 *
 * @author CFGS
 */
public class EJ9 {

    public static void calcularIVA() {
        final double IVA = 0.05;
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Introduce un precio");
        double precio = sc3.nextDouble();
        double precioSIVA = precio * IVA;
        double precioCIVA = precioSIVA + precio;
        System.out.println(precioCIVA);
    }
}

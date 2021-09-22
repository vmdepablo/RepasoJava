/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import java.util.Scanner;

/**
 *
 * @author CFGS
 */
public class EJ7 {
    
    public static void letraASCII(){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduce un caracter:");
        int carac = sc2.nextInt();
        char crc =(char)carac;
        System.out.println(crc);
    }
}

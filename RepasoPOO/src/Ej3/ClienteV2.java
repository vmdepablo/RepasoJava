/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3;

import java.util.*;

/**
 *
 * @author Victor Manuel
 */
public class ClienteV2 {

    private String nombre;
    private String apellido;
    private String DNI;
    private Cuenta[] cuentas;
    private int dinero;
    private int opcion;
    Scanner sc = new Scanner(System.in);

    public void retirarDinero(Cuenta[] cuentas) {
        System.out.print("Introduce la cuenta donde quiere retirar (3 para salir):");
        opcion = sc.nextInt();
        do {
            if (opcion == cuentas[0].getId()) {
                System.out.print("Introduzca la cantidad a retirar:");
                dinero = sc.nextInt();
                cuentas[0].setSaldo(cuentas[0].getSaldo() - dinero);
            } else if (opcion == cuentas[1].getId()) {
                System.out.print("Introduzca la cantidad a retirar:");
                dinero = sc.nextInt();
                cuentas[1].setSaldo(cuentas[1].getSaldo() - dinero);
            }
            System.out.print("Introduce la cuenta donde quiere retirar (3 para salir)");
            opcion = sc.nextInt();
        } while (opcion != 3);

    }

    public void ingresarDinero(Cuenta[] cuentas) {
        System.out.print("Introduce la cuenta donde quiere ingresar (3 para salir)");
        opcion = sc.nextInt();
        do {
            if (opcion == cuentas[0].getId()) {
                System.out.print("Introduzca la cantidad a ingresar:");
                dinero = sc.nextInt();
                cuentas[0].setSaldo(cuentas[0].getSaldo() + dinero);
            } else if (opcion == cuentas[1].getId()) {
                System.out.print("Introduzca la cantidad a ingresar:");
                dinero = sc.nextInt();
                cuentas[1].setSaldo(cuentas[1].getSaldo() + dinero);
            }
            System.out.print("Introduce la cuenta donde quiere ingresar (3 para salir)");
            opcion = sc.nextInt();
        } while (opcion != 3);
    }

    public void consultarSaldo(Cuenta[] cuentas) {
        System.out.print("Introduce la cuenta donde quiere consultar el saldo (3 para salir)");
        opcion = sc.nextInt();
        if (opcion == cuentas[0].getId()) {
            System.out.println(cuentas[0].getSaldo() + "€");
        } else if (opcion == cuentas[1].getId()) {
            System.out.println(cuentas[1].getSaldo() + "€");
        }
    }

    public ClienteV2(String nombre, String apellido, String DNI, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

}

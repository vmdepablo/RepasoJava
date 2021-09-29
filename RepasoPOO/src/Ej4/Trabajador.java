/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej4;

/**
 *
 * @author Victor Manuel
 */
public class Trabajador {

    private int numEmpleado;
    private String nombre;
    private int numDepart;
    private int salario;

    public Trabajador() {

    }

    public Trabajador(int numEmpleado, String nombre, int numDepart, int salario) {
        this.numEmpleado = numEmpleado;
        this.nombre = nombre;
        this.numDepart = numDepart;
        this.salario = salario;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumDepart() {
        return numDepart;
    }

    public void setNumDepart(int numDepart) {
        this.numDepart = numDepart;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}

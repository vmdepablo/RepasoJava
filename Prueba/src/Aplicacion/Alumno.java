/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

/**
 *
 * @author CFGS
 */
public class Alumno {
    String apellido;
    String nombre;
    int id;
    static int contador = 1;
    static double notas;


    public Alumno(String apellido,String nombre){
        this.apellido = apellido;
        this.nombre = nombre;
        id = contador++;
        notas = Math.random() * 10;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double getNotas() {
        return notas;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }
    
}

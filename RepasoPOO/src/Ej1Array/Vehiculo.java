/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1Array;

/**
 *
 * @author Admin
 */
public class Vehiculo {
    
    private String marca, modelo;
    private int potencia;
    private double precio;
    
    //Constructor
    public Vehiculo(String marca, String modelo, int potencia, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.precio = precio;
    }
    
    //Getters and setters
    public double getPrecio() {
        return precio;
    }
    
    //Sobrescribimos metodo toString
    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", potencia=" 
                + potencia + ", precio=" + precio + '}';
    }
    
    
}

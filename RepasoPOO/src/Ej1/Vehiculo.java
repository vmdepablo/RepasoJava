/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1;

/**
 *
 * @author CFGS
 */
public class Vehiculo {

    private String marca;
    private String modelo;
    private int potencia;
    private double precio;
    private int id = 1;

    public Vehiculo(String marca, String modelo, int potencia, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.precio = precio;
        id++;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "El vehiculo de la marca " + marca + " y modelo " + " es el más barato con un precio de " + precio + "€";
    }
    
}


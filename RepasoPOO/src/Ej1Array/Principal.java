package POO;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String marca, modelo;
        double precio;
        int potencia, numVehiculos, indice, indiceCocheMasBarato;
        
        System.out.print("Introduce el número de vehículos: ");
        numVehiculos = sc.nextInt();
        
        Vehiculo[] coches = new Vehiculo[numVehiculos];
        
        //RELLENAR LOS DATOS DEL ARRAY  --------------------
        for (int i=0; i < coches.length; i++) {
            
            System.out.println("\nDatos del vehículo " + i+1);
            System.out.print("Introduce marca: ");
            marca = sc.next();
            System.out.print("Introduce modelo: ");
            modelo = sc.next();
            System.out.print("Introduce potencia: ");
            potencia = sc.nextInt();
            System.out.print("Introduce precio: ");
            precio = sc.nextDouble();
            
            coches[i] = new Vehiculo(marca, modelo, potencia, precio);
        }
        System.out.println("");
        
        //DETERMINAR EL COCHE MÁS BARATO -------------------
        indiceCocheMasBarato = getIndiceCocheMasBarato(coches);
        
        int posicion= ++indiceCocheMasBarato;
        
        //MOSTRAR DATOS DEL VEHICULO MÁS BARATO
        System.out.printf("El coche más barato es el %d\n%s", 
                posicion, coches[indiceCocheMasBarato]);
        
        
        
    } //Fin del main

    private static int getIndiceCocheMasBarato(Vehiculo[] coches) {
        double precioMasBarato;
        int indice = 0;
        
        precioMasBarato = coches[0].getPrecio();
        
        for (int i = 1; i < coches.length; i++) {
            
            if (coches[i].getPrecio() < precioMasBarato) {
                precioMasBarato = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;        
    }

} //Fin de la clase Principal 

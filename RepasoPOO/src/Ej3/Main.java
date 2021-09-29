
package Ej3;

/**
 *
 * @author Victor Manuel
 */

public class Main {

    public static void main(String[] args) {
        
        Cuenta[] arrayCuentas = new Cuenta[2];
        arrayCuentas[0] = new Cuenta(1,20000);
        arrayCuentas[1] = new Cuenta(2,10000);
        ClienteV2 cliente1 = new ClienteV2("Jose","Antonio","50000000F",arrayCuentas);
        cliente1.ingresarDinero(arrayCuentas);
        cliente1.retirarDinero(arrayCuentas);
        cliente1.consultarSaldo(arrayCuentas);
        
    } //Fin del main

}   //Fin de la clase Main

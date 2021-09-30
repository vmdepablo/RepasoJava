package EJ6;


/**
 *
 * @author Victor Manuel
 */

public class Main {

    public static void main(String[] args) {
        Persona[] arrayPersonas = new Persona[10];
        
        arrayPersonas[0] = new Jefe(10,"acme","Jefe 1");
        arrayPersonas[1] = new Jefe(8,"acme","Jefe 2");
        arrayPersonas[2] = new Jefe(100,"acme","Jefe 3");
        arrayPersonas[3] = new Jefe(1000,"acme","Jefe 4");
        arrayPersonas[4] = new Jefe(2,"acme","Jefe 5");
        arrayPersonas[5] = new Jefe(20,"acme","Jefe 6");
        arrayPersonas[6] = new Comercial(10000,"acme","Comercial 1");
        arrayPersonas[7] = new Comercial(15000,"acme","Comercial 2");
        arrayPersonas[8] = new Comercial(12000,"acme","Comercial 3");
        arrayPersonas[9] = new Tecnico((Jefe) arrayPersonas[0],"acme","Tecnico 1");
        for(int i = 0; i < 10;i++){
            System.out.println("----------------------------------");
            System.out.println("Persona " + (i+1));
            System.out.println("----------------------------------");
            System.out.println(arrayPersonas[i]);
        }
    } //Fin del main

}   //Fin de la clase Main

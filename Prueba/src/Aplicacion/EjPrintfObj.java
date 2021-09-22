package Aplicacion;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Victor Manuel
 */
public class EjPrintfObj {

    public static void main(String[] args) {
        Alumno alum1 = new Alumno("Bañón", "Frankz");
        Alumno alum2 = new Alumno("Bermejo", "Carlos");
        Alumno alum3 = new Alumno("Cáceres", "Diego");
        Alumno alum4 = new Alumno("Caja", "Víctor");
        Alumno alum5 = new Alumno("Carabut", "Constantin");
        Alumno alum6 = new Alumno("De Pablo", "Víctor Manuel");
        Alumno alum7 = new Alumno("González", "Jorge");
        Alumno alum8 = new Alumno("Gutiérrez", "Sergio");
        Alumno alum9 = new Alumno("Martín", "Miguel Ángel");
        Alumno alum10 = new Alumno("Plaza", "Alejandro");
        Alumno alum11 = new Alumno("Rosa", "Eizan");
        Alumno alum12 = new Alumno("Vidal", "Pedro Enrique");
        LinkedList<Alumno> alum = new LinkedList();
        alum.add(alum1);
        alum.add(alum2);
        alum.add(alum3);
        alum.add(alum4);
        alum.add(alum5);
        alum.add(alum6);
        alum.add(alum7);
        alum.add(alum8);
        alum.add(alum9);
        alum.add(alum10);
        alum.add(alum11);
        alum.add(alum12);
        ListIterator<Alumno> lAlum = alum.listIterator();
        System.out.println("ID \t Apellidos \t Nombre \t Notas");
        System.out.println("----------------------------------------------");
        while(lAlum.hasNext()){
            Alumno nose = lAlum.next();
            System.out.printf("%-2d \t %-8s  \t %-8s \t %.2f \n",nose.getId(), nose.getApellido(), nose.getNombre(), nose.getNotas());
    }
        

} //Fin del main

}   //Fin de la clase EjPrintfObj

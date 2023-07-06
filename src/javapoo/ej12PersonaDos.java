package javapoo;

import Entidades.PersonaDos;
import Servicios.PersonaDosServicio;
import java.util.Scanner;

public class ej12PersonaDos {

    public static void main(String[] args) {
        PersonaDosServicio ps = new PersonaDosServicio();
        PersonaDos persona = ps.crearPersona();
        Scanner scan = new Scanner(System.in);
        System.out.println("La edad de " + persona.getNombre() + " es la siguiente: " + ps.calcularEdad(persona));
        System.out.println("-----");
        System.out.println("Vamos a preguntarle al programa si " + persona.getNombre() + " es menor que alguna edad");
        System.out.println("Ingrese la edad que desea consultar:");
        int edad = scan.nextInt();
        System.out.println(ps.menorQue(persona, edad));
        System.out.println("-----");
        System.out.println("Ahora mostraremos el objeto");
        System.out.println(ps.mostrarPersona(persona));
    }

}

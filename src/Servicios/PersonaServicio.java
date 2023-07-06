package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        persona.setNombre(scan.next());
        System.out.println("Ingrese la edad de la persona");
        persona.setEdad(scan.nextInt());
        System.out.println("Ingrese el sexo de la persona");
        System.out.println("H para Hombre - M para Mujer - O para Otro");
        String genero = scan.next().toUpperCase();
        while (!(genero.equals("H") || genero.equals("M") || genero.equals("O"))) {
            if (!(genero.equals("H") || genero.equals("M") || genero.equals("O"))) {
                System.out.println("Incorrecto, ingrese alguna de las opciones antes especificadas");
                genero = scan.next().toUpperCase();

            } else {
                persona.setSexo(genero);
            }
        }
        /*
        Lo mismo que arriba pero usando un bucle do-while
        do {

            if (!(genero.equals("H") || genero.equals("M") || genero.equals("O"))) {
                System.out.println("Incorrecto, ingrese alguna de las opciones antes especificadas");
                genero = scan.nextLine();

            } else {
                persona.setSexo(genero);
            }

        } while (!(genero.equals("H") || genero.equals("M") || genero.equals("O")));
         */
        System.out.println("Ingrese el peso de la persona");
        persona.setPeso(scan.nextDouble());
        System.out.println("Ingrese la altura de la persona");
        persona.setAltura(scan.nextDouble());
        return persona;
    }

    public int calcularIMC(Persona persona) {
        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        if (imc < 20) {
            return -1;

        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
    public boolean esMayorDeEdad(Persona persona){
        return persona.getEdad()>=18;
    }

}

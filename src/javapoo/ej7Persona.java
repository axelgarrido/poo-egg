package javapoo;

import Entidades.Persona;
import Servicios.PersonaServicio;

public class ej7Persona {

    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        System.out.println("Se van a ingresar los datos de la primera persona");
        Persona p1 = ps.crearPersona();
        System.out.println("Se van a ingresar los datos de la segunda persona");
        Persona p2 = ps.crearPersona();
        System.out.println("Se van a ingresar los datos de la tercera persona");
        Persona p3 = ps.crearPersona();
        System.out.println("Se van a ingresar los datos de la cuarta persona");
        Persona p4 = ps.crearPersona();

        int[] imc = new int[4];
        boolean[] mayor = new boolean[4];

        imc[0] = ps.calcularIMC(p1);
        imc[1] = ps.calcularIMC(p2);
        imc[2] = ps.calcularIMC(p3);
        imc[3] = ps.calcularIMC(p4);
        int auxImcBajo = 0;
        int auxImcIdeal = 0;
        int auxImcAlto = 0;
        for (int i = 0; i < imc.length; i++) {
            switch (imc[i]) {
                case 1:
                    auxImcAlto++;
                    break;
                case 0:
                    auxImcIdeal++;
                    break;
                case -1:
                    auxImcBajo++;
                    break;
                default:
                    throw new AssertionError();
            }
        }

        mayor[0] = ps.esMayorDeEdad(p1);
        mayor[1] = ps.esMayorDeEdad(p2);
        mayor[2] = ps.esMayorDeEdad(p3);
        mayor[3] = ps.esMayorDeEdad(p4);
        int auxMayor = 0;

        for (int i = 0; i < mayor.length; i++) {
            if (mayor[i]) {
                auxMayor++;
            }
        }
        
        System.out.println("El porcentaje de mayores de edad es: " + (auxMayor*100/mayor.length)+"%");
        System.out.println("El porcentaje de personas con peso debajo del ideal es: " + (auxImcBajo*100/imc.length)+"%");
        System.out.println("El porcentaje de personas con peso ideal: " + (auxImcIdeal*100/imc.length)+"%");
        System.out.println("El porcentaje de personas con sobrepeso: " + (auxImcAlto*100/imc.length)+"%");

    }

}

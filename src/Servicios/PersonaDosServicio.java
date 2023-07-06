/*
Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.

 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.

 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.

 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package Servicios;

import Entidades.PersonaDos;
import java.util.Date;
import java.util.Scanner;

public class PersonaDosServicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    Date fechaActual = new Date();

    public PersonaDos crearPersona() {
        PersonaDos persona = new PersonaDos();
        System.out.println("Ingresar nombre de la persona:");
        persona.setNombre(scan.next());
        System.out.println("Ingresar año de nacimiento");
        int anio = scan.nextInt();
        System.out.println("Ingresar mes de nacimiento");
        int mes = scan.nextInt();
        System.out.println("Ingresar dia de nacimiento");
        int dia = scan.nextInt();
        Date fechaNacimiento = new Date(anio - 1900, mes - 1, dia);
        persona.setFechaNacimiento(fechaNacimiento);
        return persona;
    }

    public int calcularEdad(PersonaDos persona) {
        return (fechaActual.getYear()) - (persona.getFechaNacimiento().getYear());
    }

    public boolean menorQue(PersonaDos persona, int edad) {
        return persona.getFechaNacimiento().getYear() < edad;
    }

    public PersonaDos mostrarPersona(PersonaDos persona) {
        return persona;
    }

}

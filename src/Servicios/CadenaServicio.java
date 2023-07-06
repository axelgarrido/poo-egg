package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {
        Cadena cadena = new Cadena();
        System.out.println("Ingrese una frase");
        cadena.setFrase(scan.next());
        return cadena;
    }

    public void mostrarVocales(Cadena cadena) {
        String frase = cadena.getFrase().toLowerCase();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                contador += 1;
            }
            /*
            Podemos hacer lo mismo que en el if pero con un switch
            
            switch (frase.substring(i,i+1)) {
                case "a":
                    contador += 1;
                    break;
                case "e":
                    contador += 1;
                    break;
                case "i":
                    contador += 1;
                    break;
                case "o":
                    contador += 1;
                    break;
                case "u":
                    contador += 1;
                    break;
                default:
                    throw new AssertionError();
            }
             */

        }
        System.out.println("La frase tiene " + contador + " vocales.");
    }

    public void invertirFrase(Cadena cadena) {
        String frase = cadena.getFrase();
        String fraseAux = "";
        for (int i = frase.length(); i > 0; i--) {
            fraseAux += frase.substring(i - 1, i);
        }
        System.out.println("La frase invertida quedaria asi:");
        System.out.println(fraseAux);
    }

    public void vecesRepetido(Cadena cadena, String letra) {
        String frase = cadena.getFrase().toLowerCase();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, i + 1).equals(letra)) {
                contador += 1;
            }
        }
        System.out.println("La letra '" + letra + "' se repitio " + contador + " veces.");

    }

    public void compararLongitud(Cadena cadena, String frase) {
        if (frase.length() == cadena.getLongitud()) {
            System.out.println("Las frases tienen la misma longitud");
        } else {
            System.out.println("Las frases son de distinta longitud");
        }
    }

    public void unirFrases(Cadena cadena, String frase) {
        System.out.println("Las dos frases unidas quedan de la siguiente manera:");
        System.out.println(cadena.getFrase() + " " + frase);
        /*
        No sabia si modificar la frase ingresada al principio, pero se puede hacer de la siguiente forma
        String fraseAux = cadena.getFrase() + " " + frase;
        cadena.setFrase(fraseAux);
         */
    }

    public void reemplazar(Cadena cadena, String letra) {
        String frase = cadena.getFrase();
        String fraseAux = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, i + 1).equals("a")) {
                fraseAux += letra;
            } else {
                fraseAux += frase.substring(i, i + 1);
            }
        }
        System.out.println("La frase quedo de la siguiente forma:");
        System.out.println(fraseAux);
    }

    public boolean contiene(Cadena cadena, String letra) {
        String frase = cadena.getFrase();
        int i = 0;
        while (i < frase.length()) {
            if (frase.substring(i, i + 1).equals(letra)) {
                System.out.println("Se encontro la letra");
                return true;
            }
            i += 1;
        }
        System.out.println("No se encontro la letra");
        return false;
    }
}

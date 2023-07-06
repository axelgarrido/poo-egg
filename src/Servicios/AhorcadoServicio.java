package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoServicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    Ahorcado ahorcado = new Ahorcado();

    public Ahorcado crearJuego() {
        System.out.println("Ingrese la palabra");
        String palabra = scan.next();
        String[] palabraArray = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            palabraArray[i] = palabra.substring(i, i + 1);
        }
        ahorcado.setPalabra(palabraArray);
        System.out.println("Ingrese la cantidad de intentos");
        ahorcado.setIntentos(scan.nextInt());
        ahorcado.setLetrasEncontradas(0);
        return ahorcado;
    }

    public void longitud() {
        System.out.println("Longitud de la palabra: " + ahorcado.getPalabra().length);
    }

    public void buscar(String letra) {
        boolean bool = false;
        int contador = 0;
        for (int i = 0; i < ahorcado.getPalabra().length; i++) {
            if (letra.equals(ahorcado.getPalabra()[i]) && contador > 0) {
                System.out.println("La letra '" + letra + "' se encontro " + (contador + 1) + " veces en la palabra");
                contador++;
                continue;
            } else if (letra.equals(ahorcado.getPalabra()[i])) {
                System.out.println("Si, la letra '" + letra + "' se encuentra en la palabra!");
                contador++;
                continue;
            } else {
                if (i == ahorcado.getPalabra().length - 1 && contador == 0) {
                    System.out.println("No, la letra '" + letra + "' no esta en la palabra ingresada");
                    bool = true;
                }

            }
        }
        ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + contador);

        if (bool) {
            ahorcado.setIntentos(ahorcado.getIntentos() - 1);
        }
    }

    public void encontradas(String letra) {
        System.out.println("Número de letras (encontradas, faltantes): " + "(" + (ahorcado.getLetrasEncontradas()) + " , " + (ahorcado.getPalabra().length - ahorcado.getLetrasEncontradas()) + ")");
    }

    public void intentos() {
        System.out.println("Número de oportunidades restantes: " + ahorcado.getIntentos());
    }

    public void juego() {
        boolean ganar = false;
        crearJuego();
        while (ahorcado.getIntentos() > 0 && ganar == false) {
            String letra;
            do {
                System.out.println("Ingrese una letra:");
                letra = scan.next();
                if (letra.length() != 1) {
                    System.out.println("Debes ingresar solo 1 letra, proba de nuevo");
                    letra = scan.next();
                }
            } while (letra.length() != 1);
            longitud();
            buscar(letra);
            encontradas(letra);
            intentos();
            if (ahorcado.getPalabra().length == ahorcado.getLetrasEncontradas()) {
                ganar = true;
            }
        }
        if (ganar) {
            System.out.println("Felicidades, ganaste!");
        } else {
            System.out.println("Te quedaste sin intentos! Mas suerte la proxima.");
        }
    }
}

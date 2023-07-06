package Servicios;

import Entidades.Meses;
import java.util.Scanner;

public class MesesServicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public void adivinarMes(Meses meses) {
        int random = (int) (0 + Math.round(Math.random() * (11 - 0 + 1)));
        String mesSecreto = meses.getMeses()[random];

        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
        String intento = scan.next();
        while (true) {
            if (mesSecreto.equals(intento)) {
                System.out.println("¡Ha acertado!");
                break;
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
                intento = scan.next();
            }
        }
    }
}

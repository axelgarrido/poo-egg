package Servicios;

import Entidades.Punto;
import java.util.Scanner;

public class PuntoServicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Punto crearPuntos() {
        Punto puntos = new Punto();
        System.out.println("Ingrese x1");
        puntos.setX1(scan.nextInt());
        System.out.println("Ingrese y1");
        puntos.setY1(scan.nextInt());
        System.out.println("Ingrese x2");
        puntos.setX2(scan.nextInt());
        System.out.println("Ingrese y2");
        puntos.setY2(scan.nextInt());
        return puntos;
    }

    public void calcularDistancia(Punto punto) {
        double distancia = Math.sqrt(Math.pow((punto.getX2() - punto.getX1()), 2) + Math.pow((punto.getY2() - punto.getY1()), 2));
        System.out.println("La distancia entre los puntos es de: " + distancia);
    }
}

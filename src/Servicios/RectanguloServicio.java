package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

public class RectanguloServicio {

    Scanner scan = new Scanner(System.in);

    public Rectangulo crearRectangulo() {
        Rectangulo rectangulo = new Rectangulo();
        System.out.println("Ingrese Base del rectangulo.");
        rectangulo.setBase(scan.nextInt());
        System.out.println("Ingrese Altura del rectangulo.");
        rectangulo.setAltura(scan.nextInt());
        return rectangulo;
    }

    public void superficie(Rectangulo rectangulo) {
        System.out.println("La superficie del rectangulo es: " + (rectangulo.getBase() * rectangulo.getAltura()));
    }

    public void perimetro(Rectangulo rectangulo) {
        System.out.println("El perimetro del rectangulo es: " + ((rectangulo.getBase() + rectangulo.getAltura()) * 2));
    }

    public void graficar(Rectangulo rectangulo) {
        for (int i = 0; i < rectangulo.getBase(); i++) {
            for (int j = 0; j < rectangulo.getAltura(); j++) {
                if (i == 0 || i == rectangulo.getBase() - 1 || j == 0 || j == rectangulo.getAltura() - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}

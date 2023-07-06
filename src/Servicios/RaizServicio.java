package Servicios;

import Entidades.Raiz;
import java.util.Scanner;

public class RaizServicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Raiz ingresarVariables() {
        Raiz raiz = new Raiz();
        System.out.println("Ingrese la variable 'a'");
        raiz.setA(scan.nextInt());
        System.out.println("Ingrese la variable 'b'");
        raiz.setB(scan.nextInt());
        System.out.println("Ingrese la variable 'c'");
        raiz.setC(scan.nextInt());
        return raiz;
    }

    public double getDiscriminante(Raiz raiz) {
        double discriminante = Math.pow(raiz.getB(), 2) - 4 * raiz.getA() * raiz.getC();
        return discriminante;
    }

    public boolean tieneRaices(Raiz raiz) {
        double discriminante = getDiscriminante(raiz);
        return discriminante >= 0;
    }

    public boolean tieneRaiz(Raiz raiz) {
        double discriminante = getDiscriminante(raiz);
        return discriminante == 0;
    }

    public void obtenerRaices(Raiz raiz) {
        int a = raiz.getA();
        int b = raiz.getB();
        int c = raiz.getC();
        if (tieneRaices(raiz)) {
            System.out.println("Raiz 1: " + ((b * -1) + Math.sqrt(Math.pow(b, 2) - 4 * a * c) / 2 * a));
            System.out.println("Raiz 2: " + ((b * -1) - Math.sqrt(Math.pow(b, 2) - 4 * a * c) / 2 * a));
        } else {
            System.out.println("No posee dos raices");
        }
    }

    public void obtenerRaiz(Raiz raiz) {
        int a = raiz.getA();
        int b = raiz.getB();
        int c = raiz.getC();
        if (tieneRaiz(raiz)) {
            System.out.println("El resultado de la raiz: " + ((b * -1) + Math.sqrt(Math.pow(b, 2) - 4 * a * c) / 2 * a));
        }
    }

    public void calcular(Raiz raiz) {
        if (tieneRaices(raiz)) {
            obtenerRaices(raiz);
        } else if (tieneRaiz(raiz)) {
            obtenerRaiz(raiz);
        } else {
            System.out.println("No existe solucion");
        }
    }
}

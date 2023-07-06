package javapoo;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;

public class ej6Nespresso {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera c1 = cs.crearCafetera();
        cs.llenarCafetera(c1);
        System.out.println("Ingrese el tamaño de la taza a servir");
        int taza = scan.nextInt();
        cs.servirTaza(taza, c1);
        System.out.println("Ingrese el tamaño de la segunda taza");
        int taza2 = scan.nextInt();
        cs.servirTaza(taza2, c1);
        cs.vaciarCafetera(c1);
        cs.agregarCafe(200, c1);
    }

}

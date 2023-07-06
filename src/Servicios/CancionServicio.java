package Servicios;

import Entidades.Cancion;
import java.util.Scanner;

public class CancionServicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Cancion ingresarCancion() {
        Cancion cancion = new Cancion();
        System.out.println("Ingrese el titulo de la cancion");
        cancion.setTitulo(scan.next());
        System.out.println("Ingrese el autor de la cancion");
        cancion.setAutor(scan.next());
        return cancion;
    }

    public void mostrarCancion(Cancion cancion) {
        System.out.println("El titulo de la cancion: " + cancion.getTitulo());
        System.out.println("El autor de la cancion: " + cancion.getAutor());
    }
}

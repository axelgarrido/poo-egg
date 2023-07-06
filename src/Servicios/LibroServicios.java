package Servicios;

import Entidades.Libro;
import java.util.Scanner;

public class LibroServicios {

    Scanner scan = new Scanner(System.in);

    public Libro crearLibro() {
        Libro libro = new Libro();
        System.out.println("Ingrese el ISBN");
        libro.setIsbn(scan.nextInt());
        System.out.println("Ingrese el Titulo");
        libro.setTitulo(scan.next());
        System.out.println("Ingrese el Autor");
        libro.setAutor(scan.next());
        System.out.println("Ingrese el numero de paginas");
        libro.setPaginas(scan.nextInt());

        return libro;
    }

    public void imprimirLibro(Libro libro) {
        System.out.println(libro);
    }
}

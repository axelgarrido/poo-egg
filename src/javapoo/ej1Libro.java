package javapoo;

import Entidades.Libro;
import Servicios.LibroServicios;

public class ej1Libro {

    public static void main(String[] args) {
        //arreglar el tema de los plurales
        LibroServicios ls = new LibroServicios();
        Libro l1 = ls.crearLibro();
        ls.imprimirLibro(l1);
    }

}

package javapoo;

import Entidades.Cancion;
import Servicios.CancionServicio;

public class ejex1Cancion {

    public static void main(String[] args) {
        CancionServicio cs = new CancionServicio();
        Cancion cancion = cs.ingresarCancion();
        cs.mostrarCancion(cancion);
    }

}

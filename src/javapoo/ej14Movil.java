package javapoo;

import Entidades.Movil;
import Servicios.MovilServicio;

public class ej14Movil {

    public static void main(String[] args) {
        MovilServicio ms = new MovilServicio();
        Movil movil = ms.cargarCelular();
        ms.ingresarCodigo(movil);
        System.out.println(movil);
    }

}

package javapoo;

import Entidades.Rectangulo;
import Servicios.RectanguloServicio;

public class ej4Rectangulo {

    public static void main(String[] args) {
        RectanguloServicio rs = new RectanguloServicio();
        Rectangulo r1 = rs.crearRectangulo();
        rs.superficie(r1);
        rs.perimetro(r1);
        rs.graficar(r1);

    }

}

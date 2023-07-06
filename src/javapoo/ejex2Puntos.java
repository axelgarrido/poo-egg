package javapoo;

import Entidades.Punto;
import Servicios.PuntoServicio;

public class ejex2Puntos {

    public static void main(String[] args) {
        PuntoServicio ps = new PuntoServicio();
        Punto puntos = ps.crearPuntos();
        ps.calcularDistancia(puntos);
    }
    
}

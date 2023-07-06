
package javapoo;

import Entidades.Circunferencia;
import Servicios.CircunferenciaServicio;

public class ej2Circunferencia {


    public static void main(String[] args) {
        CircunferenciaServicio cs = new CircunferenciaServicio();
        Circunferencia c1 = cs.crearCircunferencia();
        cs.area(c1);
        cs.perimetro(c1);
    }
    
}

package javapoo;

import Entidades.Operacion;
import Servicios.OperacionServicio;

public class ej3Operacion {

    public static void main(String[] args) {
        OperacionServicio os = new OperacionServicio();
        Operacion op1 = os.crearOperacion();
        os.sumar(op1);
        System.out.println("El resultado de la resta fue de: " + os.restar(op1));
        os.multiplicar(op1);
        os.dividir(op1);
    }

}

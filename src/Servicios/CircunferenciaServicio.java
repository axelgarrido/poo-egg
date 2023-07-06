package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;

public class CircunferenciaServicio {

    Scanner scan = new Scanner(System.in);

    public Circunferencia crearCircunferencia() {
        Circunferencia circ = new Circunferencia();
        System.out.println("Ingrese el radio");
        circ.setRadio(scan.nextDouble());
        return circ;

    }

    public void area(Circunferencia circ) {
        double radio = circ.getRadio();
        double area = 3.1416 * Math.pow(radio, 2);
        System.out.println("Cuando el radio es: "+radio+" - El area es de: "+area);
    }

    public void perimetro(Circunferencia circ) {
        double radio = circ.getRadio();
        double perimetro = 2 * 3.1416 * radio;
        System.out.println("Cuando el radio es: "+radio+" - El perimetro es de: "+perimetro);

    }
}

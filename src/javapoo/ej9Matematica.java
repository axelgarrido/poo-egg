package javapoo;

import Entidades.Matematica;
import Servicios.MatematicaServicio;

public class ej9Matematica {

    public static void main(String[] args) {
        MatematicaServicio ms = new MatematicaServicio();
        Matematica m1 = new Matematica();
        m1.setNum1(Math.random() * 10);
        m1.setNum2(Math.random() * 10);
        System.out.println("Numero 1: " + m1.getNum1());
        System.out.println("Numero 2: " + m1.getNum2());
        System.out.println("El mayor de los dos numeros: " + ms.devolverMayor(m1));
        System.out.println("La potencia del mayor como base por el menor como exponente(estando los dos numeros redondeados): " + ms.calcularPotencia(m1));
        System.out.println("La raiz cuadrada del menor numero(teniendo en cuenta que los numeros estan con su valor absoluto): " + ms.calculaRaiz(m1));
    }

}

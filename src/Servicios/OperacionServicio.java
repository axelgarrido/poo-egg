package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

public class OperacionServicio {

    Scanner scan = new Scanner(System.in);

    public Operacion crearOperacion() {
        Operacion op = new Operacion();
        System.out.println("Ingrese el primer numero");
        op.setNumero1(scan.nextInt());
        System.out.println("Ahora ingrese el segundo numero");
        op.setNumero2(scan.nextInt());
        return op;

    }

    public void sumar(Operacion op) {
        int resultado = (op.getNumero1()) + (op.getNumero2());
        System.out.println("El resultado de la suma fue: " + resultado);
    }

    public static int restar(Operacion op) {
        int resultado = op.getNumero1() - op.getNumero2();
        return resultado;
    }

    public void multiplicar(Operacion op) {
        int num1 = op.getNumero1();
        int num2 = op.getNumero2();
        if (num1 == 0 || num2 == 0) {
            System.out.println("El resultado de una multiplicacion por 0 siempre dara 0 como resultado.");

        } else {
            System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        }
    }

    public void dividir(Operacion op) {
        double num1 = op.getNumero1();
        double num2 = op.getNumero2();
        double resultado = num1 / num2;
        if (num1 == 0 || num2 == 0) {
            System.out.println("No se puede dividir por cero");

        } else {
            System.out.println(Math.round(num1) + " / " + Math.round(num2) + " = " + resultado);
        }
    }
}

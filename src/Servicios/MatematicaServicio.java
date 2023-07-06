package Servicios;

import Entidades.Matematica;

public class MatematicaServicio {

    public double devolverMayor(Matematica matematica) {
        if (matematica.getNum1() > matematica.getNum2()) {
            return matematica.getNum1();
        } else {
            return matematica.getNum2();
        }
    }

    public int calcularPotencia(Matematica matematica) {
        double num1 = Math.floor(matematica.getNum1());
        double num2 = Math.floor(matematica.getNum2());

        double base = Math.max(num1, num2);
        double exponente = Math.min(num1, num2);

        return (int) Math.pow(base, exponente);
    }

    public int calculaRaiz(Matematica matematica) {
        double num1 = Math.abs(matematica.getNum1());
        double num2 = Math.abs(matematica.getNum2());

        return (int) Math.sqrt(Math.min(num1, num2));
    }

}

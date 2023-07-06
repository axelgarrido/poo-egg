package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;

public class CuentaServicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearCuenta() {
        Cuenta cuenta = new Cuenta();
        System.out.println("Ingrese el numero de cuenta");
        cuenta.setNumeroCuenta(scan.nextInt());
        System.out.println("Ingrese su DNI");
        cuenta.setDni(scan.nextLong());
        System.out.println("Ingrese su saldo actual");
        cuenta.setSaldoActual(scan.nextInt());
        return cuenta;
    }

    public void ingresar(double ingreso, Cuenta cuenta) {
        double resultado = cuenta.getSaldoActual() + ingreso;
        cuenta.setSaldoActual((int) resultado);
    }

    public void retirar(double retiro, Cuenta cuenta) {
        if (cuenta.getSaldoActual() < retiro) {
            cuenta.setSaldoActual(0);
        } else {
            double resultado = (cuenta.getSaldoActual()) - (retiro);
            cuenta.setSaldoActual((int) resultado);
        }
    }

    public void extraccionRapida(double extraccion, Cuenta cuenta) {
        if (extraccion > (cuenta.getSaldoActual() * 0.2)) {
            System.out.println("Intentaste sacar mas del 20%");

        } else {
            double resultado = cuenta.getSaldoActual() - extraccion;
            cuenta.setSaldoActual((int) resultado);
        }
    }

    public void consultarSaldo(Cuenta cuenta) {
        System.out.println("Usted dispone de: $" + cuenta.getSaldoActual());
    }

    public void consultarDatos(Cuenta cuenta) {
        System.out.println("El numero de su cuenta es: " + cuenta.getNumeroCuenta());
        System.out.println("Su numero de DNI es el siguiente: " + cuenta.getDni());
        System.out.println("El saldo actual de su cuenta es de: $" + cuenta.getSaldoActual());
        /*
        Metodo alternativo
        System.out.println(cuenta.toString());
         */
    }

}

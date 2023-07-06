package javapoo;

import Entidades.Cuenta;
import Servicios.CuentaServicio;

public class ej5CuentaBancaria {
    
    public static void main(String[] args) {
        CuentaServicio cs = new CuentaServicio();
        Cuenta cuenta1 = cs.crearCuenta();
        cs.ingresar(20, cuenta1);
        cs.retirar(1, cuenta1);
        cs.consultarSaldo(cuenta1);
        cs.consultarDatos(cuenta1);
    }
    
}

package javapoo;

import java.util.Date;
import java.util.Scanner;

public class ej11Fecha {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Date fechaActual = new Date();
        System.out.println("Ingrese el dia");
        int dia = scan.nextInt();
        System.out.println("Ingrese el mes");
        int mes = scan.nextInt();
        System.out.println("Ingrese el año");
        int anio = scan.nextInt();
        Date fecha = new Date(anio-1900,mes-1,dia);
        System.out.println("La fecha actual: "+fechaActual);
        System.out.println("La fecha ingresada: "+fecha);
        System.out.println("La diferencia de años entre la fecha actual y la ingresada: "+(fechaActual.getYear()-fecha.getYear()));
    }
    
}

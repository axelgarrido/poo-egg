package Servicios;

import Entidades.Nif;
import java.util.Scanner;

public class NifServicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Nif crearNif() {
        Nif nif = new Nif();
        System.out.println("Ingrese el DNI");
        nif.setDni(scan.nextLong());
        int letraNif = Math.round(nif.getDni()%23);
        String[] digitoVerificador = new String[23];
        digitoVerificador[0] = "T";
        digitoVerificador[1] = "R";
        digitoVerificador[2] = "W";
        digitoVerificador[3] = "A";
        digitoVerificador[4] = "G";
        digitoVerificador[5] = "M";
        digitoVerificador[6] = "Y";
        digitoVerificador[7] = "F";
        digitoVerificador[8] = "P";
        digitoVerificador[9] = "D";
        digitoVerificador[10] = "X";
        digitoVerificador[11] = "B";
        digitoVerificador[12] = "N";
        digitoVerificador[13] = "J";
        digitoVerificador[14] = "Z";
        digitoVerificador[15] = "S";
        digitoVerificador[16] = "Q";
        digitoVerificador[17] = "V";
        digitoVerificador[18] = "H";
        digitoVerificador[19] = "L";
        digitoVerificador[20] = "C";
        digitoVerificador[21] = "K";
        digitoVerificador[22] = "E";
        nif.setLetra(digitoVerificador[letraNif]);
        return nif;
    }
    public void mostrar(Nif nif){
        System.out.println("El NIF es el siguiente: "+nif.getDni()+"-"+nif.getLetra());
    }
}

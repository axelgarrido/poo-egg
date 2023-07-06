package Servicios;

import Entidades.Movil;
import java.util.Scanner;

public class MovilServicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Movil cargarCelular() {
        Movil celular = new Movil();
        System.out.println("Ingrese la marca del celular");
        celular.setMarca(scan.next());
        System.out.println("Ingrese el precio del celular");
        celular.setPrecio(scan.nextInt());
        System.out.println("Ingrese el modelo del celular");
        celular.setModelo(scan.next());
        System.out.println("Ingrese la memoria ram del celular");
        celular.setMemoriaRam(scan.nextInt());
        System.out.println("Ingrese el almacenamiento del celular");
        celular.setAlmacenamiento(scan.nextInt());
        return celular;
    }

    public void ingresarCodigo(Movil celular) {
        System.out.println("A continuacion se ingresaran los 7 digitos del codigo por separado");
        for (int i = 0; i < celular.getCodigo().length; i++) {
            System.out.println("Ingrese el " + (i + 1) + "º numero");
            celular.getCodigo()[i] = scan.nextInt();
        }
    }
}

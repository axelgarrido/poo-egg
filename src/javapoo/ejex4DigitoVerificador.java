package javapoo;

import Entidades.Nif;
import Servicios.NifServicio;

public class ejex4DigitoVerificador {

    public static void main(String[] args) {
        NifServicio ns = new NifServicio();
        Nif nif1 = ns.crearNif();
        ns.mostrar(nif1);
    }
    
}

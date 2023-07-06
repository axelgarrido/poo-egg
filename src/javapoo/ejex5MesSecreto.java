package javapoo;

import Entidades.Meses;
import Servicios.MesesServicio;

public class ejex5MesSecreto {

    public static void main(String[] args) {
        MesesServicio ms = new MesesServicio();
        Meses meses = new Meses();
        ms.adivinarMes(meses);
    }
}

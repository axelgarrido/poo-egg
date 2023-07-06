package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    Scanner scan = new Scanner(System.in);

    public Cafetera crearCafetera() {
        Cafetera cafetera = new Cafetera();
        System.out.println("Ingresar cantidad maxima de cafe");
        cafetera.setCapacidadMaxima(scan.nextInt());
        return cafetera;
    }

    public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }
    
    public void servirTaza(int tazaTamanio, Cafetera cafetera){
        if (tazaTamanio > cafetera.getCantidadActual()) {
            System.out.println("No se llego a servir toda la taza, se sirvio: "+cafetera.getCantidadActual());
            cafetera.setCantidadActual(0);
        }else{
            System.out.println("La taza quedo llena");
            int resultado = (cafetera.getCantidadActual()) - tazaTamanio;
            cafetera.setCantidadActual(resultado);
            System.out.println("En la cafetera quedan: "+cafetera.getCantidadActual());
        }
    }
    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0);
    }
    public void agregarCafe(int cafe, Cafetera cafetera){
        if (cafe > cafetera.getCapacidadMaxima()) {
            System.out.println("Se desbordo el exceso pero la cafetera quedo llena");
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        }else{
            int resultado = cafe + cafetera.getCantidadActual();
            System.out.println("Se agrego: "+cafe+" a la cafetera, esta quedo con esta cantidad: "+resultado);
            cafetera.setCantidadActual(resultado);
        }
    }
}

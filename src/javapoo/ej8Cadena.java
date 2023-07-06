package javapoo;

import Entidades.Cadena;
import Servicios.CadenaServicio;
import java.util.Scanner;

public class ej8Cadena {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        CadenaServicio cs = new CadenaServicio();
        Cadena c1 = cs.crearCadena();
        String letra;
        cs.mostrarVocales(c1);
        cs.invertirFrase(c1);
        System.out.println("Ingrese una letra para verificar si se repite");
        do {
            letra = scan.next();
            if (letra.length()!=1) {
                System.out.println("Debes ingresar 1 letra");
            }
        } while (letra.length()!=1);
        cs.vecesRepetido(c1, letra);
        System.out.println("Ingrese una nueve frase para comparar las longitudes");
        String fraseLongitud = scan.next();
        cs.compararLongitud(c1, fraseLongitud);
        System.out.println("Ingrese una frase para unirla a la primera");
        String fraseUnir = scan.next();
        cs.unirFrases(c1, fraseUnir);
        System.out.println("Se procederan a reemplazar las letras 'a' de la frase por el caracter a ingresar");
        String caracter = scan.next();
        cs.reemplazar(c1, caracter);
        System.out.println("Ingrese una letra a buscar en la frase");
        String letraContiene = scan.next();
        cs.contiene(c1, letraContiene);
    }
    
}

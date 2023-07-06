/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.
 */
package javapoo;

import java.util.Arrays;

public class ej10Arreglos {

    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        Arrays.setAll(arregloA, (i) -> Math.random() * 10);
        System.out.println(Arrays.toString(arregloA));
        Arrays.sort(arregloA);
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        Arrays.fill(arregloB, 10, 20, 0.5);

        System.out.println(Arrays.toString(arregloB));
        /*
        Recuerden leer bien la consigna!
        Aca entendi que habia que guardar en los primeros 10 valores de arregloB los 10 valores mayores del arregloA
        pero era mucho mas sencilla la consigna, solo pidiendo los primeros 10 valores
        
        int contador = 0;
        for (int i = arregloA.length - 1; i > (arregloA.length - 21); i--) {
            if (contador < 10) {
                arregloB[contador] = arregloA[i];
            } else {
                arregloB[contador] = 0.5;
            }
            contador++;
        }
         */

    }

}

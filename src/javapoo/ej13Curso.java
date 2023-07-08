package javapoo;

import Entidades.Curso;
import Servicios.CursoServicio;

public class ej13Curso {

    public static void main(String[] args) {
        CursoServicio cs = new CursoServicio();
        Curso curso = cs.crearCurso();

        System.out.println("Los alumnos del curso " + curso.getNombreCurso() + " son:");
        //for-each para ver si se ingresaron bien los alumnos
        for (String alumno : curso.getAlumnos()) {
            System.out.print(alumno + " ");
        }
        System.out.println("");

        System.out.println("La ganancia semanal del curso '" + curso.getNombreCurso() + "' es de: " + cs.calcularGananciaSemanal(curso));
        System.out.println(curso.toString());
    }

}

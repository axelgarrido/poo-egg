package Servicios;

import Entidades.Curso;
import java.util.Scanner;

public class CursoServicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public String[] cargarAlumnos() {
        String[] alumnos = new String[5];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno nro: " + (i + 1));
            alumnos[i] = scan.next();
        }
        return alumnos;
    }

    public Curso crearCurso() {
        Curso curso = new Curso();
        System.out.println("Ingrese el nombre del curso");
        curso.setNombreCurso(scan.next());
        System.out.println("Ingrese la cantidad de horas por dia");
        curso.setCantidadHorasPorDia(scan.nextInt());
        System.out.println("Ingrese la cantidad de dias por semana");
        curso.setCantidadDiasPorSemana(scan.nextInt());
        System.out.println("Ingrese el turno");
        String turno = scan.next();
        while (!(turno.equals("maniana") || turno.equals("tarde"))) {
            if (turno.equals("maniana") || turno.equals("tarde")) {
                curso.setTurno(turno);
            } else {
                System.out.println("Te confundiste, intenta de nuevo");
                turno = scan.next();
            }
        }
        System.out.println("Ingrese el precio por hora");
        curso.setPrecioPorHora(scan.nextInt());
        curso.setAlumnos(cargarAlumnos());
        return curso;
    }
    public int calcularGananciaSemanal(Curso curso){
        int horas = curso.getCantidadHorasPorDia();
        int precioHora = curso.getPrecioPorHora();
        int cantAlumnos = curso.getAlumnos().length;
        int cantDias = curso.getCantidadDiasPorSemana();
        return horas*precioHora*cantAlumnos*cantDias;
    }
}

package Entidades;

import java.util.Date;

public class PersonaDos {

    private String nombre;
    private Date fechaNacimiento;

    public PersonaDos() {
    }

    public PersonaDos(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Fecha de Nacimiento: " + fechaNacimiento;
    }

}

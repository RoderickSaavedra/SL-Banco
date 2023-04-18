package com.siempreListobanco.banco.modelos.abstracto;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Persona implements Serializable {

    private String nombre;
    private String apellido;
    private String cedula;
    private LocalDate fechaNacimiento;

    public Persona(){

    }

    public Persona(String nombre, String apellido, String cedula, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


}

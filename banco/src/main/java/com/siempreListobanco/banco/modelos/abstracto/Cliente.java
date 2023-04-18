package com.siempreListobanco.banco.modelos.abstracto;

import com.siempreListobanco.banco.modelos.cons.EstatusLaboral;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;

public class Cliente extends Persona {


    private String IDENTIFICADOR;
    private EstatusLaboral estatus;
    private HashMap IdCuentas;

    public Cliente(){

    }

    public Cliente(String nombre, String apellido, String cedula, LocalDate fechaNacimiento) {
        super(nombre, apellido, cedula, fechaNacimiento);
        this.IDENTIFICADOR = UUID.randomUUID().toString();
    }

    public Cliente(String nombre, String apellido, String cedula, LocalDate fechaNacimiento, EstatusLaboral estatus) {
        super(nombre, apellido, cedula, fechaNacimiento);
        this.IDENTIFICADOR = UUID.randomUUID().toString();
        this.estatus = estatus;
    }

    public String getIDENTIFICADOR() {
        return IDENTIFICADOR;
    }

    public EstatusLaboral getEstatus() {
        return estatus;
    }

    public void setEstatus(EstatusLaboral estatus) {
        this.estatus = estatus;
    }

    public void setIDENTIFICADOR(String IDENTIFICADOR) {
        this.IDENTIFICADOR = IDENTIFICADOR;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente user = (Cliente) o;
        return Objects.equals(IDENTIFICADOR, user.IDENTIFICADOR) && Objects.equals(getNombre(), user.getNombre())
                && Objects.equals(getApellido(), user.getApellido()) && Objects.equals(getCedula(), user.getCedula())
                && Objects.equals(getFechaNacimiento(), user.getFechaNacimiento()) && Objects.equals(estatus, user.estatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IDENTIFICADOR, getNombre(), getApellido(), getCedula(), getFechaNacimiento(), estatus);
    }

    @Override
    public String toString() {
        return
                "\n\t " + IDENTIFICADOR +
                        "\t " + getNombre() +
                        "\t " + getApellido() +
                        "\t " + getCedula() +
                        "\t " + getFechaNacimiento() +
                        "\t " + estatus;
    }

}

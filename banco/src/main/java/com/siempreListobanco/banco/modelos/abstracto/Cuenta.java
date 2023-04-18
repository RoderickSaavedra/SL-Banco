package com.siempreListobanco.banco.modelos.abstracto;

import com.siempreListobanco.banco.modelos.cons.Tasa;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;
import java.util.UUID;

public class Cuenta implements Serializable {

    private String IDENTIFICADOR;
    private Tasa tasa;
    private double balance;
    private String nombre;
    private LocalDateTime fechaCreacion;
    private int MX_MOVIMIENTO;
    private int movimiento;

    public Cuenta(){
        this.IDENTIFICADOR = UUID.randomUUID().toString();
        this.fechaCreacion = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        this.balance = 0.00;
        this.nombre = "CUENTA PRE-ABIERTA";
        this.tasa = null;
        this.movimiento = 0;
    }

    public Cuenta(Tasa tasa, double balance, String nombre, int MX_MOVIMIENTO) {
        this.IDENTIFICADOR = UUID.randomUUID().toString();
        this.fechaCreacion = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        this.tasa = tasa;
        this.balance = balance;
        this.nombre = nombre;
        this.MX_MOVIMIENTO = MX_MOVIMIENTO;
    }

    public String getIDENTIFICADOR() {
        return IDENTIFICADOR;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public int getMovimiento() {
        return movimiento;
    }

    public Tasa getTasa() {
        return tasa;
    }

    public void setTasa(Tasa tasa) {
        this.tasa = tasa;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMX_MOVIMIENTO() {
        return MX_MOVIMIENTO;
    }

    public void setMX_MOVIMIENTO(int MX_MOVIMIENTO) {
        this.MX_MOVIMIENTO = MX_MOVIMIENTO;
    }

    public void setIDENTIFICADOR(String IDENTIFICADOR) {
        this.IDENTIFICADOR = IDENTIFICADOR;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuenta user = (Cuenta) o;
        return Objects.equals(IDENTIFICADOR, user.IDENTIFICADOR) && Objects.equals(nombre, user.nombre) && Objects.equals(balance, user.balance) && Objects.equals(fechaCreacion, user.fechaCreacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IDENTIFICADOR, nombre, balance, fechaCreacion);
    }

    @Override
    public String toString() {
        return
                "\n\t " + IDENTIFICADOR +
                        "\t " + balance  +
                        "\t " + fechaCreacion +
                        "\t " + nombre;
    }

}
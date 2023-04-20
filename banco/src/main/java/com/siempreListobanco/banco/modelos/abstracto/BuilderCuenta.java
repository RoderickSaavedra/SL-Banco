package com.siempreListobanco.banco.modelos.abstracto;

import com.siempreListobanco.banco.modelos.cons.Tasa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.UUID;

public class BuilderCuenta {
    private String IDENTIFICADOR;
    private Tasa tasa;
    private double balance = 0.0;
    private String nombre;
    private LocalDateTime fechaCreacion;
    private int MX_MOVIMIENTO;
    private int movimiento = 0;

    public BuilderCuenta identificador(){
        this.IDENTIFICADOR = UUID.randomUUID().toString();
        return this;
    }

    public BuilderCuenta tasa(Tasa tasa){
        this.tasa = tasa;
        return this;
    }

    public BuilderCuenta balance(double balance){
        this.balance = balance;
        return this;
    }

    public BuilderCuenta nombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public BuilderCuenta fechaCreacion(){
        this.fechaCreacion = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        return this;
    }

    public BuilderCuenta limiteMovimiento(int movimiento){
        this.MX_MOVIMIENTO = movimiento;
        return this;
    }

    public Cuenta build(){
        return new Cuenta(this);
    }

    //Getter

    public String getIDENTIFICADOR() {
        return IDENTIFICADOR;
    }

    public Tasa getTasa() {
        return tasa;
    }

    public double getBalance() {
        return balance;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public int getMX_MOVIMIENTO() {
        return MX_MOVIMIENTO;
    }

    public int getMovimiento() {
        return movimiento;
    }
}

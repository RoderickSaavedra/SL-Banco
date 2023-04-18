package com.siempreListobanco.banco.modelos.cons;

public enum Tasa {
    MANT(1.24,"Tasa Mantenimiento"),
    INT(1.24, "Tasa de Interes");

    double montoFijo;
    String descripcion;

    Tasa(double montoFijo, String descripcion) {
        this.montoFijo = montoFijo;
        this.descripcion = descripcion;
    }

    public double getMontoFijo() {
        return montoFijo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
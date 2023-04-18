package com.siempreListobanco.banco.modelos.cons;

public enum Productos {
    CUENTA_AHORROS(1), CUENTA_CORRIENTE(2), CUENTA_PLAZOFIJO(3);

    private int tpCuenta;

    Productos(int tpCuenta) {
        this.tpCuenta = tpCuenta;
    }

    public int getTpCuenta(){
        return this.tpCuenta;
    }
}
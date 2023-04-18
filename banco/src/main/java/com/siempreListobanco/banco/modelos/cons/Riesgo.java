package com.siempreListobanco.banco.modelos.cons;

public enum Riesgo {
    AAA(1), AA(2), A(3), BBB(4), BB(5), B(7), C(8), D(9), F(10);

    private int tpRiesgo;

    Riesgo(int tpRiesgo) {
        this.tpRiesgo = tpRiesgo;
    }

    public int getRiesgo() {
        return tpRiesgo;
    }
}
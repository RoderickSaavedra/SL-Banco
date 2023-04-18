package com.siempreListobanco.banco.modelos.cons;

public enum Estatus {
    APROBADO(1), DECLINADO(2), EN_ESPERA(3);

    private int estatus;

    Estatus(int estatus) {
        this.estatus = estatus;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }
}

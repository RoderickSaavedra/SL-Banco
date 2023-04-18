package com.siempreListobanco.banco.modelos.cons;

public enum Recursos {
    RETIRO(1), DEPOSITO(2);

    private int recuro;

    Recursos(int recuro) {
        this.recuro = recuro;
    }

    public int getRecuro() {
        return recuro;
    }
}

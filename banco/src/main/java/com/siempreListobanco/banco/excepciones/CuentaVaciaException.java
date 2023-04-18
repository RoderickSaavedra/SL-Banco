package com.siempreListobanco.banco.excepciones;

public class CuentaVaciaException extends RuntimeException{
    public CuentaVaciaException() {
    }

    public CuentaVaciaException(String message) {
        super(message);
    }
}

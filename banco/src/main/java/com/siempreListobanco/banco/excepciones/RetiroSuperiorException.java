package com.siempreListobanco.banco.excepciones;

public class RetiroSuperiorException extends RuntimeException{

    public RetiroSuperiorException() {
    }

    public RetiroSuperiorException(String message) {
        super(message);
    }
}

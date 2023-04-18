package com.siempreListobanco.banco.excepciones;

public class MontoNegativoException extends RuntimeException{

    public MontoNegativoException(){

    }

    public MontoNegativoException(String string){
        super(string);
    }

}

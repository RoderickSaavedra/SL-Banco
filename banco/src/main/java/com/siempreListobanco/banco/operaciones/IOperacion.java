package com.siempreListobanco.banco.operaciones;

import com.siempreListobanco.banco.modelos.abstracto.Cuenta;

public interface IOperacion <T extends Cuenta, K>{
    boolean retirar(T model, K cantidad);
    boolean depositar(T model, K cantidad);
    double consultarSaldo(T model);

}

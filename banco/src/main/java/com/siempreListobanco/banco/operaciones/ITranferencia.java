package com.siempreListobanco.banco.operaciones;

import com.siempreListobanco.banco.modelos.abstracto.Cuenta;

public interface ITranferencia <O extends Cuenta, D extends Cuenta, C>{

    boolean transferir(O origen, D destino,C cantidad);
}

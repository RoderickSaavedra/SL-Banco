package com.siempreListobanco.banco.modelos;

import com.siempreListobanco.banco.modelos.cons.Productos;
import com.siempreListobanco.banco.modelos.cons.Tasa;
import com.siempreListobanco.banco.modelos.abstracto.Cuenta;

public class CuentaAhorro extends Cuenta {

    private Productos producto = Productos.CUENTA_AHORROS;

    public CuentaAhorro(Tasa tasa, double balance, String nombre, int MX_MOVIMIENTO) {
        super(tasa, balance, nombre, MX_MOVIMIENTO);
    }

    public Productos getProducto() {
        return producto;
    }


}

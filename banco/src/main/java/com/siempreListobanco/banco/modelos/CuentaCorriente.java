package com.siempreListobanco.banco.modelos;

import com.siempreListobanco.banco.modelos.cons.Productos;
import com.siempreListobanco.banco.modelos.cons.Tasa;
import com.siempreListobanco.banco.modelos.abstracto.Cuenta;

public class CuentaCorriente extends Cuenta {

    private Productos producto = Productos.CUENTA_CORRIENTE;

    public Productos getProducto() {
        return producto;
    }

    public CuentaCorriente(Tasa tasa, double balance, String nombre, int MX_MOVIMIENTO) {
        super(tasa, balance, nombre, MX_MOVIMIENTO);
    }
}

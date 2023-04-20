package com.siempreListobanco.banco.modelos;

import com.siempreListobanco.banco.modelos.abstracto.BuilderCuenta;
import com.siempreListobanco.banco.modelos.cons.Productos;
import com.siempreListobanco.banco.modelos.abstracto.Cuenta;

public class CuentaAhorro extends Cuenta {

    private Productos producto = Productos.CUENTA_AHORROS;

    public CuentaAhorro(BuilderCuenta builderCuenta) {
        super(builderCuenta);
    }

    public Productos getProducto() {
        return producto;
    }


}

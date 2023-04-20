package com.siempreListobanco.banco.modelos;

import com.siempreListobanco.banco.modelos.abstracto.BuilderCuenta;
import com.siempreListobanco.banco.modelos.cons.Productos;
import com.siempreListobanco.banco.modelos.abstracto.Cuenta;

public class CuentaCorriente extends Cuenta {

    private Productos producto = Productos.CUENTA_CORRIENTE;

    public Productos getProducto() {
        return producto;
    }

    public CuentaCorriente(BuilderCuenta builderCuenta) {
        super(builderCuenta);
    }
}

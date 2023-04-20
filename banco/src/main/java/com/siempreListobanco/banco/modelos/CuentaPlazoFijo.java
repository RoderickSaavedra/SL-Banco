package com.siempreListobanco.banco.modelos;

import com.siempreListobanco.banco.modelos.abstracto.BuilderCuenta;
import com.siempreListobanco.banco.modelos.cons.Productos;
import com.siempreListobanco.banco.modelos.abstracto.Cuenta;

public class CuentaPlazoFijo extends Cuenta {

    private Productos producto = Productos.CUENTA_PLAZOFIJO;

    public Productos getProducto() {
        return producto;
    }

    public CuentaPlazoFijo(BuilderCuenta builderCuenta) {
        super(builderCuenta);
    }
}

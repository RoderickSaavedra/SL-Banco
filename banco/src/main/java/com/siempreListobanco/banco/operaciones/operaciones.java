package com.siempreListobanco.banco.operaciones;

import com.siempreListobanco.banco.excepciones.CuentaVaciaException;
import com.siempreListobanco.banco.excepciones.MontoNegativoException;
import com.siempreListobanco.banco.excepciones.RetiroSuperiorException;
import com.siempreListobanco.banco.modelos.abstracto.Cuenta;

public class operaciones implements IOperacion<Cuenta, Double>, ITranferencia<Cuenta, Cuenta, Double>{


    @Override
    public boolean retirar(Cuenta model, Double cantidad) {
        if(model.getBalance() < cantidad){
            throw new RetiroSuperiorException();
        }else if (cantidad < 0){
            throw new MontoNegativoException();
        }
        model.setBalance(model.getBalance() - cantidad);
        return true;
    }

    @Override
    public boolean depositar(Cuenta model, Double cantidad) {
        if (cantidad < 0)
            throw new MontoNegativoException();
        model.setBalance(model.getBalance() + cantidad);
        return true;
    }

    @Override
    public double consultarSaldo(Cuenta model) {
        if (model != null)
            return model.getBalance();
        throw new CuentaVaciaException();
    }

    @Override
    public boolean transferir(Cuenta origen, Cuenta destino, Double cantidad) {
        if (origen == null || destino == null)
            throw new CuentaVaciaException();
        if (origen.getBalance() < cantidad)
            throw  new RetiroSuperiorException();

        retirar(origen, cantidad);
        depositar(destino, cantidad);
        return true;
    }

}

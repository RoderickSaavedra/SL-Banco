package com.siempreListobanco.banco.recursos;

import com.siempreListobanco.banco.bootstrap.InitDatabase;
import com.siempreListobanco.banco.dao.CuentaDao;
import com.siempreListobanco.banco.modelos.abstracto.BuilderCuenta;
import com.siempreListobanco.banco.modelos.abstracto.Cuenta;
import com.siempreListobanco.banco.modelos.cons.Tasa;

import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;


public class mainJDBC {
    public static void main(String[] args) throws ClassNotFoundException {
        Logger logger = Logger.getLogger("JDBC-CRUD");
        InitDatabase.init();
        CuentaDao repositorioCuentas = new CuentaDao();

        Cuenta dummy = new BuilderCuenta().tasa(Tasa.INT).nombre("CUENTA AHORROS").fechaCreacion().identificador().build();
        repositorioCuentas.save(dummy);

        dummy = new BuilderCuenta().tasa(Tasa.INT).nombre("CUENTA PARA NAVIDAD").balance(100.00).fechaCreacion().identificador().build();
        repositorioCuentas.save(dummy);

        dummy = dummy = new BuilderCuenta().tasa(Tasa.INT).nombre("CUENTA CARNAVALES").balance(50.00).fechaCreacion().identificador().build();
        repositorioCuentas.save(dummy);

        List<Cuenta> res = repositorioCuentas.findAll();
        System.out.println(res.toString());


    }
}

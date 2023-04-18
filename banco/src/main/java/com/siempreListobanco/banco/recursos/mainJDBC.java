package com.siempreListobanco.banco.recursos;

import com.siempreListobanco.banco.bootstrap.InitDatabase;
import com.siempreListobanco.banco.dao.CuentaDao;
import com.siempreListobanco.banco.modelos.abstracto.Cuenta;

import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;


public class mainJDBC {
    public static void main(String[] args) throws ClassNotFoundException {
        Logger logger = Logger.getLogger("JDBC-CRUD");
        InitDatabase.init();
        CuentaDao repositorioCuentas = new CuentaDao();

        Cuenta dummy = new Cuenta();
        dummy.setNombre("CUENTA AHORROS");
        dummy.setBalance(10.00);
        dummy.setIDENTIFICADOR(UUID.randomUUID().toString());
        repositorioCuentas.save(dummy);

        dummy = new Cuenta();
        dummy.setNombre("CUENTA PARA NAVIDAD");
        dummy.setBalance(100.00);
        dummy.setIDENTIFICADOR(UUID.randomUUID().toString());
        repositorioCuentas.save(dummy);

        dummy = new Cuenta();
        dummy.setNombre("CUENTA CARNAVALES");
        dummy.setBalance(50.00);
        dummy.setIDENTIFICADOR(UUID.randomUUID().toString());
        repositorioCuentas.save(dummy);

        List<Cuenta> res = repositorioCuentas.findAll();
        System.out.println(res.toString());


    }
}

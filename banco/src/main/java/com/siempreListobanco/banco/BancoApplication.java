package com.siempreListobanco.banco;

import com.siempreListobanco.banco.bootstrap.InitDatabase;
import com.siempreListobanco.banco.dao.CuentaDao;
import com.siempreListobanco.banco.modelos.abstracto.Cuenta;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class BancoApplication {

	public static void main(String[] args) throws ClassNotFoundException {
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

		SpringApplication.run(BancoApplication.class, args);
	}

}

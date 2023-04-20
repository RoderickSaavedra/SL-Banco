package com.siempreListobanco.banco;

import com.siempreListobanco.banco.bootstrap.InitDatabase;
import com.siempreListobanco.banco.dao.CuentaDao;
import com.siempreListobanco.banco.modelos.abstracto.BuilderCuenta;
import com.siempreListobanco.banco.modelos.abstracto.Cuenta;
import com.siempreListobanco.banco.modelos.cons.Tasa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class BancoApplication {

	public static void main(String[] args) throws ClassNotFoundException {
		InitDatabase.init();
		CuentaDao repositorioCuentas = new CuentaDao();

		Cuenta dummy = new BuilderCuenta().tasa(Tasa.INT).nombre("CUENTA AHORROS").fechaCreacion().identificador().build();
		repositorioCuentas.save(dummy);

		dummy = new BuilderCuenta().tasa(Tasa.INT).nombre("CUENTA PARA NAVIDAD").balance(100.00).fechaCreacion().identificador().build();
		repositorioCuentas.save(dummy);

		dummy = dummy = new BuilderCuenta().tasa(Tasa.INT).nombre("CUENTA CARNAVALES").balance(50.00).fechaCreacion().identificador().build();
		repositorioCuentas.save(dummy);
		SpringApplication.run(BancoApplication.class, args);
	}

}

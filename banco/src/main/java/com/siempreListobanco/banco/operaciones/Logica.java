package com.siempreListobanco.banco.operaciones;

import com.siempreListobanco.banco.dao.CuentaDao;
import com.siempreListobanco.banco.modelos.Cliente;
import com.siempreListobanco.banco.modelos.abstracto.Cuenta;

import java.util.function.Function;

public class Logica {

    public Cuenta crearCliente(int edad, String nombre){
        if(esMayorEdad.apply(edad)){
            Cliente cliente = new Cliente();
        }else {
            System.out.println("El Cliente es menor de edad");
        }
        return null;
    }

    static Function<Integer, Boolean> esMayorEdad = edad -> edad >= 18;

}

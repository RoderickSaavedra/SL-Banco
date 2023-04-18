package com.siempreListobanco.banco;

import com.siempreListobanco.banco.dao.CuentaDao;
import com.siempreListobanco.banco.modelos.abstracto.Cuenta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerOne {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World")String name){
        return String.format("Hello %s!", name);
    }

    @GetMapping("/getCuentas")
    public List<Cuenta> getCuentas(){
        CuentaDao cuentasDao = new CuentaDao();
        return cuentasDao.findAll();
    }

    @GetMapping("getCuentas/{id}")
    public Optional getCuenta(@PathVariable String id){
        CuentaDao cuentaDao = new CuentaDao();
        return cuentaDao.findById(id);
    }

}

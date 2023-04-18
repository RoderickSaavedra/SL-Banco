package com.siempreListobanco.banco.dao.mapper;

import com.siempreListobanco.banco.dao.mapper.interfaces.BaseMapper;
import com.siempreListobanco.banco.modelos.abstracto.Cuenta;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CuentaMapper implements BaseMapper<Cuenta> {
    @Override
    public Cuenta toModel(ResultSet resultSet) {
        Cuenta cuenta = new Cuenta();
        try {
            cuenta.setIDENTIFICADOR(resultSet.getString("ID"));
            cuenta.setBalance(resultSet.getDouble("BALANCE"));
            cuenta.setNombre(resultSet.getString("NOMBRE"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cuenta;
    }
}

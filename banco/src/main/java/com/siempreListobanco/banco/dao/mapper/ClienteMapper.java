package com.siempreListobanco.banco.dao.mapper;

import com.siempreListobanco.banco.modelos.Cliente;
import com.siempreListobanco.banco.dao.mapper.interfaces.BaseMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteMapper implements BaseMapper<Cliente> {
    @Override
    public Cliente toModel(ResultSet resultSet) {
        Cliente cliente = new Cliente();
        try {
            cliente.setIDENTIFICADOR(resultSet.getString("ID"));
            cliente.setNombre(resultSet.getString("NOMBRE"));
            cliente.setApellido(resultSet.getString("APELLIDO"));
            cliente.setCedula(resultSet.getString("CEDULA"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}

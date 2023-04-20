package com.siempreListobanco.banco.dao;

import com.siempreListobanco.banco.modelos.Cliente;
import com.siempreListobanco.banco.bootstrap.DBConnection;
import com.siempreListobanco.banco.dao.interfaces.CrudDao;
import com.siempreListobanco.banco.dao.mapper.ClienteMapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ClienteDao implements CrudDao<Cliente, String> {
    private Connection connection;
    private ClienteMapper mapper;

    public ClienteDao(){
        this.connection = DBConnection.getConnection();
        this.mapper = new ClienteMapper();
    }


    @Override
    public void save(Cliente model) {
        String insertUserQuerry = "INSERT INTO CLIENTE (ID, NOMBRE, APELLIDO, CEDULA) VALUES(?,?,?,?)";

        try(PreparedStatement preparedStatement = connection.prepareStatement(insertUserQuerry)){
            preparedStatement.setString(1, model.getIDENTIFICADOR());
            preparedStatement.setString(2, model.getNombre());
            preparedStatement.setString(1, model.getApellido());
            preparedStatement.setString(1, model.getCedula());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Optional<Cliente> findById(String id) {
        String selectByIdQuery = "SELECT * FROM CLIENTE WHERE ID = ?";
        Cliente cliente = null;
        try(PreparedStatement preparedStatement = connection.prepareStatement(selectByIdQuery)){
            preparedStatement.setString(1, "ID");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                cliente = mapper.toModel(resultSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return Objects.nonNull(cliente) ? Optional.of(cliente):Optional.empty();
    }

    @Override
    public List<Cliente> findAll() {
        String selectAllQuery = "SELECT * FROM CLIENTE";
        List<Cliente> clientes = new ArrayList<>();
        try(PreparedStatement preparedStatement = connection.prepareStatement(selectAllQuery)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Cliente cliente = mapper.toModel(resultSet);
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }

    @Override
    public Cliente update(Cliente model) {
        String updateAccountQuerry = "UPDATE CLIENTE SET NOMBRE = ? , APELLIDO = ? , CEDULA = ? WHERE ID = ?";
        try(PreparedStatement preparedStatement = connection.prepareStatement(updateAccountQuerry)){
            preparedStatement.setString(1, model.getIDENTIFICADOR());
            preparedStatement.setString(2, model.getNombre());
            preparedStatement.setString(3, model.getApellido());
            preparedStatement.setString(4, model.getCedula());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return model;
    }

    @Override
    public void delete(String id) {
        String deleteQuerry = "DELETE FROM CLIENTE WHERE ID = ?";
        try(PreparedStatement preparedStatement = connection.prepareStatement(deleteQuerry)){
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteAll() {
        String deleteQuerry = "DELETE FROM CLIENTE";
        try(PreparedStatement preparedStatement = connection.prepareStatement(deleteQuerry)){
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

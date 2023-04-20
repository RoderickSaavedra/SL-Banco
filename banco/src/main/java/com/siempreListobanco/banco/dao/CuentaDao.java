package com.siempreListobanco.banco.dao;

import com.siempreListobanco.banco.bootstrap.DBConnection;
import com.siempreListobanco.banco.dao.interfaces.CrudDao;
import com.siempreListobanco.banco.dao.mapper.CuentaMapper;
import com.siempreListobanco.banco.modelos.abstracto.Cuenta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CuentaDao implements CrudDao<Cuenta, String> {

    private Connection connection;
    private CuentaMapper mapper;

    public CuentaDao(){
        this.connection = DBConnection.getConnection();
        this.mapper = new CuentaMapper();
    }
    @Override
    public void save(Cuenta model) {
        String insertUserQuerry = "INSERT INTO CUENTA (ID, BALANCE, NOMBRE) VALUES(?,?,?)";

        try(PreparedStatement preparedStatement = connection.prepareStatement(insertUserQuerry)){
            preparedStatement.setString(1, model.getIDENTIFICADOR());
            preparedStatement.setDouble(2, model.getBalance());
            preparedStatement.setString(3, model.getNombre());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Optional<Cuenta> findById(String id) {
        String selectByIdQuery = "SELECT * FROM CUENTA WHERE ID = ?";
        Cuenta cuenta = null;
        try(PreparedStatement preparedStatement = connection.prepareStatement(selectByIdQuery)){
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                cuenta = mapper.toModel(resultSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return Objects.nonNull(cuenta) ? Optional.of(cuenta):Optional.empty();
    }

    @Override
    public List<Cuenta> findAll() {
        String selectAllQuery = "SELECT * FROM CUENTA";
        List<Cuenta> cuentas = new ArrayList<>();
        try(PreparedStatement preparedStatement = connection.prepareStatement(selectAllQuery)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Cuenta cuenta = mapper.toModel(resultSet);
               cuentas.add(cuenta);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cuentas;
    }

    @Override
    public Cuenta update(Cuenta model) {
        String updateAccountQuerry = "UPDATE CUENTA SET NOMBRE = ? , BALANCE = ? WHERE ID = ?";
        try(PreparedStatement preparedStatement = connection.prepareStatement(updateAccountQuerry)){
            preparedStatement.setString(1, model.getIDENTIFICADOR());
            preparedStatement.setDouble(2, model.getBalance());
            preparedStatement.setString(3, model.getNombre());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return model;
    }

    @Override
    public void delete(String id) {
        String deleteQuerry = "DELETE FROM CUENTA WHERE ID = ?";
        try(PreparedStatement preparedStatement = connection.prepareStatement(deleteQuerry)){
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteAll() {
        String deleteQuerry = "DELETE FROM CUENTA";
        try(PreparedStatement preparedStatement = connection.prepareStatement(deleteQuerry)){
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

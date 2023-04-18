package com.siempreListobanco.banco.bootstrap;



import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InitDatabase {

    private InitDatabase(){}

    public static void init() throws ClassNotFoundException {

        //Creamos la carga del Driver
       Class.forName("org.h2.Driver");

        //Habilitamos y creamos una conexion hacia la base de datos
        Connection connection = DBConnection.getConnection();

        try(Statement statement = connection.createStatement()) {
            statement.execute(getCustomersTruncate());
            statement.execute(getCustomersTruncateCliente());
        }catch (SQLException e){
            e.printStackTrace();
        }

        try(Statement statement = connection.createStatement()) {
            statement.execute(getCustomersCreateQuery());
            statement.execute(getCustomersCreateQueryClient());
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    private static String getCustomersTruncate(){
        return "DROP TABLE IF EXISTS CUENTA;";
    }
    private static String getCustomersCreateQuery(){
        return "CREATE TABLE IF NOT EXISTS CUENTA (\n" +
                "\tID varchar(255) NOT NULL PRIMARY KEY,\n" +
                "\tBALANCE varchar(255) NOT NULL,\n" +
                "\tNOMBRE varchar(255) NOT NULL,\n" +
                "\tTIPO varchar(255) \n" +
                ");";
    }

    private static String getCustomersTruncateCliente(){
        return "DROP TABLE IF EXISTS CLIENTE;";
    }

    private static String getCustomersCreateQueryClient(){
        return "CREATE TABLE IF NOT EXISTS CLIENTE (\n" +
                "\tID varchar(255) NOT NULL PRIMARY KEY,\n" +
                "\tNOMBRE varchar(255) NOT NULL,\n" +
                "\tAPELLIDO varchar(255) NOT NULL,\n" +
                "\tCEDULA varchar(255) \n" +
                ");";
    }
}

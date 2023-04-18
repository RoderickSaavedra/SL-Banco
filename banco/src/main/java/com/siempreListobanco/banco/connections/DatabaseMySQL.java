package com.siempreListobanco.banco.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseMySQL {

    // se definie la url con nombre del esquema, puerto y host
    static final String url = "jdbc:mysql://localhost:3306/db";
    static String usuario = "root";
    static String clave = "1234";

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            // este método Class.forName() es el usuario para el registro
            // de controladores con el nombre del controlador como argumento

            // usamos MySQL driver
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection(
                    url, usuario, clave);

            // create.Statement() crea el objeto statement que se encarga de ejecutar
            // las consultas sobre la tabla
            Statement stmt = conn.createStatement();

            // executeUpdate() se utiliza para las sentencias INSERT, UPDATE, DELETE
            // y devuelve el número de filas afectadas por la ejecución de la sentencia.
            int result = stmt.executeUpdate(
                    "INSERT INTO student(Id,name,number) VALUES ('1','rachel','45')");

            // si el resultado es mayor que 0, significa que se han añadido valores
            if (result > 0)
                System.out.println("Insercion Exitosa");
            else
                System.out.println("Error de Insercion ");

            // crrando la conexion a la BD
            conn.close();
        }

        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

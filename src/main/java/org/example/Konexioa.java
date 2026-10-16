
package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Konexioa {

    private static final String URL =
            "jdbc:mysql://localhost:3306/animalien_babeslekua";

    private static final String USUARIO = "root";
    private static final String PASSWORD = "root";

    public static Connection konektatu() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
    }
}

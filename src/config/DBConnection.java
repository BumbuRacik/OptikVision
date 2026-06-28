package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static Connection connection;

    public static Connection getConnection() {

        try {

            if (connection == null || connection.isClosed()) {

                String url =
                        "jdbc:mysql://localhost:3306/optik_db";

                String username = "root";

                String password = "";

                connection =
                        DriverManager.getConnection(
                                url,
                                username,
                                password
                        );

                System.out.println("Koneksi berhasil");

            }

        }
        catch (SQLException e) {

            System.out.println(

                    "Koneksi gagal : "

                    + e.getMessage()

            );

        }

        return connection;

    }

}
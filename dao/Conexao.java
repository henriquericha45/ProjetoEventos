package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private Connection connection;
    private String conBanco;
    private String userMySQL;
    private String passwordMySQL;

    public Conexao() {
        this.conBanco = "jdbc:mysql://localhost:3306/Evento?useSSL=false";
        this.userMySQL = "root";
        this.passwordMySQL = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(conBanco, userMySQL, passwordMySQL);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }   
    }

    public Connection getConnection() {
        return this.connection;
    }
    
}

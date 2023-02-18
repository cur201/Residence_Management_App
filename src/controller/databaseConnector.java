package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class databaseConnector {
    public static Connection MoKetNoi(String TenCSDL, String user, String password)
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }

        String urlDB = "jdbc:mysql://localhost:3306/"+TenCSDL;
        try{
            return DriverManager.getConnection(urlDB, user, password);
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return null;
    }
}

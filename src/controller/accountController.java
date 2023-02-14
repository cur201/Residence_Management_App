package controller;

import model.user;

import java.sql.*;

public class accountController {

    Connection connectDB = databaseConnector.MoKetNoi("residence_management",
            "root", "root");
    public user login(String userName, String password)
    {
        user user = null;
        try{
            Statement stmt = connectDB.createStatement();
            String sqlInsertInToLogin = "SELECT * FROM user WHERE userName=? AND password=?";
            PreparedStatement checkUserInfo = connectDB.prepareStatement(sqlInsertInToLogin);
            checkUserInfo.setString(1, userName);
            checkUserInfo.setString(2, password);

            ResultSet resultSet = checkUserInfo.executeQuery();

            if(resultSet.next())
            {
                int idUser = resultSet.getInt("iduser");
                String resultUserName = resultSet.getString("userName");
                String resultPassword = resultSet.getString("password");
                String role = resultSet.getString("role");
                user = new user(idUser, resultUserName, resultPassword, role);
            }
            stmt.close();
            //connectDB.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return user;
    }

    public boolean logout()
    {
        return false;
    }

    public boolean createAccount(String userName, String password, String role) {
        user user = null;
        try {
            String sqlInsertInToSignUp = "INSERT INTO user (userName, password, role) VALUES (?, ?, ?);";
            PreparedStatement createUserRecord = connectDB.prepareStatement(sqlInsertInToSignUp);
            createUserRecord.setString(1, userName);
            createUserRecord.setString(2, password);
            createUserRecord.setString(3, role);

            int  thanhCong = createUserRecord.executeUpdate();
            if(thanhCong == 0) {
                return false;
            }
            else {return true;}
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

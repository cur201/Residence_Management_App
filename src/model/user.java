package model;

public class user {
    private int idUser;
    private String userName;
    private String password;
    private String role;

    public user() {
    }

    public user(int idUser, String userName, String password, String role) {
        this.idUser = idUser;
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

package vn.edu.hcmuaf.fit.lab6_ltw.model;

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private  String username;
    private  String password;
    private int roleID;

    public User(int id, String username, String password, int roleID) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roleID = roleID;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + roleID +
                '}';
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author ducan
 */
public class User {
    private int user_id;
    private String user_name;
    private String user_login;
    private String email;
    private String password;
    private String avatar_url;
    private int roll;

    public User() {
    }

    public User(String user_login, String password) {
        this.user_login = user_login;
        this.password = password;
    }

    public User(int user_id, String user_name, String user_login, String email, String password, String avatar_url, int roll) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_login = user_login;
        this.email = email;
        this.password = password;
        this.avatar_url = avatar_url;
        this.roll = roll;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_login() {
        return user_login;
    }

    public void setUser_login(String user_login) {
        this.user_login = user_login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    @Override
    public String toString() {
        return "User{" + "user_id=" + user_id + ", user_name=" + user_name + ", user_login=" + user_login + ", email=" + email + ", password=" + password + ", avatar_url=" + avatar_url + ", roll=" + roll + '}';
    }
     
    
}

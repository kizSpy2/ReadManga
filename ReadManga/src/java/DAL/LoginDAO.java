/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Models.Manga;
import Models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ducan
 */
public class LoginDAO {
    Connection con = null;       
    public User checkLogin(String user,String pass){
        String sql = "select * from User_HE161916 where user_login = ? and password = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ps.setString(1, user);
            ps.setString(2,pass);
            while (rs.next()) {
                User a = new User(rs.getString(3), rs.getString(5));
                return a;
            }
        } catch (Exception e) {
//            status = "Error at load Department " + e.getMessage();
        }
        return null; 
    }
    public Manga checkManga(String category){
      String sql = "select * from Manga_HE161916 where category= ?" ;
       try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ps.setString(1,category);
            while (rs.next()) {
                Manga a = new Manga(rs.getInt(1));
                return a;
            }
        } catch (Exception e) {
//            status = "Error at load Department " + e.getMessage();
        }
        return null; 
    }
     public User checkUserExist(String user){
        String sql = "select * from User_HE161916 where [user_login] = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ps.setString(1, user);
            while (rs.next()) {
                return new User(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7));  
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
     public void signUp(String user, String password, String email, String user_name,int user_id){
        String sql = "insert into User_HE161916 values (?, ?, ?, ?, ?, null, null)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ps.setInt(1, user_id);
            ps.setString(2, user_name);
            ps.setString(3, user);
            ps.setString(4, email);
            ps.setString(5, password);
            ps.executeUpdate();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
      public void editAccount(String password, String email, int id){
        String sql = "update User_HE161916 set password = ? email = ?  where user_id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ps.setString(1, password);
            ps.setString(2, email);
            ps.setInt(3, id);
            ps.executeUpdate();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
      public ArrayList<Manga> searchByName(String txtSearch){
        ArrayList<Manga> list = new ArrayList<>();
        String sql = "select * from Manga_HE161916 where [manga_name] like ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ps.setString(1, "%" + txtSearch + "%");
            while (rs.next()) {
                list.add(new Manga(0, sql, 0, 0, sql, 0, txtSearch, sql, sql, 0, sql, sql));
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }
}

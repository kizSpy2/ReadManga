/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Models.*;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ducan
 */
public class DAO {

    private ArrayList<Manga> manga;
    private HashMap<Integer, Category> category;
    private Connection con;
    public String status = "";
    private ArrayList<Comment> comment;
    private ArrayList<History> history;
    private ArrayList<Team> team;
    private ArrayList<User> user;
    private ArrayList<Rating> rating;
    private ArrayList<Chapter> chap;

    public DAO() {
        try {
            con = new DBContext().getConnection();
            status = "Ket noi thanh cong";
        } catch (Exception e) {
            status = "Ket noi that bai " + e.getMessage();
        }
    }

    public ArrayList<Manga> getManga() {
        return manga;
    }

    public void setManga(ArrayList<Manga> manga) {
        this.manga = manga;
    }

    public HashMap<Integer, Category> getCategory() {
        return category;
    }

    public void setCategory(HashMap<Integer, Category> category) {
        this.category = category;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Comment> getComment() {
        return comment;
    }

    public void setComment(ArrayList<Comment> comment) {
        this.comment = comment;
    }

    public ArrayList<History> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<History> history) {
        this.history = history;
    }

    public ArrayList<Team> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<Team> team) {
        this.team = team;
    }

    public ArrayList<User> getUser() {
        return user;
    }

    public void setUser(ArrayList<User> user) {
        this.user = user;
    }

    public ArrayList<Rating> getRating() {
        return rating;
    }

    public void setRating(ArrayList<Rating> rating) {
        this.rating = rating;
    }

    public ArrayList<Chapter> getChap() {
        return chap;
    }

    public void setChap(ArrayList<Chapter> chap) {
        this.chap = chap;
    }

    public void LoadCategory() {
        category = new HashMap<>();
        String sql = "select * from Category_HE161916";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String info = rs.getString(3);
                category.put(id, new Category(id, name, info));
            }
        } catch (Exception e) {
            status = "Error at load Department " + e.getMessage();
        }
    }

    public void LoadManga() {
        manga = new ArrayList<>();
        String sql = "select * from Manga_HE161916";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int category_id = rs.getInt(3);
                int team_id = rs.getInt(4);
                String auth = rs.getString(5);
                int status = rs.getInt(6);
                String other_name = rs.getString(7);
                String infor = rs.getString(8);
                String illu = rs.getString(9);
                int user_id = rs.getInt(10);
                String art = rs.getString(11);
                String time = rs.getString(12);
                manga.add(new Manga(id, name, category_id, team_id, auth, status, other_name, infor, illu, user_id, art, time));
            }
        } catch (Exception e) {
            status = "Error at load Department " + e.getMessage();
        }
    }

    public void LoadChapter() {
        chap = new ArrayList<>();
        String sql = "select * from Comment_HE161916";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int manga_id = rs.getInt(1);
                int chapter_id = rs.getInt(2);
                String name = rs.getString(3);
                String url = rs.getString(4);
                int number = rs.getInt(5);
                Timestamp time = rs.getTimestamp(7);
                int chapter_number = rs.getInt(8);
                BigInteger view = new BigInteger(rs.getString(6));
                chap.add(new Chapter(manga_id, chapter_id, name, url, chapter_number, view, time, chapter_number));
            }
        } catch (Exception e) {
            status = "Error at load Department " + e.getMessage();
        }
    }

    public void LoadComment() {
        comment = new ArrayList<>();
        String sql = "select * from Comment_HE161916";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int manga_id = rs.getInt(1);
                int chapter_id = rs.getInt(2);
                int comment_id = rs.getInt(3);
                String infor = rs.getString(4);
                Timestamp time = rs.getTimestamp(5);
                int comment_to = rs.getInt(6);
                int comment_from = rs.getInt(7);
                int rating = rs.getInt(8);
                comment.add(new Comment(manga_id, chapter_id, comment_id, infor, time, comment_to, comment_from, rating));
            }
        } catch (Exception e) {
            status = "Error at load Department " + e.getMessage();
        }
    }

    public void LoadHistory() {
        history = new ArrayList<>();
        String sql = "select * from History_HE161916";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int history_id = rs.getInt(1);
                int manga_id = rs.getInt(2);
                int chapter_id = rs.getInt(3);
                Timestamp time = rs.getTimestamp(4);
                history.add(new History(history_id, manga_id, chapter_id, time));
            }
        } catch (Exception e) {
            status = "Error at load Department " + e.getMessage();
        }
    }

    public void LoadRating() {
        rating = new ArrayList<>();
        String sql = "select * from Rating_HE161916";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int rating_id = rs.getInt(1);
                int manga_id = rs.getInt(2);
                int user_id = rs.getInt(3);
                float rate = rs.getFloat(4);
                rating.add(new Rating(rating_id, manga_id, user_id, rate));
            }
        } catch (Exception e) {
            status = "Error at load Department " + e.getMessage();
        }
    }
    

    public void LoadTeam() {
        team = new ArrayList<>();
        String sql = "select * from Team_HE161916";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int team_id = rs.getInt(1);
                String name = rs.getString(2);
                int manga_id = rs.getInt(3);
                String logo_url = rs.getString(4);
                String team_url = rs.getString(5);
                int user_id = rs.getInt(6);
                team.add(new Team(team_id, team_url, manga_id, logo_url, team_url, user_id));
            }
        } catch (Exception e) {
            status = "Error at load Department " + e.getMessage();
        }
    }
     public void LoadUser() {
        user = new ArrayList<>();
        String sql = "select * from User_HE161916";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String user_login = rs.getString(3);
                String email = rs.getString(4);
                String password = rs.getString(5);
                String avatar = rs.getString(6);
                int roll = rs.getInt(7);
                user.add(new User(id, name, user_login, email, password, avatar, roll));
            }
        } catch (Exception e) {
            status = "Error at load Department " + e.getMessage();
        }
    }
}


class Testing {

    public static void main(String[] args) {
        DAO dao = new DAO();
        dao.LoadCategory();
        dao.LoadManga();
        for (Manga user : dao.getManga()) {
            System.out.println(user);
        }
         System.out.println("dao.status " + dao.status);
    }
}

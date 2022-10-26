/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.sql.Timestamp;

/**
 *
 * @author ducan
 */
public class Comment {
    private int manga_id;
    private int user_id;
    private int comment_id;
    private String comment_infor;
    private Timestamp comment_time;
    private int comment_to;
    private int comment_from;
    private int rating;

    public Comment() {
    }

    public Comment(int manga_id, int user_id, int comment_id, String comment_infor, Timestamp comment_time, int comment_to, int comment_from, int rating) {
        this.manga_id = manga_id;
        this.user_id = user_id;
        this.comment_id = comment_id;
        this.comment_infor = comment_infor;
        this.comment_time = comment_time;
        this.comment_to = comment_to;
        this.comment_from = comment_from;
        this.rating = rating;
    }

    

    public int getManga_id() {
        return manga_id;
    }

    public void setManga_id(int manga_id) {
        this.manga_id = manga_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public String getComment_infor() {
        return comment_infor;
    }

    public void setComment_infor(String comment_infor) {
        this.comment_infor = comment_infor;
    }

    public Timestamp getComment_time() {
        return comment_time;
    }

    public void setComment_time(Timestamp comment_time) {
        this.comment_time = comment_time;
    }

    public int getComment_to() {
        return comment_to;
    }

    public void setComment_to(int comment_to) {
        this.comment_to = comment_to;
    }

    public int getComment_from() {
        return comment_from;
    }

    public void setComment_from(int comment_from) {
        this.comment_from = comment_from;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    
    
}

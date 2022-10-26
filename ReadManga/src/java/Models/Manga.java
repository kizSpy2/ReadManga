/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author ducan
 */
public class Manga {
    private int manga_id;
    private String manga_name;
    private int category_id;
    private int team_id;
    private String auth;
    private int status;
    private String other_name;
    private String manga_infor;
    private String illu_url;
    private int user_id;
    private String art;
    private String time;

    public Manga() {
    }

    public Manga(int manga_id) {
        this.manga_id = manga_id;
    }

    public Manga(int manga_id, String manga_name, int category_id, int team_id, String auth, int status, String other_name, String manga_infor, String illu_url, int user_id, String art, String time) {
        this.manga_id = manga_id;
        this.manga_name = manga_name;
        this.category_id = category_id;
        this.team_id = team_id;
        this.auth = auth;
        this.status = status;
        this.other_name = other_name;
        this.manga_infor = manga_infor;
        this.illu_url = illu_url;
        this.user_id = user_id;
        this.art = art;
        this.time = time;
    }

    public int getManga_id() {
        return manga_id;
    }

    public void setManga_id(int manga_id) {
        this.manga_id = manga_id;
    }

    public String getManga_name() {
        return manga_name;
    }

    public void setManga_name(String manga_name) {
        this.manga_name = manga_name;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getOther_name() {
        return other_name;
    }

    public void setOther_name(String other_name) {
        this.other_name = other_name;
    }

    public String getManga_infor() {
        return manga_infor;
    }

    public void setManga_infor(String manga_infor) {
        this.manga_infor = manga_infor;
    }

    public String getIllu_url() {
        return illu_url;
    }

    public void setIllu_url(String illu_url) {
        this.illu_url = illu_url;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Manga{" + "manga_id=" + manga_id + ", manga_name=" + manga_name + ", category_id=" + category_id + ", team_id=" + team_id + ", auth=" + auth + ", status=" + status + ", other_name=" + other_name + ", manga_infor=" + manga_infor + ", illu_url=" + illu_url + ", user_id=" + user_id + ", art=" + art + ", time=" + time + '}';
    }

    
    
    
}

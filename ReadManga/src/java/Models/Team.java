/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author ducan
 */
public class Team {
    private int team_id;
    private String team_name;
    private int manga_id;
    private String logo_url;
    private String team_url;
    private int user_id;

    public Team() {
    }

    public Team(int team_id, String team_name, int manga_id, String logo_url, String team_url, int user_id) {
        this.team_id = team_id;
        this.team_name = team_name;
        this.manga_id = manga_id;
        this.logo_url = logo_url;
        this.team_url = team_url;
        this.user_id = user_id;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public int getManga_id() {
        return manga_id;
    }

    public void setManga_id(int manga_id) {
        this.manga_id = manga_id;
    }

    public String getLogo_url() {
        return logo_url;
    }

    public void setLogo_url(String logo_url) {
        this.logo_url = logo_url;
    }

    public String getTeam_url() {
        return team_url;
    }

    public void setTeam_url(String team_url) {
        this.team_url = team_url;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    
    
}

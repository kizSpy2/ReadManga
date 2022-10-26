/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.math.BigInteger;
import java.sql.Timestamp;

/**
 *
 * @author ducan
 */
public class Chapter {
    private int manga_id;
    private int chapter_id;
    private String chapter_name;
    private String page_url;
    private int page_number;
    private BigInteger views;
    private Timestamp time;
    private int chapter_number;
    public Chapter() {
    }

    public Chapter(int manga_id, int chapter_id, String chapter_name, String page_url, int page_number, BigInteger views, Timestamp time, int chapter_number) {
        this.manga_id = manga_id;
        this.chapter_id = chapter_id;
        this.chapter_name = chapter_name;
        this.page_url = page_url;
        this.page_number = page_number;
        this.views = views;
        this.time = time;
        this.chapter_number = chapter_number;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public int getManga_id() {
        return manga_id;
    }

    public void setManga_id(int manga_id) {
        this.manga_id = manga_id;
    }

    public int getChapter_id() {
        return chapter_id;
    }

    public void setChapter_id(int chapter_id) {
        this.chapter_id = chapter_id;
    }

    public String getChapter_name() {
        return chapter_name;
    }

    public void setChapter_name(String chapter_name) {
        this.chapter_name = chapter_name;
    }

    public String getPage_url() {
        return page_url;
    }

    public void setPage_url(String page_url) {
        this.page_url = page_url;
    }

    public int getPage_number() {
        return page_number;
    }

    public void setPage_number(int page_number) {
        this.page_number = page_number;
    }

    public BigInteger getViews() {
        return views;
    }

    public void setViews(BigInteger views) {
        this.views = views;
    }

    public int getChapter_number() {
        return chapter_number;
    }

    public void setChapter_number(int chapter_number) {
        this.chapter_number = chapter_number;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author ducan
 */
public class Category {
    private int category_id;
    private String category_name;
    private String category_infor;

    public Category(int category_id, String category_name, String category_infor) {
        this.category_id = category_id;
        this.category_name = category_name;
        this.category_infor = category_infor;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getCategory_infor() {
        return category_infor;
    }

    public void setCategory_infor(String category_infor) {
        this.category_infor = category_infor;
    }

    @Override
    public String toString() {
        return "Category{" + "category_id=" + category_id + ", category_name=" + category_name + ", category_infor=" + category_infor + '}';
    }
    
    
}

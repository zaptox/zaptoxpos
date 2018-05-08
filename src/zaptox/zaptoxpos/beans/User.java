/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaptox.zaptoxpos.beans;

/**
 *
 * @author Dell
 */
public class User {
  private int user_id;
private int user_type_id;
private String user_name;
private String passsword;
private String name;
private String address;
private String contact_number;
private int active;

    public User(int user_id, int user_type_id, String user_name, 
            String passsword, String name, String address, String contact_number, int active) {
        this.user_id = user_id;
        this.user_type_id = user_type_id;
        this.user_name = user_name;
        this.passsword = passsword;
        this.name = name;
        this.address = address;
        this.contact_number = contact_number;
        this.active = active;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getUser_type_id() {
        return user_type_id;
    }

    public void setUser_type_id(int user_type_id) {
        this.user_type_id = user_type_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }



}

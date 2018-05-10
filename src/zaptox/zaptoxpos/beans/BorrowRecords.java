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
public class BorrowRecords {
    int  borrow_id;
    String customer_name;
    String customer_address;
    int amount;
    String contact;
    int active;

    public BorrowRecords(int borrow_id, String customer_name, String customer_address, int amount, String contact, int active) {
        this.borrow_id = borrow_id;
        this.customer_name = customer_name;
        this.customer_address = customer_address;
        this.amount = amount;
        this.contact = contact;
        this.active = active;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }


    public int getBorrow_id() {
        return borrow_id;
    }

    public void setBorrow_id(int borrow_id) {
        this.borrow_id = borrow_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    
    
}

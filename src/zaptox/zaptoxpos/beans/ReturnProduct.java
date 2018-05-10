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
public class ReturnProduct {
    int return_id;
    int product_id;
    int quantity;
    int active;
    String return_date;

    public ReturnProduct(int return_id, int product_id, int quantity, int active, String return_date) {
        this.return_id = return_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.active = active;
        this.return_date = return_date;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
    

    public int getReturn_id() {
        return return_id;
    }

    public void setReturn_id(int return_id) {
        this.return_id = return_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}

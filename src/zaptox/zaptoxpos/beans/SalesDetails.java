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
public class SalesDetails {
    private int sales_details_id;
private int sales_id;
private int product_id;
private int quantity;
private int active;
private int created_by;
private String created_date;
private int modified_by;
private String modified_date;

    public SalesDetails(int sales_details_id, int sales_id, int product_id, int quantity, int active, int created_by, String created_date, int modified_by, String modified_date) {
        this.sales_details_id = sales_details_id;
        this.sales_id = sales_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.active = active;
        this.created_by = created_by;
        this.created_date = created_date;
        this.modified_by = modified_by;
        this.modified_date = modified_date;
    }

    public int getSales_details_id() {
        return sales_details_id;
    }

    public void setSales_details_id(int sales_details_id) {
        this.sales_details_id = sales_details_id;
    }

    public int getSales_id() {
        return sales_id;
    }

    public void setSales_id(int sales_id) {
        this.sales_id = sales_id;
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

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public int getModified_by() {
        return modified_by;
    }

    public void setModified_by(int modified_by) {
        this.modified_by = modified_by;
    }

    public String getModified_date() {
        return modified_date;
    }

    public void setModified_date(String modified_date) {
        this.modified_date = modified_date;
    }

   


}

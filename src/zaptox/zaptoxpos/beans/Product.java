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
public class Product {

    private int product_id;
    private int category_id;
    private String name;
    private int actual_price;
    private int selling_price;
    private int active;
    private int quantity;
    private int created_by;
    private String created_date;
    private int modified_by;
    private String modified_date;
    private String product_barcode;

    public Product(int product_id, int category_id, String name, int actual_price, int selling_price, int active, int quantity, int created_by, String created_date, int modified_by, String modified_date, String product_barcode) {
        this.product_id = product_id;
        this.category_id = category_id;
        this.name = name;
        this.actual_price = actual_price;
        this.selling_price = selling_price;
        this.active = active;
        this.quantity = quantity;
        this.created_by = created_by;
        this.created_date = created_date;
        this.modified_by = modified_by;
        this.modified_date = modified_date;
        this.product_barcode = product_barcode;
    }

    public String getProduct_barcode() {
        return product_barcode;
    }

    public void setProduct_barcode(String product_barcode) {
        this.product_barcode = product_barcode;
    }

    

    public int getActual_price() {
        return actual_price;
    }

    public void setActual_price(int actual_price) {
        this.actual_price = actual_price;
    }

    public int getSelling_price() {
        return selling_price;
    }

    public void setSelling_price(int selling_price) {
        this.selling_price = selling_price;
    }


    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

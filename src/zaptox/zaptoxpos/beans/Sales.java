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
public class Sales {

    private int sale_id;
    private String sale_uniq_number;

    private String date;
    private int active;
    private int discount_id;
    private float discount;
    private String total_bill;

    private int created_by;
    private String created_date;
    private int modified_by;
    private String modified_date;

    public Sales(int sale_id, String sale_uniq_number, String date, int active, int discount_id, float discount, String total_bill, int created_by, String created_date, int modified_by, String modified_date) {
        this.sale_id = sale_id;
        this.sale_uniq_number = sale_uniq_number;
        this.date = date;
        this.active = active;
        this.discount_id = discount_id;
        this.discount = discount;
        this.total_bill = total_bill;
        this.created_by = created_by;
        this.created_date = created_date;
        this.modified_by = modified_by;
        this.modified_date = modified_date;
    }

    public int getSale_id() {
        return sale_id;
    }

    public void setSale_id(int sale_id) {
        this.sale_id = sale_id;
    }

    public String getSale_uniq_number() {
        return sale_uniq_number;
    }

    public void setSale_uniq_number(String sale_uniq_number) {
        this.sale_uniq_number = sale_uniq_number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getDiscount_id() {
        return discount_id;
    }

    public void setDiscount_id(int discount_id) {
        this.discount_id = discount_id;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getTotal_bill() {
        return total_bill;
    }

    public void setTotal_bill(String total_bill) {
        this.total_bill = total_bill;
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

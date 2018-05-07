/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaptox.zaptoxpos.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import zaptox.zaptoxpos.beans.BorrowRecords;
import zaptox.zaptoxpos.beans.Branch;
import zaptox.zaptoxpos.beans.Category;
import zaptox.zaptoxpos.beans.Discount;
import zaptox.zaptoxpos.beans.Permission;
import zaptox.zaptoxpos.beans.Product;
import zaptox.zaptoxpos.beans.ReturnProduct;
import zaptox.zaptoxpos.beans.Sales;
import zaptox.zaptoxpos.beans.SalesDetails;
import zaptox.zaptoxpos.beans.UserType;
import zaptox.zaptoxpos.beans.User;
import zaptox.zaptoxpos.db.DbConnection;

/**
 *
 * @author Dell
 */
public class DbManager implements DbManagerInterface {

    private static Connection conn = DbConnection.conn;

    @Override
    public ArrayList<User> getAllUsers() {
        String query = "SELECT * FROM USER WHERE active=1";
        ArrayList<User> list = new ArrayList<>();
        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                int user_id = rs.getInt("user_id");
                int user_catid = rs.getInt("user_type_id");
                String user_name = rs.getString("user_name");
                String passsword = rs.getString("password");
                String name = rs.getString("name");
                String address = rs.getString("address");
                String contact_number = rs.getString("contact_number");

                int active = rs.getInt("active");

                list.add(new User(user_id, user_catid, user_name, passsword, name, address, contact_number, active));

            }

        } catch (SQLException ex) {
//            Logger.getLogger(CustomerBal.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error in getting data from database");
        }
        return list;

    }

    @Override
    public User getUser(int user_id1) {
        User user = null;
        String query = "SELECT * FROM USER WHERE user_id=?;";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, user_id1);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int user_id = rs.getInt("user_id");
                int user_type_id = rs.getInt("user_type_id");
                String user_name = rs.getString("user_name");
                String passsword = rs.getString("password");
                String name = rs.getString("name");
                String address = rs.getString("address");
                String contact_number = rs.getString("contact_number");

                int active = rs.getInt("active");

                User u = new User(user_id, user_type_id, user_name, passsword, name, address, contact_number, active);

            }

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }
        return user;
    }

    @Override
    public int updateUser(User user) {
        String query = "UPDATE USER SET `user_name` = ? , `password` = ? , "
                + "`name` = ? , `address` = ? ,"
                + " `contact_number` = ? WHERE `user_id` = ?;  ";
        int i = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, user.getUser_name());
            ps.setString(2, user.getPasssword());
            ps.setString(3, user.getName());
            ps.setString(4, user.getAddress());
            ps.setString(5, user.getContact_number());
            ps.setInt(6, user.getUser_id());

            Statement s = conn.createStatement();
            i = ps.executeUpdate();

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }

        return i;
    }

    @Override
    public int deleteUser(User user) {
        String query = "UPDATE USER SET `active` = ? WHERE `user_id` = ?; ";
        int i = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, 0);
            ps.setInt(2, user.getUser_id());

            Statement s = conn.createStatement();
            i = ps.executeUpdate();

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }

        return i;

    }

    @Override
    public int insertUser(User user) {
        String query = "INSERT INTO USER (`user_type_id`, `user_name`, `password`, `name`, `address`, `contact_number`) "
                + "VALUES (?, ?, ?, ?, ?, ?);  ";

        int i = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, user.getUser_type_id());
            ps.setString(2, user.getUser_name());
            ps.setString(3, user.getPasssword());
            ps.setString(4, user.getName());
            ps.setString(5, user.getAddress());
            ps.setString(6, user.getContact_number());

            Statement s = conn.createStatement();
            i = ps.executeUpdate();

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }

        return i;

    }

    @Override
    public User userAuthentication(String username, String password) {
        User user = null;
        String query = "SELECT * FROM USER WHERE user_name=? AND PASSWORD=?";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int user_id = rs.getInt("user_id");
                int user_type_id = rs.getInt("user_type_id");
                String user_name = rs.getString("user_name");
                String passsword = rs.getString("password");
                String name = rs.getString("name");
                String address = rs.getString("address");
                String contact_number = rs.getString("contact_number");

                int active = rs.getInt("active");

                user= new User(user_id, user_type_id, user_name, passsword, name, address, contact_number, active);

            }

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }
        return user;
    }

    @Override
    public ArrayList<UserType> getAllUsersType() {
String query = "SELECT * FROM user_type WHERE active=1;";
        ArrayList<UserType> list = new ArrayList<>();
        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                int user_catid = rs.getInt("user_type_id");
                String user_type = rs.getString("user_type");
                int active = rs.getInt("active");
                

                list.add(new UserType(user_catid, user_type, active));
            }

        } catch (SQLException ex) {
//            Logger.getLogger(CustomerBal.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error in getting data from database");
        }
        return list;


    }

    @Override
    public UserType getUserType(int user_type_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateUserType(UserType userType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteUserType(UserType userType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertUserType(UserType userType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Product> getAllProducts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Product> getAllProductsSearch(String search) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product getProduct(int product_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateProduct(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteProduct(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertProduct(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Permission> getAllPermissions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Permission getPermission(int permission_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updatePermission(Permission permission) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deletePermission(Permission permission) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertPermission(Permission permission) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SalesDetails> getAllSalesDetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SalesDetails getSalesDetails(int sales_details_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateSalesDetails(SalesDetails salesDetails) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteSalesDetails(SalesDetails salesDetails) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertSalesDetails(SalesDetails salesDetails) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Sales> getAllSales() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sales getSales(int sales_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateSales(Sales sales) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteSales(Sales sales) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertSales(Sales sales) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Discount> getAllDiscounts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Discount getDiscount(int discount_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateDiscount(Discount discount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteDiscount(Discount discount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertDiscount(Discount discount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Category> getAllCategory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Category getCategory(int category_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateCategory(Category category) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteCategory(Category category) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertCategory(Category category) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<BorrowRecords> getAllBorrowRecords() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Category getBorrowRecords(int borrow_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateBorrowRecords(BorrowRecords b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteBorrowRecords(BorrowRecords b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertBorrowRecords(BorrowRecords b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Branch> getAllBranch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Category getBranch(int branch_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateBranch(Branch b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteBranch(Branch b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertBranch(Branch b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ReturnProduct> getAllReturnProduct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Category getReturnProduct(int return_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateReturnProduct(ReturnProduct b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteReturnProduct(ReturnProduct b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertReturnProduct(ReturnProduct b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

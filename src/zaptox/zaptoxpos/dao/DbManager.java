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

                user = new User(user_id, user_type_id, user_name, passsword, name, address, contact_number, active);

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

        UserType usertype = null;
        String query = "SELECT * FROM user_type WHERE user_type_id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, user_type_id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int user_catid = rs.getInt("user_type_id");
                String user_type = rs.getString("user_type");
                int active = rs.getInt("active");

                usertype = new UserType(user_catid, user_type, active);

            }

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }
        return usertype;

    }

    @Override
    public int updateUserType(UserType userType) {
        String query = "UPDATE user_type SET `user_type` = ? WHERE `user_type_id` = ?;  ";
        int i = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, userType.getUser_type());
            ps.setInt(2, userType.getUser_type_id());

            Statement s = conn.createStatement();
            i = ps.executeUpdate();

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }

        return i;

    }

    @Override
    public int deleteUserType(UserType userType) {

        String query = "UPDATE user_type SET `active` = ? WHERE `user_type_id` = ?; ";
        int i = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, 0);
            ps.setInt(2, userType.getUser_type_id());

            Statement s = conn.createStatement();
            i = ps.executeUpdate();

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }

        return i;

    }

    @Override
    public int insertUserType(UserType userType) {
        String query = "INSERT INTO `user_type` (`user_type`) VALUES (?);  ";

        int i = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, userType.getUser_type());

            Statement s = conn.createStatement();
            i = ps.executeUpdate();

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }

        return i;

    }

    @Override
    public ArrayList<Product> getAllProducts() {
        String query = "SELECT * FROM product WHERE active=1";
        ArrayList<Product> list = new ArrayList<>();
        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                int product_id = rs.getInt("product_id");
                int category_id = rs.getInt("category_id");
                String name = rs.getString("name");
                int actual_price = rs.getInt("actual_price");
                int selling_price = rs.getInt("selling_price");
                int active = rs.getInt("active");
                int quantity = rs.getInt("quantity");
                int created_by = rs.getInt("created_by");
                String created_date = rs.getString("created_date");
                int modified_by = rs.getInt("modified_by");;
                String modified_date = rs.getString("modified_date");
                String product_barcode = rs.getString("product_barcode");

                list.add(new Product(product_id, category_id, name, actual_price, selling_price, active, quantity, created_by, created_date, modified_by, modified_date, product_barcode));
            }

        } catch (SQLException ex) {
//            Logger.getLogger(CustomerBal.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error in getting data from database");
        }
        return list;

    }

    @Override
    public ArrayList<Product> getAllProductsSearch(String search) {
        String query = "SELECT * FROM product WHERE NAME LIKE '%" + search + "%' AND active=1; ";
        ArrayList<Product> list = new ArrayList<>();
        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                int product_id = rs.getInt("product_id");
                int category_id = rs.getInt("category_id");
                String name = rs.getString("name");
                int actual_price = rs.getInt("actual_price");
                int selling_price = rs.getInt("selling_price");
                int active = rs.getInt("active");
                int quantity = rs.getInt("quantity");
                int created_by = rs.getInt("created_by");
                String created_date = rs.getString("created_date");
                int modified_by = rs.getInt("modified_by");;
                String modified_date = rs.getString("modified_date");
                String product_barcode = rs.getString("product_barcode");

                list.add(new Product(product_id, category_id, name, actual_price, selling_price, active, quantity, created_by, created_date, modified_by, modified_date, product_barcode));
            }

        } catch (SQLException ex) {
//            Logger.getLogger(CustomerBal.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error in getting data from database");
        }
        return list;
    }

    @Override
    public Product getProduct(int product_id) {
        Product product = null;
        String query = "SELECT * FROM product WHERE product_id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, product_id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int product_id1 = rs.getInt("product_id");
                int category_id = rs.getInt("category_id");
                String name = rs.getString("name");
                int actual_price = rs.getInt("actual_price");
                int selling_price = rs.getInt("selling_price");
                int active = rs.getInt("active");
                int quantity = rs.getInt("quantity");
                int created_by = rs.getInt("created_by");
                String created_date = rs.getString("created_date");
                int modified_by = rs.getInt("modified_by");;
                String modified_date = rs.getString("modified_date");
                String product_barcode = rs.getString("product_barcode");

                product = new Product(product_id, category_id, name, actual_price, selling_price, active, quantity, created_by, created_date, modified_by, modified_date, product_barcode);

            }

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }
        return product;

    }

    @Override
    public int updateProduct(Product product) {
        String query = " UPDATE product SET `product_barcode` = ? , "
                + "`category_id` = ? , `name` = ? , `actual_price` = ? ,"
                + " `selling_price` = ? , `quantity` = ?   "
                + "WHERE `product_id` = ?;   ";
        int i = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, product.getProduct_barcode());
            ps.setInt(2, product.getCategory_id());
            ps.setString(3, product.getName());
            ps.setInt(4, product.getActual_price());
            ps.setInt(5, product.getSelling_price());
            ps.setInt(6, product.getQuantity());
            ps.setInt(7, product.getProduct_id());

            Statement s = conn.createStatement();
            i = ps.executeUpdate();

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }

        return i;

    }

    @Override
    public int deleteProduct(Product product) {
        String query = "UPDATE product SET `active` = ? WHERE `product_id` = ?;  ";
        int i = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, 0);
            ps.setInt(2, product.getProduct_id());

            Statement s = conn.createStatement();
            i = ps.executeUpdate();

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }

        return i;

    }

    @Override
    public int insertProduct(Product product) {
        String query = "INSERT INTO product (`product_barcode`,`category_id`, `name`, `actual_price`, "
                + "`selling_price`, `quantity`, `created_by`, `created_date`, `modified_by`, `modified_date`) "
                + "VALUES (?,?, ?, ?, ?, ?, ?, ?, ?, ?);   ";

        int i = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, product.getProduct_barcode());
            ps.setInt(2, product.getCategory_id());
            ps.setString(3, product.getName());
            ps.setInt(4, product.getActual_price());
            ps.setInt(5, product.getSelling_price());
            ps.setInt(6, product.getQuantity());
            ps.setInt(7, product.getCreated_by());
            ps.setString(8, product.getCreated_date());
            ps.setInt(9, product.getModified_by());
            ps.setString(10, product.getModified_date());

            Statement s = conn.createStatement();
            i = ps.executeUpdate();

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }

        return i;

    }

    @Override
    public ArrayList<Permission> getAllPermissions() {

        String query = "SELECT * FROM permission";
        ArrayList<Permission> list = new ArrayList<>();
        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                int permission_id = rs.getInt("permission_id");
                String name = rs.getString("permission_name");

                list.add(new Permission(permission_id, name));
            }

        } catch (SQLException ex) {
//            Logger.getLogger(CustomerBal.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error in getting data from database");
        }
        return list;
    }

    @Override
    public Permission getPermission(int permission_id) {
        Permission permission = null;
        String query = "SELECT * FROM permission WHERE permission_id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, permission_id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int permission_id1 = rs.getInt("permission_id");
                String name = rs.getString("permission_name");

                permission = new Permission(permission_id1, name);

            }

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }
        return permission;
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
        String query = "select * from discount; ";
        ArrayList<Discount> list = new ArrayList<>();
        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                int discount_id = rs.getInt("discount_id");
                int discount = rs.getInt("discount");
                String discount_type = rs.getString("discount_type");

                list.add(new Discount(discount_id, discount, discount_type));
            }

        } catch (SQLException ex) {
//            Logger.getLogger(CustomerBal.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error in getting data from database");
        }
        return list;

    }

    @Override
    public Discount getDiscount(int discount_id) {
        Discount discount = null;
        String query = "SELECT * FROM discount WHERE discount_id= ?";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, discount_id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int discount_id1 = rs.getInt("discount_id");
                int discountget = rs.getInt("discount");
                String discount_type = rs.getString("discount_type");

                discount = new Discount(discount_id1, discountget, discount_type);
            }

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }
        return discount;

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
        String query = "SELECT * FROM category WHERE active= 1;";
        ArrayList<Category> list = new ArrayList<>();
        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                int category_id1 = rs.getInt("category_id");
                String name = rs.getString("name");
                int active = rs.getInt("active");

                list.add(new Category(category_id1, name, active));
            }

        } catch (SQLException ex) {
//            Logger.getLogger(CustomerBal.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error in getting data from database");
        }
        return list;

    }

    @Override
    public Category getCategory(int category_id) {
        Category category = null;
        String query = "SELECT * FROM category WHERE category_id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, category_id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int category_id1 = rs.getInt("category_id");
                String name = rs.getString("name");
                int active = rs.getInt("active");

                category = new Category(category_id1, name, active);
            }

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }
        return category;

    }

    @Override
    public int updateCategory(Category category) {

        String query = "UPDATE category SET `name` = ? WHERE `category_id` = ?; ";
        int i = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, category.getName());
            ps.setInt(2, category.getCategory_id());

            Statement s = conn.createStatement();
            i = ps.executeUpdate();

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }

        return i;

    }

    @Override
    public int deleteCategory(Category category) {
        String query = "UPDATE category SET `active` = ? WHERE `category_id` = ?";
        int i = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, 0);
            ps.setInt(2, category.getCategory_id());

            Statement s = conn.createStatement();
            i = ps.executeUpdate();

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }

        return i;
    }

    @Override
    public int insertCategory(Category category) {

        String query = "INSERT INTO category (`name`) VALUES (?);";

        int i = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, category.getName());
            Statement s = conn.createStatement();
            i = ps.executeUpdate();

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }

        return i;

    }

    @Override
    public ArrayList<BorrowRecords> getAllBorrowRecords() {
        String query = "SELECT * FROM borrow_records where active=1";
        ArrayList<BorrowRecords> list = new ArrayList<>();
        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                int borrow_id = rs.getInt("borrow_id");
                String customer_name = rs.getString("customer_name");
                String customer_address = rs.getString("customer_address");
                int amount = rs.getInt("amount");
                String contact = rs.getString("contact");
                int active = rs.getInt("active");

                list.add(new BorrowRecords(borrow_id, customer_name, customer_address, amount, contact, active));
            }

        } catch (SQLException ex) {
//            Logger.getLogger(CustomerBal.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error in getting data from database");
        }
        return list;

    }

    @Override
    public BorrowRecords getBorrowRecords(int borrow_id) {
        BorrowRecords b = null;
        String query = "SELECT * FROM borrow_records WHERE borrow_id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, borrow_id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int borrow_id1 = rs.getInt("borrow_id");
                String customer_name = rs.getString("customer_name");
                String customer_address = rs.getString("customer_address");
                int amount = rs.getInt("amount");
                String contact = rs.getString("contact");
                int active = rs.getInt("active");

                b = new BorrowRecords(borrow_id1, customer_name, customer_address, amount, contact, active);
            }

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }
        return b;

    }

    @Override
    public int updateBorrowRecords(BorrowRecords b) {
        String query = "UPDATE borrow_records SET `customer_name` = ? ,"
                + " `customer_address` = ? , `amount` = ? , `contact` = ? WHERE `borrow_id` = ?; ";

        int i = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, b.getCustomer_name());
            ps.setString(2, b.getCustomer_address());
            ps.setInt(3, b.getAmount());
            ps.setString(4, b.getContact());
            ps.setInt(5, b.getBorrow_id());

            Statement s = conn.createStatement(); 
            i = ps.executeUpdate();

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }

        return i;
    }

    @Override
    public int deleteBorrowRecords(BorrowRecords b) {
        String query = "UPDATE borrow_records SET `active` = '0' WHERE `borrow_id` = ?;";
        int i = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, b.getBorrow_id());

            Statement s = conn.createStatement();
            i = ps.executeUpdate();

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }

        return i;

    }

    @Override
    public int insertBorrowRecords(BorrowRecords b) {
        String query = "INSERT INTO borrow_records (`customer_name`, `customer_address`, "
                + "`amount`, `contact`) VALUES (?, ?, ?,?); ";

        int i = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, b.getCustomer_name());
            ps.setString(1, b.getCustomer_address());
            ps.setInt(1, b.getAmount());
            ps.setString(1, b.getContact());

            Statement s = conn.createStatement();
            i = ps.executeUpdate();

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }

        return i;

    }

    @Override
    public ArrayList<Branch> getAllBranch() {
        String query = "SELECT * FROM branch_table WHERE active=1;";
        ArrayList<Branch> list = new ArrayList<>();
        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                int branch_id = rs.getInt("branch_id");
                String branch_owner = rs.getString("branch_owner");
                String branch_address = rs.getString("branch_address");
                double profit = rs.getDouble("profit");
                double loss = rs.getDouble("loss");
                int active = rs.getInt("active");

                list.add(new Branch(branch_id, branch_owner, branch_address, profit, loss, active));
            }

        } catch (SQLException ex) {
//            Logger.getLogger(CustomerBal.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error in getting data from database");
        }
        return list;

    }

    @Override
    public Branch getBranch(int branch_id) {
        Branch b = null;
        String query = "SELECT * FROM branch_table WHERE branch_id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, branch_id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int branch_id1 = rs.getInt("branch_id");
                String branch_owner = rs.getString("branch_owner");
                String branch_address = rs.getString("branch_address");
                double profit = rs.getDouble("profit");
                double loss = rs.getDouble("loss");
                int active = rs.getInt("active");

                b = new Branch(branch_id, branch_owner, branch_address, profit, loss, active);
            }

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }
        return b;

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

        String query = "SELECT * FROM return_product_data WHERE active=1;";
        ArrayList<ReturnProduct> list = new ArrayList<>();
        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                int return_id = rs.getInt("return_id");
                int product_id = rs.getInt("product_id");
                int quantity = rs.getInt("quantity");
                int active = rs.getInt("active");
                String return_date = rs.getString("return_date");
                list.add(new ReturnProduct(return_id, product_id, quantity, active, query));
            }

        } catch (SQLException ex) {
//            Logger.getLogger(CustomerBal.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error in getting data from database");
        }
        return list;
    }

    @Override
    public ReturnProduct getReturnProduct(int return_id) {
        ReturnProduct r = null;
        String query = "SELECT * FROM `return_product_data` WHERE return_id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, return_id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int return_id1 = rs.getInt("return_id");
                int product_id = rs.getInt("product_id");
                int quantity = rs.getInt("quantity");
                int active = rs.getInt("active");
                String return_date = rs.getString("return_date");

                r = new ReturnProduct(return_id1, product_id, quantity, active, return_date);
            }

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }
        return r;

    }

    @Override
    public int updateReturnProduct(ReturnProduct b) {

        String query = " UPDATE return_product_data SET `product_id` = ? , `quantity` = ? , "
                + "`return_date` = ? WHERE `return_id` = ?;  ";
        int i = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, b.getProduct_id());
            ps.setInt(2, b.getQuantity());
            ps.setString(3, b.getReturn_date());
            ps.setInt(4, b.getReturn_id());

            Statement s = conn.createStatement();
            i = ps.executeUpdate();

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }

        return i;

    }

    @Override
    public int deleteReturnProduct(ReturnProduct b) {
        String query = "UPDATE return_product_data SET `active` = '0' WHERE `return_id` = ?; ";
        int i = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, b.getReturn_id());

            Statement s = conn.createStatement();
            i = ps.executeUpdate();

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }

        return i;
    }

    @Override
    public int insertReturnProduct(ReturnProduct b) {
        String query = "INSERT INTO return_product_data (`product_id`, `quantity`,"
                + " `return_date`) VALUES (?, ?, ?);     ";

        int i = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, b.getProduct_id());
            ps.setInt(2, b.getQuantity());
            ps.setString(3, b.getReturn_date());

            Statement s = conn.createStatement();
            i = ps.executeUpdate();

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }

        return i;

    }

  
    
    

}


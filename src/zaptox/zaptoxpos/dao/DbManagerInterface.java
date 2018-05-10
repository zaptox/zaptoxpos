/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaptox.zaptoxpos.dao;


import java.util.ArrayList;
import java.util.List;
import zaptox.zaptoxpos.beans.BorrowRecords;
import zaptox.zaptoxpos.beans.Branch;
import zaptox.zaptoxpos.beans.Category;
import zaptox.zaptoxpos.beans.Discount;
import zaptox.zaptoxpos.beans.Permission;
import zaptox.zaptoxpos.beans.Product;
import zaptox.zaptoxpos.beans.ReturnProduct;
import zaptox.zaptoxpos.beans.Sales;
import zaptox.zaptoxpos.beans.SalesDetails;
import zaptox.zaptoxpos.beans.User;
import zaptox.zaptoxpos.beans.UserType;

/**
 *
 * @author Dell
 */
public interface DbManagerInterface {

      public ArrayList<User> getAllUsers();
   public User getUser(int user_id);
   public int updateUser(User user);
   public int deleteUser(User user);
   public int insertUser(User user);
   public User userAuthentication(String username, String password);
   
   public ArrayList<UserType> getAllUsersType();
   public UserType getUserType(int user_type_id);
   public int updateUserType(UserType userType);
   public int deleteUserType(UserType userType);
   public int insertUserType(UserType userType);
   
   
   public ArrayList<Product> getAllProducts();
   public ArrayList<Product> getAllProductsSearch(String search);
   public Product getProduct(int product_id);
   public int updateProduct(Product product);
   public int deleteProduct(Product product);
   public int insertProduct(Product product);
   
   public ArrayList<Permission> getAllPermissions();
   public Permission getPermission(int permission_id);
   public int updatePermission(Permission permission);
   public int deletePermission(Permission permission);
   public int insertPermission(Permission permission);
   
   public ArrayList<SalesDetails> getAllSalesDetails();
   public SalesDetails getSalesDetails(int sales_details_id);
   public int updateSalesDetails(SalesDetails salesDetails );
   public int deleteSalesDetails(SalesDetails salesDetails);
   public int insertSalesDetails(SalesDetails salesDetails);
   
  
   public ArrayList<Sales> getAllSales();
   public Sales getSales(int sales_id);
   public int updateSales(Sales sales);
   public int deleteSales(Sales sales);
   public int insertSales(Sales sales);
   
   public ArrayList<Discount> getAllDiscounts();
   public Discount getDiscount(int discount_id);
   public int updateDiscount(Discount discount);
   public int deleteDiscount(Discount discount);
   public int insertDiscount(Discount discount);
   
   
   
 
   public ArrayList<Category> getAllCategory();
   public Category getCategory(int category_id);
   public int updateCategory(Category category);
   public int deleteCategory(Category category);
   public int insertCategory(Category category);
   
   
   public ArrayList<BorrowRecords> getAllBorrowRecords();
   public BorrowRecords getBorrowRecords(int borrow_id);
   public int updateBorrowRecords(BorrowRecords b);
   public int deleteBorrowRecords(BorrowRecords b);
   public int insertBorrowRecords(BorrowRecords b);
   
   public ArrayList<Branch> getAllBranch();
   public Branch getBranch(int branch_id);
   public int updateBranch(Branch b);
   public int deleteBranch(Branch b);
   public int insertBranch(Branch b);
   
   public ArrayList<ReturnProduct> getAllReturnProduct();
   public ReturnProduct getReturnProduct(int return_id);
   public int updateReturnProduct(ReturnProduct b);
   public int deleteReturnProduct(ReturnProduct b);
   public int insertReturnProduct(ReturnProduct b);
   
   

}

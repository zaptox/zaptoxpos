
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaptoxpos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import zaptox.zaptoxpos.db.DbConnection;
import zaptox.zaptoxpos.frames.LoginPage;

/**
 *
 * @author Vksoni
 */
public class ZaptoxPOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
                
    
        DbConnection.load();
         new LoginPage().setVisible(true);

      
    
    }
    
}

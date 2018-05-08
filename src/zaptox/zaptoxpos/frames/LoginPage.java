/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaptox.zaptoxpos.frames;

import com.sun.glass.events.KeyEvent;
import java.applet.AudioClip;
import java.awt.Color;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;
import zaptox.zaptoxpos.beans.User;
import zaptox.zaptoxpos.dao.DbManager;
import zaptox.zaptoxpos.dao.DbManagerInterface;
import zaptox.zaptoxpos.util.playAudio;
//import zaptox.zaptoxpos.util.AideoClips;

/**
 *
 * @author Vksoni
 */
public class LoginPage extends javax.swing.JFrame {

    DbManagerInterface dbManager;

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
        dbManager = new DbManager();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldUsername = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabelExit = new javax.swing.JLabel();
        jLabelHeaderRow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldUsername.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldUsername.setText("Enter Username");
        jTextFieldUsername.setBorder(null);
        jTextFieldUsername.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextFieldUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldUsernameMouseClicked(evt);
            }
        });
        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });
        jTextFieldUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldUsernameKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 260, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 260, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("USERNAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 260, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("PASSWORD");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        jPasswordFieldPassword.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordFieldPassword.setText("@Enter_Password");
        jPasswordFieldPassword.setBorder(null);
        jPasswordFieldPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordFieldPasswordMouseClicked(evt);
            }
        });
        jPasswordFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldPasswordActionPerformed(evt);
            }
        });
        jPasswordFieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldPasswordKeyPressed(evt);
            }
        });
        jPanel1.add(jPasswordFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 260, -1));

        jButtonLogin.setBackground(new java.awt.Color(0, 102, 255));
        jButtonLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin.setText("LOGIN");
        jButtonLogin.setBorder(null);
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 260, 30));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 580, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 140));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zaptox/zaptoxpos/images/logo.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 300, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 670, 230));

        jLabelMin.setBackground(new java.awt.Color(255, 0, 0));
        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMin.setText("-");
        jLabelMin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 50, 40));

        jLabelExit.setBackground(new java.awt.Color(0, 102, 255));
        jLabelExit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelExit.setForeground(new java.awt.Color(255, 255, 255));
        jLabelExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExit.setText("X");
        jLabelExit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabelExit.setOpaque(true);
        jLabelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelExitMouseExited(evt);
            }
        });
        getContentPane().add(jLabelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 50, 40));

        jLabelHeaderRow.setBackground(new java.awt.Color(0, 102, 255));
        jLabelHeaderRow.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelHeaderRow.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHeaderRow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHeaderRow.setText("Login");
        jLabelHeaderRow.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabelHeaderRow.setOpaque(true);
        getContentPane().add(jLabelHeaderRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUsernameMouseClicked
        if (this.jTextFieldUsername.getText().equalsIgnoreCase("Enter Username")) {
            this.jTextFieldUsername.setText("");
            this.jTextFieldUsername.setForeground(Color.black);

        }
    }//GEN-LAST:event_jTextFieldUsernameMouseClicked

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

    private void jTextFieldUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUsernameKeyPressed
        // TODO add your handling code here:
        if (this.jTextFieldUsername.getText().equalsIgnoreCase("Enter Username")) {
            this.jTextFieldUsername.setText("");
            this.jTextFieldUsername.setForeground(Color.black);
        }
        try{
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!(this.jTextFieldUsername.getText().equals("Enter Username")
                    || this.jPasswordFieldPassword.getText().equals("@Enter_Password") || this.jTextFieldUsername.getText().equals("")
                    || this.jPasswordFieldPassword.getText().equals(""))) {

                if (this.jTextFieldUsername.getText().matches("^([A-Za-z_][A-Za-z0-9_]*)$")) {
                    User user = dbManager.userAuthentication(this.jTextFieldUsername.getText(), this.jPasswordFieldPassword.getText());
                    if (user == null) {

                        //JOptionPane.showMessageDialog(this, "Invalid Password or usernames!");
                        JOptionPane.showMessageDialog(this, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
                        this.jTextFieldUsername.setText("Enter Username");
                        this.jPasswordFieldPassword.setText("@Enter_Password");
                    } else if ((user.getUser_name().equals(this.jTextFieldUsername.getText()))
                            && (user.getPasssword().equals(this.jPasswordFieldPassword.getText()))) {
                        this.jTextFieldUsername.setText("");
                        this.jPasswordFieldPassword.setText("@Enter_Password");

                        new DashBoardPage().setVisible(true);
                        new playAudio().playSuccessSound();
                        this.dispose();

                    }
                } else {
                     new playAudio().playErrorSound();
                    JOptionPane.showMessageDialog(this, "Invalid Username", "Error", JOptionPane.ERROR_MESSAGE);
                   

                }

//     
            } else {
                new playAudio().playErrorSound();
                JOptionPane.showMessageDialog(this, "Please type Username & Password", "Incorrect password or username", JOptionPane.ERROR_MESSAGE);

            }

        }

        }
        catch(Exception e){
        }
    }//GEN-LAST:event_jTextFieldUsernameKeyPressed

    private void jPasswordFieldPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordMouseClicked
        if (this.jPasswordFieldPassword.getText().equalsIgnoreCase("@Enter_Password")) {
            this.jPasswordFieldPassword.setText("");
            this.jPasswordFieldPassword.setForeground(Color.black);

        }


    }//GEN-LAST:event_jPasswordFieldPasswordMouseClicked

    private void jPasswordFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldPasswordActionPerformed

    private void jPasswordFieldPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordKeyPressed
        if (this.jPasswordFieldPassword.getText().equalsIgnoreCase("@Enter_Password")) {
            this.jPasswordFieldPassword.setText("");
            this.jPasswordFieldPassword.setForeground(Color.black);

        }
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                if (!(this.jTextFieldUsername.getText().equals("Enter Username")
                        || this.jPasswordFieldPassword.getText().equals("@Enter_Password") || this.jTextFieldUsername.getText().equals("")
                        || this.jPasswordFieldPassword.getText().equals(""))) {

                    if (this.jTextFieldUsername.getText().matches("^([A-Za-z_][A-Za-z0-9_]*)$")) {
                        User user = dbManager.userAuthentication(this.jTextFieldUsername.getText(), this.jPasswordFieldPassword.getText());
                        if (user == null) {
                             new playAudio().playErrorSound();
                            JOptionPane.showMessageDialog(this, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
                            this.jTextFieldUsername.setText("Enter Username");
                            this.jPasswordFieldPassword.setText("@Enter_Password");
                        }
                        if ((user.getUser_name().equals(this.jTextFieldUsername.getText()))
                                && (user.getPasssword().equals(this.jPasswordFieldPassword.getText()))) {
                            this.jTextFieldUsername.setText("");
                            this.jPasswordFieldPassword.setText("@Enter_Password");
                            new DashBoardPage().setVisible(true);
                            new playAudio().playSuccessSound();
                            this.dispose();
                        }
                    } else {
                        new playAudio().playErrorSound();
                        JOptionPane.showMessageDialog(this, "Invalid Username", "Error", JOptionPane.ERROR_MESSAGE);
                        

                    }

//     
                } else {
                    new playAudio().playErrorSound();
                    JOptionPane.showMessageDialog(this, "Please type Username & Password", "Error", JOptionPane.ERROR_MESSAGE);

                }

            }

        } catch (Exception e) {
            //JOptionPane.showMessageDialog(this, "Problem", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jPasswordFieldPasswordKeyPressed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed

        try {
            if (!(this.jTextFieldUsername.getText().equals("Enter Username")
                    || this.jPasswordFieldPassword.getText().equals("@Enter_Password") || this.jTextFieldUsername.getText().equals("")
                    || this.jPasswordFieldPassword.getText().equals(""))) {

                if (this.jTextFieldUsername.getText().matches("^([A-Za-z_][A-Za-z0-9_]*)$")) {
                    User user = dbManager.userAuthentication(this.jTextFieldUsername.getText(), this.jPasswordFieldPassword.getText());
                    if (user == null) {
                            new playAudio().playErrorSound();
                        JOptionPane.showMessageDialog(this, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);

                        this.jTextFieldUsername.setText("Enter Username");
                        this.jPasswordFieldPassword.setText("@Enter_Password");

                        //JOptionPane.showMessageDialog(this, "Done");
                    }
                    // JOptionPane.showMessageDialog(this, "Problem");

                    if ((user.getUser_name().equals(this.jTextFieldUsername.getText()))
                            && (user.getPasssword().equals(this.jPasswordFieldPassword.getText()))) {
                        this.jTextFieldUsername.setText("");
                        this.jPasswordFieldPassword.setText("@Enter_Password");
                        new playAudio().playSuccessSound();
                        new DashBoardPage().setVisible(true);

                        this.dispose();
                    }
                } else {
                    new playAudio().playErrorSound();
                    JOptionPane.showMessageDialog(this, "Invalid Username", "Error", JOptionPane.ERROR_MESSAGE);
                    

                }

//     
            } else {
                new playAudio().playErrorSound();
                JOptionPane.showMessageDialog(this, "Please type Username & Password", "Error", JOptionPane.ERROR_MESSAGE);

            }
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(this, "Problem", "Incorrect password or username", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelExitMouseClicked

    private void jLabelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseEntered
        // TODO add your handling code here:

        this.jLabelExit.setBackground(Color.red);
    }//GEN-LAST:event_jLabelExitMouseEntered

    private void jLabelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseExited
        // TODO add your handling code here:
        this.jLabelExit.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_jLabelExitMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }

            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelHeaderRow;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}

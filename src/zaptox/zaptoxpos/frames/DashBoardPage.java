/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaptox.zaptoxpos.frames;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Dell
 */
public class DashBoardPage extends javax.swing.JFrame {

    /**
     * Creates new form DashBoardPage
     */
    public DashBoardPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMin = new javax.swing.JLabel();
        jLabelExit = new javax.swing.JLabel();
        jLabelHeaderRow = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonViewUser = new javax.swing.JButton();
        jButtonViewUserType = new javax.swing.JButton();
        jButtonProducts = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(jLabelMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 0, 50, 40));

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
        getContentPane().add(jLabelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 0, 50, 40));

        jLabelHeaderRow.setBackground(new java.awt.Color(0, 102, 255));
        jLabelHeaderRow.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelHeaderRow.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHeaderRow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHeaderRow.setText("DashBoard");
        jLabelHeaderRow.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabelHeaderRow.setOpaque(true);
        getContentPane().add(jLabelHeaderRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zaptox/zaptoxpos/images/logo.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 300, 120));

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Category");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 220, 430, 120));

        jButtonViewUser.setBackground(new java.awt.Color(0, 102, 255));
        jButtonViewUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonViewUser.setForeground(new java.awt.Color(255, 255, 255));
        jButtonViewUser.setText("View User");
        jButtonViewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewUserActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonViewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 430, 120));

        jButtonViewUserType.setBackground(new java.awt.Color(0, 102, 255));
        jButtonViewUserType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonViewUserType.setForeground(new java.awt.Color(255, 255, 255));
        jButtonViewUserType.setText(" UserType");
        jButtonViewUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewUserTypeActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonViewUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 430, 120));

        jButtonProducts.setBackground(new java.awt.Color(0, 102, 255));
        jButtonProducts.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonProducts.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProducts.setText("Products");
        jButtonProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductsActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 430, 120));

        jButton5.setBackground(new java.awt.Color(0, 102, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("jButton1");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 430, 120));

        jButton6.setBackground(new java.awt.Color(0, 102, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("jButton1");
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 350, 430, 120));

        jButton7.setBackground(new java.awt.Color(0, 102, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("jButton1");
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 430, 120));

        jButton8.setBackground(new java.awt.Color(0, 102, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("jButton1");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 430, 120));

        jButton9.setBackground(new java.awt.Color(0, 102, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("jButton1");
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 480, 430, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1360, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButtonViewUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewUserTypeActionPerformed
        // TODO add your handling code here:
        new UserTypePage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonViewUserTypeActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButtonViewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewUserActionPerformed
        // TODO add your handling code here:
        new UserPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonViewUserActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        new CategoryPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButtonProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductsActionPerformed
        // TODO add your handling code here:
        new ProductsPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonProductsActionPerformed

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
            java.util.logging.Logger.getLogger(DashBoardPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoardPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoardPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoardPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoardPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonProducts;
    private javax.swing.JButton jButtonViewUser;
    private javax.swing.JButton jButtonViewUserType;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelHeaderRow;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

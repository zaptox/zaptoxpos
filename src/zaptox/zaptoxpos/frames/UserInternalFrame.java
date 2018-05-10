/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaptox.zaptoxpos.frames;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import zaptox.zaptoxpos.beans.User;
import zaptox.zaptoxpos.beans.UserType;
import zaptox.zaptoxpos.dao.DbManager;
import zaptox.zaptoxpos.dao.DbManagerInterface;

/**
 *
 * @author Vksoni
 */
public class UserInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form UserInternalFrame
     */
    DefaultTableModel tableModelUser;
    DefaultComboBoxModel comboBoxModelUserType;
    public ArrayList<UserType> user_types_list;
    public ArrayList<User> users_list;
    DbManagerInterface dbManager;

    public UserInternalFrame() {
        initComponents();
        JTableHeader header = this.jTableUser.getTableHeader();
        header.setBackground(new Color(0, 102, 255));
        header.setForeground(new Color(255, 255, 255));
        header.setFont(new Font("SansSerif", Font.BOLD, 16));

        dbManager = new DbManager();
        user_types_list = dbManager.getAllUsersType();
        tableModelUser = (DefaultTableModel) this.jTableUser.getModel();

        showInTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUser = new javax.swing.JTable();
        jButtonViewUser6 = new javax.swing.JButton();
        jButtonViewUser7 = new javax.swing.JButton();
        jButtonViewUser8 = new javax.swing.JButton();
        jButtonViewUser9 = new javax.swing.JButton();

        setClosable(true);

        jTableUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Type", "Username", "Name", "Contact#", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUser.setToolTipText("Products");
        jTableUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableUser.setGridColor(new java.awt.Color(0, 102, 255));
        jTableUser.setSelectionBackground(new java.awt.Color(0, 102, 255));
        jTableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUser);

        jButtonViewUser6.setBackground(new java.awt.Color(255, 255, 255));
        jButtonViewUser6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonViewUser6.setForeground(new java.awt.Color(0, 102, 255));
        jButtonViewUser6.setText("View User");
        jButtonViewUser6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewUser6ActionPerformed(evt);
            }
        });

        jButtonViewUser7.setBackground(new java.awt.Color(255, 255, 255));
        jButtonViewUser7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonViewUser7.setForeground(new java.awt.Color(0, 102, 255));
        jButtonViewUser7.setText("View User");
        jButtonViewUser7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewUser7ActionPerformed(evt);
            }
        });

        jButtonViewUser8.setBackground(new java.awt.Color(255, 255, 255));
        jButtonViewUser8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonViewUser8.setForeground(new java.awt.Color(0, 102, 255));
        jButtonViewUser8.setText("View User");
        jButtonViewUser8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewUser8ActionPerformed(evt);
            }
        });

        jButtonViewUser9.setBackground(new java.awt.Color(255, 255, 255));
        jButtonViewUser9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonViewUser9.setForeground(new java.awt.Color(0, 102, 255));
        jButtonViewUser9.setText("View User");
        jButtonViewUser9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewUser9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jButtonViewUser6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonViewUser8, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonViewUser9, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonViewUser7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonViewUser6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonViewUser7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonViewUser8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonViewUser9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUserMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTableUserMouseClicked

    private void jButtonViewUser6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewUser6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonViewUser6ActionPerformed

    private void jButtonViewUser7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewUser7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonViewUser7ActionPerformed

    private void jButtonViewUser8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewUser8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonViewUser8ActionPerformed

    private void jButtonViewUser9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewUser9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonViewUser9ActionPerformed

public void showInTable() {
        tableModelUser.setRowCount(0);

        users_list = dbManager.getAllUsers();
        for (User user : users_list) {
            Vector V = new Vector();
            V.add(dbManager.getUserType(user.getUser_type_id()).getUser_type());
            V.add(user.getUser_name());
            V.add(user.getName());
            V.add(user.getContact_number());
            V.add(user.getAddress());

            tableModelUser.addRow(V);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonViewUser6;
    private javax.swing.JButton jButtonViewUser7;
    private javax.swing.JButton jButtonViewUser8;
    private javax.swing.JButton jButtonViewUser9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUser;
    // End of variables declaration//GEN-END:variables
}

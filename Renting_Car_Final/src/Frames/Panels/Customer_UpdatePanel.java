/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames.Panels;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.text.DefaultEditorKit;
import project_pl1.Car;
import project_pl1.Customer;
import project_pl1.Ticket;

/**
 *
 * @author ali
 */
public class Customer_UpdatePanel extends javax.swing.JPanel {

    /**
     * Creates new form Customer_UpdatePanel
     */
    public Customer_UpdatePanel() {
        initComponents();
//        SelectingBrand(jComboBoxAvailabeCars);
        
    }
//
//    public void SelectingBrand(JComboBox x){
//        ArrayList<Car> Cars = new ArrayList<Car>();
//        Car C = new Car();
//        Cars = C.ListAllCars();
//        for(Car y : Cars){
//            if(y.getStatus().equals("Not Rented")){
//                x.addItem(y.Brands.BName);
//            }
//        }
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldName = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jLabelSucessOrFall = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jLabelUseAS = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jTextFieldAddress = new javax.swing.JTextField();
        jLabelGender = new javax.swing.JLabel();
        jLabelPhone = new javax.swing.JLabel();
        jButtonsearch = new javax.swing.JButton();
        jTextFieldPhone = new javax.swing.JTextField();
        jTextFieldSearch = new javax.swing.JTextField();
        jButtonDelete = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jComboBoxGender = new javax.swing.JComboBox();
        EmailjTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });

        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

        jLabelName.setText("Name");

        jLabelSucessOrFall.setText("    Search for Customer !!");

        jLabelID.setText("   ID");

        jLabelUseAS.setText("Email");

        jLabelAddress.setText("Address");

        jLabelGender.setText("Gender");

        jLabelPhone.setText("Phone");

        jButtonsearch.setText("Search");
        jButtonsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsearchActionPerformed(evt);
            }
        });

        jTextFieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchActionPerformed(evt);
            }
        });

        jButtonDelete.setBackground(new java.awt.Color(0, 88, 109));
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonUpdate.setBackground(new java.awt.Color(0, 88, 109));
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        jLabel1.setText("Enter ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelName)
                    .addComponent(jLabelSucessOrFall, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUseAS)
                    .addComponent(jLabelPhone)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelGender))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelAddress)
                                .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(246, 246, 246)
                                    .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(EmailjTextField)
                                        .addComponent(jTextFieldAddress)
                                        .addComponent(jComboBoxGender, 0, 340, Short.MAX_VALUE)
                                        .addComponent(jTextFieldPhone)
                                        .addComponent(jTextFieldID))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jButtonsearch)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonsearch)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelSucessOrFall, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGender)
                    .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPhone)
                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAddress)
                    .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUseAS)
                    .addComponent(EmailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete))
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jButtonsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsearchActionPerformed

        if (!jTextFieldSearch.getText().equals("")) {
            Customer x = new Customer();
//            Ticket t = new Ticket();
            Customer r = x.Search_Customer(Integer.parseInt(jTextFieldSearch.getText()));
//            Ticket i = t.SearchTicket();
            if (r.getId() > 0) {
                setPanelData(r);
            } else {
                jLabelSucessOrFall.setText("Not Found ...!");
            }
        } else {
            jLabelSucessOrFall.setText("Missing required Fields ... !  Please, Search By ID before submit ...!");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonsearchActionPerformed

    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        if(!jTextFieldSearch.getText().equals(""))
        {
            Customer x = new Customer();
            if(x.Delete_Customer(Integer.parseInt(jTextFieldSearch.getText())))
            {  jTextFieldSearch.setText("Deleted Successfully ... !");
                resetPanelData();
            }
            else{
                jTextFieldSearch.setText("Failed to delete ... !");
            }
        } else {
            jTextFieldSearch.setText("Missing required Fields ... !  Please, Search By ID before submit ...!");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        if(!jTextFieldID.getText().equals("")&& !jTextFieldName.getText().equals("")&& !jTextFieldPhone.getText().equals("")&& !jTextFieldAddress.getText().equals(""))
        {
            Customer x = new Customer();
            x.setId(Integer.parseInt(jTextFieldID.getText()));
            x.setName(jTextFieldName.getText());
            x.setPhone_No(jTextFieldPhone.getText());
            x.setAddress(jTextFieldAddress.getText());
//            x.y.setDate(jTextFieldBookDate.getText());
//            x.y.setRent_days((Integer.parseInt(jTextFieldNumberDays.getText())));
//            x.y.setSitting_Capacity((Integer.parseInt(jTextFieldCapacity.getText())));

            if(jComboBoxGender.getSelectedItem().equals("Male"))
            x.setGender("Male");
            else if (jComboBoxGender.getSelectedItem().equals("Female"))
            x.setGender("Female");


            if(x.Update_Customer(Integer.parseInt(jTextFieldID.getText()), x))
            {
                jLabelSucessOrFall.setText("Updated Successfully ... !");
                resetPanelData();
            }
            else {
                jLabelSucessOrFall.setText("Failed to Update ... !");
            }
        }else{
            jLabelSucessOrFall.setText("Missing required Fields ... !  Please, complete them before submit ...!");

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonUpdateActionPerformed
          protected void setPanelData(Customer c)
          {
              jTextFieldID.setText(""+c.getId());
              jTextFieldName.setText(""+c.getName());
              jTextFieldPhone.setText(""+c.getPhone_No());
              jTextFieldAddress.setText(""+c.getAddress());
//              jTextFieldNumberDays.setText(""+c);
//              jTextFieldBookDate.setText();
//              jTextFieldCapacity.setText();
//              jTextFieldTotal.setText();
//            
              jComboBoxGender.setSelectedIndex(0);
//              jComboBoxUsAs.setSelectedIndex(0);
//              jComboBoxBrand.setSelectedIndex(0);
//              jComboBoxAvailableCars.setSelectedIndex(0);
          }
          protected void resetPanelData()
          {
              jTextFieldID.setText("");
              jTextFieldName.setText("");
              jTextFieldPhone.setText("");
              jTextFieldAddress.setText("");
//              jTextFieldNumberDays.setText("");
//              jTextFieldBookDate.setText("");
//              jTextFieldCapacity.setText("");
//              jTextFieldTotal.setText("");
             
              jComboBoxGender.setSelectedIndex(0);
//              jComboBoxUsAs.setSelectedIndex(0);
//              jComboBoxBrand.setSelectedIndex(0);
//              jComboBoxAvailableCars.setSelectedIndex(0);
          }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailjTextField;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonsearch;
    private javax.swing.JComboBox jComboBoxGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPhone;
    private javax.swing.JLabel jLabelSucessOrFall;
    private javax.swing.JLabel jLabelUseAS;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}

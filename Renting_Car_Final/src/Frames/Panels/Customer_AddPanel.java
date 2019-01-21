/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames.Panels;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import project_pl1.Car;
import project_pl1.Customer;
import project_pl1.Ticket;

/**
 *
 * @author ali
 */
public class Customer_AddPanel extends javax.swing.JPanel {

    /**
     * Creates new form Customer_AddPanel
     */
    public Customer_AddPanel() {
        initComponents();
        SelectingBrand(jComboBoxBrand);
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//                int rownum =1;
//                jTable1.getSelectedRow();
//                
                
    }

    public void SelectingBrand(JComboBox x){
        ArrayList<Car> Cars = new ArrayList<Car>();
        Car C = new Car();
        Cars = C.ListAllCars();
        for(Car y : Cars){
            if(y.getStatus().equals("Not Rented")){
                x.addItem(y.Brands.BName);
            }
        }
    }
    public void SelectingCar(JComboBox x){
        ArrayList<Car> Cars = new ArrayList<Car>();
        Car C = new Car();
        Cars = C.ListAllCars();
        for(Car y : Cars){
            if(y.getStatus().equals("Not Rented")){
                x.addItem(y.getCarNo());
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jComboBoxGender = new javax.swing.JComboBox();
        jLabelGender = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jLabelPhone = new javax.swing.JLabel();
        jTextFieldAddress = new javax.swing.JTextField();
        jLabelAddress = new javax.swing.JLabel();
        jComboBoxBrand = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jLabelCompanyBrand = new javax.swing.JLabel();
        jLabelSucessOrFall = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldCapacity = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        EmailTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ViewButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AVCarTable = new javax.swing.JTable();
        AVCarTextField = new javax.swing.JTextField();
        AVCarLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 0));
        setAutoscrolls(true);

        jLabelName.setForeground(new java.awt.Color(0, 0, 0));
        jLabelName.setText("Name");

        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });

        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        jLabelGender.setForeground(new java.awt.Color(0, 0, 0));
        jLabelGender.setText("Gender");

        jLabelPhone.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPhone.setText("Phone");

        jLabelAddress.setForeground(new java.awt.Color(0, 0, 0));
        jLabelAddress.setText("Address");

        jComboBoxBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBrandActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText(" Enter your car No");

        jLabelID.setForeground(new java.awt.Color(0, 0, 0));
        jLabelID.setText("   ID");

        jLabelCompanyBrand.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCompanyBrand.setText("Select brand Name");

        jLabelSucessOrFall.setText("     Add new Customer !!");

        jButtonAdd.setText("Add Customer");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jTextFieldCapacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCapacityActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Sitting capacity");

        EmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Email");

        ViewButton.setText("View");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("select Brand Name And car capacity");

        AVCarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand Name", "Car No"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(AVCarTable);

        AVCarTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AVCarTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Car No");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAddress)
                            .addComponent(jLabelID)
                            .addComponent(jLabelName)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelPhone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelGender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCompanyBrand)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AVCarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSucessOrFall)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AVCarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))))
                .addGap(459, 459, 459))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabelSucessOrFall, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelGender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPhone))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAddress))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AVCarLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(142, 142, 142))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelCompanyBrand)
                                    .addComponent(jComboBoxBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(AVCarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(29, 29, 29)))
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGap(307, 307, 307))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jComboBoxBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxBrandActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        if(!EmailTextField.getText().equals("")&&!jTextFieldID.getText().equals("")&& !jTextFieldName.getText().equals("")&& !jTextFieldPhone.getText().equals("")&& !jTextFieldAddress.getText().equals("")&& !jTextFieldCapacity.getText().equals(""))
        {
            Customer x = new Customer();
            Ticket k = new Ticket();
            x.setEmail(EmailTextField.getText());
            x.setId(Integer.parseInt(jTextFieldID.getText()));
            x.setName(jTextFieldName.getText());
            x.setPhone_No(jTextFieldPhone.getText());
            x.setAddress(jTextFieldAddress.getText());
//            x.setDate_Of_Birth(jTextFieldBookDate.getText());
//            k.setRent_days((Integer.parseInt(jTextFieldNumberDays.getText())));
//            k.setSitting_Capacity((Integer.parseInt(jTextFieldCapacity.getText())));

            if(x.Add_Customer())
            {  jLabelSucessOrFall.setText("Added Sucessfully ..");
                resetPanelData();
            }
            else
            {
                jLabelSucessOrFall.setText("Failed to Insert ..");
            }
        }  else {
            jLabelSucessOrFall.setText("Missing required Fields ... !  Please, complete them before submit ...!");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextFieldActionPerformed
        
    }//GEN-LAST:event_EmailTextFieldActionPerformed

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
            if(!jTextFieldCapacity.getText().equals("")){
                Car x = new Car();
                DefaultTableModel model = (DefaultTableModel) AVCarTable.getModel();
                Object []Row = new Object[10];
                ArrayList<Car> Cars = new ArrayList <Car>();
                Cars = x.ListAllCars();
                for(Car y : Cars){
                    if(y.Brands.getBName().equals(jComboBoxBrand.getSelectedItem())&&y.getcapacity()==Integer.parseInt( jTextFieldCapacity.getText())&&y.getStatus().equals("Not Rented")){
                        Row[0]= y.Brands.getBName();
                        Row[1]= y.getCarNo();
//                        y.setStatus("Rented");
                        model.addRow(Row);
                    }
                }
                  AVCarLabel.setText("Done .........");      
            }else{
                
               AVCarLabel.setText("Please Fill the Empty Fields ...!!!");
            }
    }//GEN-LAST:event_ViewButtonActionPerformed

    private void jTextFieldCapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCapacityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCapacityActionPerformed

    private void AVCarTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AVCarTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AVCarTextFieldActionPerformed

          protected void resetPanelData()
          {
              jTextFieldID.setText("");
              EmailTextField.setText("");
              jTextFieldName.setText("");
              jTextFieldPhone.setText("");
              jTextFieldAddress.setText("");
//              jTextFieldNumberDays.setText("");
//              jTextFieldBookDate.setText("");
              jTextFieldCapacity.setText("");
//              jTextFieldTotal.setText("");
             
              jComboBoxGender.setSelectedIndex(0);
//              jComboBoxUsAs.setSelectedIndex(0);
              jComboBoxBrand.setSelectedIndex(0);
             
          }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AVCarLabel;
    private javax.swing.JTable AVCarTable;
    private javax.swing.JTextField AVCarTextField;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JButton ViewButton;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JComboBox jComboBoxBrand;
    private javax.swing.JComboBox jComboBoxGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelCompanyBrand;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPhone;
    private javax.swing.JLabel jLabelSucessOrFall;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldCapacity;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhone;
    // End of variables declaration//GEN-END:variables
}

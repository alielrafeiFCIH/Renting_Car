/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames.Panels;
import com.sun.javafx.iio.ios.IosImageLoader;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import project_pl1.Driver;
import project_pl1.Driver;

/**
 *
 * @author Ahmed
 */
public class Driver_UpdatePanel extends javax.swing.JPanel {

    /**
     * Creates new form Driver_UpdatePanel
     */
    public Driver_UpdatePanel() {
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

        jLabel8 = new javax.swing.JLabel();
        jTextFieldphone = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldid = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSearchKey = new javax.swing.JTextField();
        jTextFieldname = new javax.swing.JTextField();
        jLabelSucessOrFail = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldaddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxgender = new javax.swing.JComboBox<>();
        jTextFieldimage = new javax.swing.JTextField();
        jTextFieldexperience = new javax.swing.JTextField();
        jTextFielddatebirth = new javax.swing.JTextField();
        imageLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("phone Number");

        jTextFieldphone.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldphone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jTextFieldid.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        jTextFieldSearchKey.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldSearchKey.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldname.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelSucessOrFail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSucessOrFail.setText("Write Driver ID to get all info ... !       before Update or Delete ... !");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Address");

        jTextFieldaddress.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldaddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Date Of Birth");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Experience");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Image");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Gender");

        jComboBoxgender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jTextFieldimage.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldimage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldexperience.setBackground(new java.awt.Color(255, 255, 255));

        jTextFielddatebirth.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSucessOrFail, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(124, 124, 124)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextFieldSearchKey)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 573, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(101, 101, 101))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(34, 34, 34)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextFieldphone, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBoxgender, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextFieldexperience)
                                            .addComponent(jTextFielddatebirth, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)))
                                    .addComponent(jTextFieldaddress)
                                    .addComponent(jTextFieldname)
                                    .addComponent(jTextFieldid))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(imageLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(74, 74, 74)
                .addComponent(jTextFieldimage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(jTextFieldSearchKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSucessOrFail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(imageLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFielddatebirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldexperience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldimage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(87, 87, 87)
                .addComponent(jLabel7)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
 if (!jTextFieldid.getText().equals("") && !jTextFieldname.getText().equals("") && !jTextFieldaddress.getText().equals("") && !jTextFieldphone.getText().equals("")&& !jTextFielddatebirth.getText().equals("")&& !jTextFieldimage.getText().equals("")&& !jTextFieldexperience.getText().equals("")) {

            Driver x = new Driver();
            x.setName(jTextFieldname.getText());
            x.setId(Integer.parseInt(jTextFieldid.getText()));
            x.setAddress(jTextFieldaddress.getText());
            x.setPhone_No(jTextFieldphone.getText());
            x.setDate_Of_Birth(jTextFielddatebirth.getText());
            x.setExperiene(jTextFieldexperience.getText());
//            x.setSitting_Capcitiy(jTextFieldcapacity.getText());
            x.setPhoto(jTextFieldimage.getText());
            
            if (jComboBoxgender.getSelectedItem().equals("Male")) {
                x.setGender("Male");
            } else if (jComboBoxgender.getSelectedItem().equals("Female")) {
                x.setGender("Female");
            }

            if (x.Update_Driver(Integer.parseInt(jTextFieldSearchKey.getText()), x)) {
                jLabelSucessOrFail.setText("Updated Successfully ... !");
                resetPanelData();
            } else {
                jLabelSucessOrFail.setText("Failed to Update ... !");
            }
        } else {
            jLabelSucessOrFail.setText("Missing required Fields ... !  Please, complete them before submit ...!");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (!jTextFieldSearchKey.getText().equals("")) {
            Driver x = new Driver();
            Driver returned=x.Search_Driver(Integer.parseInt(jTextFieldSearchKey.getText()));
            if (returned.getId()>0) {
                returned.Delete_Driver(Integer.parseInt(jTextFieldSearchKey.getText()));
                jLabelSucessOrFail.setText("Deleted Successfully ... !");
                resetPanelData();
            } else {
                jLabelSucessOrFail.setText("Failed to delete ... !");
            }
        } else {
            jLabelSucessOrFail.setText("Missing required Fields ... !  Please, Search By ID before submit ...!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if (!jTextFieldSearchKey.getText().equals("")) {
            Driver x = new Driver();
            Driver returned = x.Search_Driver(Integer.parseInt(jTextFieldSearchKey.getText()));
            if (returned.getId()> 0) {
                setPanelData(returned);
            } else {
                jLabelSucessOrFail.setText("Not Found ...!");
            }
        } else {
            jLabelSucessOrFail.setText("Missing required Fields ... !  Please, Search By ID before submit ...!");
        }
    }//GEN-LAST:event_btnSearchActionPerformed
 protected void resetPanelData(){
        jTextFieldaddress.setText("");
//        jTextFieldcapacity.setText("");
        jTextFieldname.setText("");
        jTextFieldid.setText("");
        jTextFieldphone.setText("");
        jTextFieldexperience.setText("");
        jTextFieldimage.setText("");
//        jTextFieldcapacity.setText("");
        jComboBoxgender.setSelectedIndex(0);
//        jComboBoxcompanybrand.setSelectedIndex(0);
        jTextFielddatebirth.setText("");
        
    }
 protected void setPanelData(Driver x){
//        jTextFieldcapacity.setText(""+x.getSitting_Capcitiy());
        jTextFieldaddress.setText(""+x.getAddress());
        jTextFieldname.setText(""+x.getName());
        jTextFieldid.setText(""+x.getId());
        jTextFieldimage.setText(""+x.getPhoto());
        jTextFielddatebirth.setText(""+x.getDate_Of_Birth());
        jTextFieldphone.setText(""+x.getPhone_No());
        jTextFieldexperience.setText(""+x.getExperience());
        
        if(x.getGender().equals("Male")){
            jComboBoxgender.setSelectedItem("Male");
        }
        else if(x.getGender().equals("Female")){
            jComboBoxgender.setSelectedItem("Female");
        }
        try{
            ImageIcon i = new ImageIcon(ImageIO.read(new File(x.getPhoto())));
            imageLabel12.setIcon(i);
        }catch(IOException e){
            System.out.println(e);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel imageLabel12;
    private javax.swing.JComboBox<String> jComboBoxgender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelSucessOrFail;
    private javax.swing.JTextField jTextFieldSearchKey;
    private javax.swing.JTextField jTextFieldaddress;
    private javax.swing.JTextField jTextFielddatebirth;
    private javax.swing.JTextField jTextFieldexperience;
    private javax.swing.JTextField jTextFieldid;
    private javax.swing.JTextField jTextFieldimage;
    private javax.swing.JTextField jTextFieldname;
    private javax.swing.JTextField jTextFieldphone;
    // End of variables declaration//GEN-END:variables
}

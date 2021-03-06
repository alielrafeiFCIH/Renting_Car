/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames.Panels;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import project_pl1.Brand;
import project_pl1.Car;


/**
 *
 * @author win8
 */
public class List_CarPanel extends javax.swing.JPanel {

    /**
     * Creates new form List_CarPanel
     */
    public List_CarPanel() {
        initComponents();
        AddRowstoTable();
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
        CarsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldcompanybrand = new javax.swing.JTextField();
        jComboBoxuseas = new javax.swing.JComboBox<>();
        jComboBoxstatus = new javax.swing.JComboBox<>();
        jButtonview = new javax.swing.JButton();
        FoundLabel = new javax.swing.JLabel();

        CarsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car Number", "Variant", "Make Year", "Sitting Capacity", "Engine Capacity", "Type", "Rent Value", "Car No"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(CarsTable);

        jLabel1.setText(" Brand Name");

        jLabel2.setText(" Use AS");

        jLabel3.setText("Status");

        jTextFieldcompanybrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcompanybrandActionPerformed(evt);
            }
        });

        jComboBoxuseas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Taxi", "Individual" }));

        jComboBoxstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rented", "Not Rented" }));
        jComboBoxstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxstatusActionPerformed(evt);
            }
        });

        jButtonview.setText("View");
        jButtonview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonviewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxuseas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxstatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(114, 114, 114)
                                        .addComponent(jTextFieldcompanybrand, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(32, 32, 32)
                        .addComponent(FoundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 52, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jButtonview, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldcompanybrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBoxuseas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(FoundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonview)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonviewActionPerformed
        
        if(!jTextFieldcompanybrand.getText().equals("")){
            AddRowstoTable();
            
        }else{
     FoundLabel.setText("please Fill the Empty Fields ..!!");         
   
        }
    }//GEN-LAST:event_jButtonviewActionPerformed

    private void jTextFieldcompanybrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldcompanybrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldcompanybrandActionPerformed

    private void jComboBoxstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxstatusActionPerformed
 public void AddRowstoTable(){  
      DefaultTableModel model = (DefaultTableModel) CarsTable.getModel();
    int cont =  model.getRowCount();
    while(cont!=0){
         model.removeRow(0);
         --cont;
    }
   
     Object []Row = new Object[8];
     Car c = new Car();
//     Brand b = new Brand();
     ArrayList<Car> Cars = new ArrayList<Car>();
//     ArrayList<Car> v = new ArrayList<Car>();
     Cars = c.ListAllCars();
     for(Car x : Cars){
        if(x.getBrands().getBName().equals(jTextFieldcompanybrand.getText())){
            if(x.getUseAs().equals(jComboBoxuseas.getSelectedItem())&&x.getStatus().equals(jComboBoxstatus.getSelectedItem())){
                  Row[0]=x.getCarNo();
         Row[1]=x.getvariant();
         Row[2]=x.getMakeYear();
         Row[3]=x.getcapacity();
         Row[4]=x.getEngineCapacity();
         Row[5]=x.getType();
         Row[6]=x.getRent_Value();
         Row[7]=x.getCarNo();
         model.addRow(Row);
         FoundLabel.setText("Found .....");
         
            }
        }else{
            FoundLabel.setText("Not Found .....");
        }
       
     
     
     }
          
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CarsTable;
    private javax.swing.JLabel FoundLabel;
    private javax.swing.JButton jButtonview;
    private javax.swing.JComboBox<String> jComboBoxstatus;
    private javax.swing.JComboBox<String> jComboBoxuseas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldcompanybrand;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Frames.Panels.ComposeMail;
import Frames.Panels.SentMail;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

/**
 *
 * @author ali
 */
public class Email extends javax.swing.JInternalFrame {

    /**
     * Creates new form Email
     */
    SentMail p1;
    ComposeMail p2;
    GridBagLayout Bag = new GridBagLayout();
    public Email() {
        initComponents();
        p1 = new SentMail();
        p2 = new ComposeMail();
        DynamicPanel.setLayout(Bag);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(p1,c);
        DynamicPanel.add(p2,c);
        p2.setVisible(true);
        p1.setVisible(false);
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
        ComposeButton = new javax.swing.JButton();
        SentMailButton = new javax.swing.JButton();
        DynamicPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Email");
        setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(0, 88, 109));

        ComposeButton.setBackground(new java.awt.Color(255, 255, 255));
        ComposeButton.setText("Compose");
        ComposeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComposeButtonActionPerformed(evt);
            }
        });

        SentMailButton.setBackground(new java.awt.Color(255, 255, 255));
        SentMailButton.setText("Sent Mail");
        SentMailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SentMailButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SentMailButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ComposeButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(ComposeButton)
                .addGap(83, 83, 83)
                .addComponent(SentMailButton)
                .addContainerGap(260, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        DynamicPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout DynamicPanelLayout = new javax.swing.GroupLayout(DynamicPanel);
        DynamicPanel.setLayout(DynamicPanelLayout);
        DynamicPanelLayout.setHorizontalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 931, Short.MAX_VALUE)
        );
        DynamicPanelLayout.setVerticalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        getContentPane().add(DynamicPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComposeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComposeButtonActionPerformed
         p2.setVisible(true);
        p1.setVisible(false);
    }//GEN-LAST:event_ComposeButtonActionPerformed

    private void SentMailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SentMailButtonActionPerformed
         p1.setVisible(true);
        p2.setVisible(false);
    }//GEN-LAST:event_SentMailButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ComposeButton;
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JButton SentMailButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

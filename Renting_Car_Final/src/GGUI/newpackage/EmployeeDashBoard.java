/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GGUI.newpackage;

import Frames.DriverJInternalFrame;
import Frames.TicketFrame;
import Frames.EmpolyeeCustomerFrame;
import Frames.ViewCar;
import java.util.ArrayList;
import org.jfree.ui.RefineryUtilities;
import project_pl1.Barchart;
import project_pl1.Car;


/**
 *
 * @author win8
 */
public class EmployeeDashBoard extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeDashBoard
     */
    public EmployeeDashBoard() {
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

        jSlider1 = new javax.swing.JSlider();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        Desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CarsMenuItem = new javax.swing.JMenuItem();
        StatusjMenuItem = new javax.swing.JMenuItem();
        UseAsjMenuItem = new javax.swing.JMenuItem();
        ExitMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        CustomerMenuItem = new javax.swing.JMenuItem();
        DriverMenuItem = new javax.swing.JMenuItem();
        TicketMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Dash Board");

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 746, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(Desktop, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jMenu1.setText("File");

        CarsMenuItem.setText("ViewCar");
        CarsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarsMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(CarsMenuItem);

        StatusjMenuItem.setText("Report Status");
        StatusjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusjMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(StatusjMenuItem);

        UseAsjMenuItem.setText("Report UseAs");
        UseAsjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UseAsjMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(UseAsjMenuItem);

        ExitMenuItem.setText("SignOut");
        ExitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(ExitMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Users");

        CustomerMenuItem.setText("Customer");
        CustomerMenuItem.setAutoscrolls(true);
        CustomerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(CustomerMenuItem);

        DriverMenuItem.setText("Driver");
        DriverMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DriverMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(DriverMenuItem);

        TicketMenuItem.setText("Ticket");
        TicketMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TicketMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(TicketMenuItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CustomerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerMenuItemActionPerformed
      EmpolyeeCustomerFrame x = new EmpolyeeCustomerFrame();
      Desktop.add(x);
      x.setVisible(true);
    }//GEN-LAST:event_CustomerMenuItemActionPerformed

    private void DriverMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DriverMenuItemActionPerformed
      DriverJInternalFrame d = new DriverJInternalFrame();
      Desktop.add(d);
      d.setVisible(true);
    }//GEN-LAST:event_DriverMenuItemActionPerformed

    private void TicketMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TicketMenuItemActionPerformed
        TicketFrame t = new TicketFrame();
        Desktop.add(t);
        t.setVisible(true);
       
    }//GEN-LAST:event_TicketMenuItemActionPerformed

    private void ExitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitMenuItemActionPerformed
           Login l = new Login();
       l.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_ExitMenuItemActionPerformed

    private void CarsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarsMenuItemActionPerformed
       ViewCar x = new ViewCar();
       Desktop.add(x);
       x.setVisible(true);
    }//GEN-LAST:event_CarsMenuItemActionPerformed

    private void StatusjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusjMenuItemActionPerformed
                  Car c=new Car();
        ArrayList<Car> cars= c.ListAllCars();
        String [] Names = new String[cars.size()];
        int [] Status = new int[cars.size()];
        for(int i=0;i<cars.size();i++)
        {
            if (cars.get(i).getStatus().equals("Rented")) {
                Status[i]=2;
            }
            else
            {
                Status [i]=1;
            }
            Names[i]=cars.get(i).getBrands().getBName()+""+cars.get(i).getCarNo();
        }
        String Explain="Car Use\n 1 is Not Rented use\n2 is Rented";
        String Explain_2="Status Of Car";
        Barchart chart = new Barchart("Car Status Report", Names, Status,Explain,Explain_2);

        chart.pack();
        RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_StatusjMenuItemActionPerformed

    private void UseAsjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UseAsjMenuItemActionPerformed
 Car c=new Car();
        ArrayList<Car> cars= c.ListAllCars();
        String [] Names = new String[cars.size()];
        int [] Use = new int[cars.size()];
        for(int i=0;i<cars.size();i++)
        {
            if (cars.get(i).getUseAs().equals("Taxi")) {
                Use[i]=2;
            }
            else
            {
                Use [i]=1;
            }
            Names[i]=cars.get(i).getBrands().getBName()+""+cars.get(i).getCarNo();
        }
        String Explain="Car Use\n 1 is Individual use\n2 is Taxi";
        String Explain_2="Use Of Car";
        Barchart chart = new Barchart(" Car Use Report ", Names, Use,Explain,Explain_2);

        chart.pack();
        RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);
        
        
        
                // TODO add your handling code here:
    }//GEN-LAST:event_UseAsjMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeDashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CarsMenuItem;
    private javax.swing.JMenuItem CustomerMenuItem;
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem DriverMenuItem;
    private javax.swing.JMenuItem ExitMenuItem;
    private javax.swing.JMenuItem StatusjMenuItem;
    private javax.swing.JMenuItem TicketMenuItem;
    private javax.swing.JMenuItem UseAsjMenuItem;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}

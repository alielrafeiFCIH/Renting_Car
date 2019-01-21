/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_pl1;

import GGUI.newpackage.Login;
import java.io.*;
import java.util.*;
import javax.swing.text.DefaultEditorKit;

        
public class Project_pl1 {

    
    public static void main(String[] args){
        String ProjectPath = System.getProperty("user.dir");
        System.out.println("Project Path: " + ProjectPath+"\n");
        File currentDir = new File(ProjectPath);
        checkdirectorycontents(currentDir);
        new Login().setVisible(true);
    }
    public static void checkdirectorycontents(File dir){
        File []files = dir.listFiles();
        boolean EmployeeFile = true;
        boolean CustomerFile = true ;
        boolean DriverFile = true ;
        boolean EmailFile = true;
        boolean CarFile = true;
        boolean Ticket = true;
        boolean BrandsFile = true ;
        boolean Report = true;
        
        for(File file : files){
            if(file.getName().contains("Employee.bin")){
                EmployeeFile = false;
            }else if(file.getName().contains("Cars.bin")){
                     CarFile = false;
            }else if(file.getName().contains("Email.bin")){
                EmailFile = false;
            }else if(file.getName().contains("Driver.bin")){
                DriverFile = false;
            }else if(file.getName().contains("Customers.bin")){
                CustomerFile = false ;
            }else if(file.getName().contains("Ticket.bin")){
                Ticket = false;
            }else if(file.getName().contains("Brands.bin")){
                BrandsFile = false;
            }else if(file.getName().contains("Report.bin")){
                Report = false;
            }
        }
        if(EmployeeFile){
              System.out.println("Employee\n");
            Employee emp = new Employee();
            emp.commit_to_File();
        }
        if(Report){
              Report r = new Report();
              r.CommitToFile();
        }
        if(CarFile){
            Car c = new Car();
            c.commit_to_file();
        }
        if(Ticket){
            Ticket t = new Ticket();
            t.CommitToFile();
        }
        if(EmailFile){
            Email e = new Email();
            e.commitToFile();
        }
        if(CustomerFile){
            Customer c = new Customer();
            c.commitToFile();
        }
        if(DriverFile){
         Driver d = new Driver();
         d.CommiteToFile();
        }
        if(BrandsFile){
            Brand b = new Brand();
            b.commitToFile();
        }
    }
}

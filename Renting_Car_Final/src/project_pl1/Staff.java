/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_pl1;

/**
 *
 * @author win8
 */
import java.io.*;
import java.util.*;

public abstract class  Staff extends Person implements Serializable,ILogin {
    public String Username;
    public String Password;
    public Staff(){
        
    }
    public Staff(String Username,String Password,String name,int id,String address,String Date_Of_Birth,String Phone_No,String Gender){
        super(name,id,address,Date_Of_Birth,Phone_No,Gender);
        this.Username=Username;
        this.Password=Password;
    }
    
    public String getUsername() {
        return this.Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
//    public void ViewAllDriver(){
//        Driver x=new Driver();
//        System.out.println(x.DisplayAllDrivers());
//    }
//    public void ViewAllCar(){
//        Car x=new Car();
//        System.out.println(x.DisplayAllCars());
//    }
    
}
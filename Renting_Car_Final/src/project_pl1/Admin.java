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
import java.util.*;
import java.io.*;

public class Admin extends Staff {
    
    public Admin(){
        
    }
    public Admin(String Username,String Password,String name,int id,String address,String Date_Of_Birth,String Phone_No,String Gender){
        super(Username,Password,name,id,address,Date_Of_Birth,Phone_No,Gender);
    }
    public void Add_New_Employee(String Date_of_join,String qualifications,String name, int id, String address, String Date_Of_Birth, String Phone_No, String Gender,String Username,String Password  ){
        Employee x=new Employee(Date_of_join, qualifications, name,  id,  address,  Date_Of_Birth,  Phone_No,  Gender, Username, Password );
        if(x.Add_New_Employee()){
            System.out.println(x.to_string()+"add successfully");
        }
        else{
            System.out.println("faild");
        }      
    }
    public void List_All_Employee(){
        Employee x=new Employee();
        System.out.println(x.DisplayAllEmployee());
    }
    public void Search_New_Employee(String Username){
        Employee x=new Employee();
        System.out.println(x.Search_For_Employee(Username));
    }
    public void Delete_Old_Employee(int id){
        Employee x=new Employee();
        x.Delete_Employee(id);
        System.out.println("Delete Successfully....");       
    }
    public void Update_For_Employee(int id,Employee data){
        Employee x=new Employee();
        x.Update_Employee(id,data);
        System.out.println("Update Successfully....");
    }
    public void Add_New_Company(String BName){
        Brand x=new Brand();
        if(x.AddBrand()){
            System.out.println("Add Successfully....");
        }
        else{
            System.out.println("Faild....");
        }
    }
//    public void Add_New_Car(int Renting_price,int capacity,String VechileModel,int CarNO,String variant,String EngineCapacity,int Car_Price,String MakeYear,String Type,String Status){
//        Car x=new Car( Renting_price,capacity, VechileModel, CarNO, variant, EngineCapacity,Car_Price,MakeYear,Type,Status);
//        if(x.Add_Car()){
//            System.out.println(x.toString()+"Add Successfully....");
//        }
//        else{
//            System.out.println("Faild....");
//        }
//    }
    public void Delete_Old_Car(int CarNo){
        Car x=new Car();
        x.Delete_Car(CarNo);
        System.out.println("Delete Successfully.....");
    }
    public void Update_For_Car(int  Car_No,Car c){
        Car x=new Car();
        x.Update_Car(Car_No,c);
        System.out.println("Update Successfully....");
    }
    public void Search_For_Car(int CarNo){
        Car x = new Car();
        System.out.println(x.Search_Car(CarNo));
    }
    
    public void View_All_Report(){
        Report x=new Report();
        System.out.println(x.DisplayAllReports());
    }
    
    @Override
      public boolean Login(String Username, String Password) {

        if (Username.equals("Rana@gmail.com") && Password.equals("01122703333")) {
            return true;
        }
        return false;

    }
  
    
}




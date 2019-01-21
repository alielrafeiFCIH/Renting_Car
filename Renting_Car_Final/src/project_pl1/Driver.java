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

public class Driver extends Person implements Serializable{
    public String experience;
    public String photo;
    public String Select_Company; // dool hyd5olo azai
    public String Sitting_Capcitiy; //hyd5ol azai
    private final String DriverFileName = "Driver.bin";
    public static ArrayList<Driver> Drivers = new ArrayList<Driver>(); 
    public Driver(){
        
    }
    public Driver(String experience,String photo,String name, int id, String address, String Date_Of_Birth, String Phone_No, String Gender){
        super(name,id,address,Date_Of_Birth,Phone_No,Gender);
        this.experience=experience;
        this.photo=photo;
 
    }

    public String getSitting_Capcitiy() {
        return this.Sitting_Capcitiy;
    }

    public void setSitting_Capcitiy(String Sitting_Capcitiy) {
        this.Sitting_Capcitiy = Sitting_Capcitiy;
    }

    public String getSelect_Company() {
        return this.Select_Company;
    }

    public void setSelect_Company(String Select_Company) {
        this.Select_Company = Select_Company;
    }
    public void setExperiene(String experience){
        this.experience=experience;
    }
    public void setPhoto(String photo){
        this.photo=photo;
    }
    public String getExperience(){
        return this.experience;
    }
    public String getPhoto(){
        return this.photo;
    }
    public void LoadFromFile(){
        Drivers = (ArrayList<Driver>) (Object) FManger.read(DriverFileName);
    }
//        Drivers = (ArrayList<Driver>) (Object) FManger.read(DriverFileName);

//    private String GetDriverData(){
//        return this.experience + "@" +  this.photo+ "@"+this.Date_Of_Birth +"@"+this.Gender+"@"+this.address+"@"+this.name+"@"+this.id+"@"+this.Phone_No+"@" ;
//    }
    public boolean CommiteToFile(){
        return FManger.write(DriverFileName, Drivers);
    }
//    public boolean CommitToFile(){
//       return FManger.write(DriverFileName,Drivers);
//    
//    }
    
    private int GetIndex(int id){
        for(int i=0;i<Drivers.size();i++)
            if(Drivers.get(i).getId()==id){
                return i;
            }
        
                return -1;
            
    }
    public boolean Add_Driver(){
        LoadFromFile();
        Drivers.add(this);
        return CommiteToFile();
       }

    public boolean Update_Driver(int id,Driver x){
       LoadFromFile();
      int index = GetIndex(id);
      if(index!=-1){
          Drivers.set(index,x);
        return CommiteToFile();
      }else{
        
        return false;
      }
       
   }
    public Driver Search_Driver(int id)
        {
            Driver temp = new Driver();
          LoadFromFile();
          int index = GetIndex(id);
          if (index != -1)
                return Drivers.get(index);
          else
                return temp;
        }
    public void Delete_Driver(int id){
        LoadFromFile();
        int index=GetIndex(id);
        if(index!=-1){
            Drivers.remove(index);
            CommiteToFile();
        }
    }
   // Override
    public String to_string(){
        return "mu name id"+ this.name+"\n"+"id:"+this.id+"\n"+"address:"+this.address+"Date_of_birth:"+this.Date_Of_Birth+"\n"+"phone:"
                +this.Phone_No+"\n"+"gender:"+this.Gender+"\n";
    }
   public ArrayList<Driver> ListAllDriver(){
                LoadFromFile();
                return Drivers;
        }
        
}

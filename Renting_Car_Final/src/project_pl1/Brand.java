/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_pl1;

import java.io.Serializable;
import java.io.*;
import java.util.*;


/**
 *
 * @author Ahmed
 */

     public class Brand implements Serializable {
      public String BName;
      protected int id;
      private final String BrandsFileName = "Brands.bin";
      FManagerBinary FManger = new FManagerBinary();
      public static ArrayList<Brand> Brands = new ArrayList <Brand>();

           public Brand(String BName,int id) {
                this.BName = BName;
                this.id = id;
           }
     public Brand() {
                
            }  
      public void loadFromFile() {
        Brands = (ArrayList<Brand>) (Object) FManger.read(BrandsFileName);
       }
      public ArrayList<Brand> ListAllBrands(){
          loadFromFile();
          return Brands;
      }
    public String getBName() {
        return this.BName;
    }
    public int getId(){
        return this.id;
    }
    public void setBName(String BName) {
        this.BName = BName;
    }
    public void SetBrandID(int Id){
        this.id=Id;
    }
    public static ArrayList<Brand> getBrands() {
        return Brands;
    }

    public static void setBrands(ArrayList<Brand> Brands) {
        Brand.Brands = Brands;
    }
        public Brand Search_Brand(int id)
        {
            Brand temp = new Brand();
          loadFromFile();
          int index = getBrandIndex(id);
          if (index != -1)
                return Brands.get(index);
          else
                return temp;
        }    
               
      private String getBrandData() {
                return this.BName;
            }
        
        public boolean AddBrand(){
             loadFromFile();
             Brands.add(this);
             return commitToFile();
        }
       private int getBrandIndex(int id ){
           loadFromFile();
           int Size = Brands.size();
           for(int i=0;i<Size;i++){
               if(Brands.get(i).getId()==id){
                   return i;
               }
           }
           return -1;
       }
       public boolean DeleteBrand(int id){
         loadFromFile();
         int index = getBrandIndex(id);
        if (index != -1) {
            Brands.remove(index);
            return commitToFile();
        }
        return false;
        } 
        
      public boolean commitToFile() {
                return FManger.write(BrandsFileName, Brands);
               }
 
     }
        

    


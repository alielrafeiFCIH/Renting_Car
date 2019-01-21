
package project_pl1;

import java.util.*;
import java.io.Serializable;
import java.io.*;


public class Car implements Serializable {
    
      public  int capacity;
      public  String vechileModel;
      public  int CarNo;
      public int Car_Price;
      public  String variant;
      public  String EngineCapacity;
      public  Brand Brands;
      public String Type;
      public String MakeYear;
      public String Status ;
      public String UseAs;
      public int RentValue;
      private final String CarFileName = "Cars.bin";
      public static ArrayList<Car> Cars = new ArrayList <Car>();
      FManagerBinary FManger = new FManagerBinary(); 
       private int indext;
       public Car(){
           Brands= new Brand();
       }
       public Car(int capacity,String VechileModel,int CarNO,String variant,String EngineCapacity,int Car_Price,String MakeYear,String Type,String Status){
           this.CarNo=CarNO;
           this.capacity=capacity;
           this.variant=variant;
           this.vechileModel=VechileModel;
           this.EngineCapacity=EngineCapacity;
           this.Car_Price=Car_Price;
           this.MakeYear=MakeYear;
           this.Type=Type;
           this.Status=Status;
       }

    public String getStatus() {
        return this.Status;
    }
    public void  setRent_Value(int RentValue){
        this.RentValue=RentValue;
    }
    public int getRent_Value(){
        return this.RentValue;
    }
    public void setStatus(String Status) {
        this.Status = Status;
    }
       

    public String getType() {
        return this.Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
    
    public void setUseAs(String UseAs){
        this.UseAs=UseAs;
    }
       
    public String getUseAs(){
        return this.UseAs;
    }
    public String getMakeYear() {
        return this.MakeYear;
    }

    public void setMakeYear(String MakeYear) {
        this.MakeYear = MakeYear;
    }
       

       public int getCar_Price() {
        return this.Car_Price;
    }

    public void setCar_Price(int Car_Price) {
        this.Car_Price = Car_Price;
    }
    
        public void setcapacity(int capacity) {
        this.capacity = capacity ;
         }
        public void setvechileModel (String vechileModel ) {
        this.vechileModel = vechileModel ;
         }
        public void setCarNo (int CarNo) {
            this.CarNo = CarNo ;
         }
        public void setvariant(String variant ) {
        this.variant = variant;
         }
        public void setEngineCapacity (String EngineCapacity ) {
        this.EngineCapacity = EngineCapacity;
         }
        
        public int getcapacity() {
        return this.capacity;
        }
        
         public String getvechileModel() {
        return this.vechileModel;
        }
         
        public int getCarNo() {
        return this.CarNo;
        }

    public Brand getBrands() {
        return Brands;
    }
        
        
        public String getvariant() {
        return this.variant;
        }
        
        
        public String getEngineCapacity() {
        return this.EngineCapacity;
        }
   
        public boolean Add_Car(){
        
        LoadFromFile();
        Cars.add(this);
        return commitToFile();
        } 
     
        public void LoadFromFile() {
        Cars = (ArrayList<Car>) (Object) FManger.read(CarFileName);
        }
        
        private boolean commitToFile() {
           return FManger.write(CarFileName, Cars);
                  
        }
        
        private int getCarIndex(int CarNo){
            LoadFromFile();
            int Size=Cars.size();
            for(int i=0;i<Size;i++){
                if(Cars.get(i).getCarNo()==CarNo){
                    return i;
                }
            }
            return  -1;
        }
        public boolean Delete_Car(int CarNo){
         LoadFromFile();
         int index = getCarIndex(CarNo);
        
        if (index != -1) {
           Cars.remove(index);

            return commitToFile();
        }

        return false;
    
        }
        public Car Search_Car(int CarNo)
        {
            Car temp = new Car();
          LoadFromFile();
          int index = getCarIndex(CarNo);
          if (index != -1)
                return Cars.get(index);
          else
                return temp;
        }
        public boolean Update_Car(int OldCarNo, Car x)
        {
          LoadFromFile();
          int index = getCarIndex(OldCarNo);
        if (index != -1) {
            Cars.set(index, x);

            return commitToFile();
        }

        return false;
    }
       
        public ArrayList<Car> ListAllCars(){
            LoadFromFile();
            return Cars;
        }
        public boolean commit_to_file(){
        
        return FManger.write(CarFileName,Cars);
   
        }
}


   
   
    


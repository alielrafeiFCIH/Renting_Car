
package project_pl1;


import java.io.Serializable;
import java.util.ArrayList;

public class Customer extends Person implements Serializable {
    public String Email;
    private final String CustomerFileName = "Customers.bin" ;
    public static ArrayList<Customer> Customers = new ArrayList<Customer>();
    
    
    public Customer()
    {
        
    }
    public Customer(String name , int id , String address , String Date_Of_Birth , String phone_No , String Gender,String Email)
    {
        super(name,id,address,Date_Of_Birth,phone_No,Gender);
        this.Email=Email;
    }
    public void setEmail(String Email){
        this.Email=Email;
    } 
    public String getEmail(){
        return this.Email;
    }
    
     public boolean commitToFile() {
        return FManger.write(CustomerFileName, Customers);
    }

    public void loadFromFile() {
        Customers = (ArrayList<Customer>) FManger.read(CustomerFileName);
    }
    
     public String View_Customers() {
        loadFromFile();
        String S = "\nAll Cutomers Data:\n";
        for (Customer x : Customers) {
            S = S + x.toString();
        }
        return S;
    }
     
     public boolean Add_Customer() {
        loadFromFile();
        Customers.add(this);
        return commitToFile();
    }
     
     private int getCustomerIndex(int id) {
        for (int i = 0; i < Customers.size(); i++) {
            if (Customers.get(i).getId() == id) {
                return i;
            }
        }

        return -1;
    }
   
     public Customer Search_Customer(int id) {
        Customer temp = new Customer();
         loadFromFile();
        int index = getCustomerIndex(id);
        if (index != -1) {
            return Customers.get(index);
        } else {
            return temp;
        }
    }
     
     public boolean Update_Customer(int OldID, Customer x) {
        loadFromFile();
        int index = getCustomerIndex(OldID);

        if (index != -1) {
            Customers.set(index, x);

            return commitToFile();
        }

        return false;
    }
     
     public boolean Delete_Customer(int id) {
        loadFromFile();
        int index = getCustomerIndex(id);

        if (index != -1) {
            Customers.remove(index);

            return commitToFile();
        }

        return false;
    }
   public ArrayList ListAllCustomer(){
       loadFromFile();
       return Customers;       
   }  
    /* @Override
        public String toString() {
        return "\nCustomer's name : " + name +  "\n" + "ID : " + id + " Date_of_birth : " + Date_of_birth + "\n"
                + "address : " + address + " GPA : " + GPA + "\nDept: " + myDept.getDeptName() + "\nUserName: " + username + "\t Password: " + password + "\n";
    }*/
//     FM FBManger = new FileMangerBinary();
}


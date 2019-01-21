
package project_pl1;


import java.io.Serializable;

public class  Person  implements Serializable {
    
    protected String name;
    protected int id;
    protected String address;
    protected String Date_Of_Birth;
    public String Phone_No;
    protected String Gender;
    FManagerBinary FManger = new FManagerBinary();
    public Person(String name, int id, String address, String Date_Of_Birth, String Phone_No, String Gender) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.Date_Of_Birth = Date_Of_Birth;
        this.Phone_No = Phone_No;
        this.Gender = Gender;
    }
    public Person ()
    {
    }
    
   

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate_Of_Birth() {
        return this.Date_Of_Birth;
    }

    public void setDate_Of_Birth(String Date_Of_Birth) {
        this.Date_Of_Birth = Date_Of_Birth;
    }

    public String getPhone_No() {
        return this.Phone_No;
    }

    public void setPhone_No(String Phone_No) {
        this.Phone_No = Phone_No;
    }

    public String getGender() {
        return this.Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    
    
    
    
    
    
    
}

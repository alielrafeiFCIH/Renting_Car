
package project_pl1;
import java.io.*;
import java.util.*;
import static project_pl1.Report.Reports;

public class Ticket implements Serializable{
    protected int id;
    protected String Date;
    protected int Rent_days;
    protected int Sitting_Capacity;
    Customer Cust;
    Car car;
    private final String TicketFileName = "Ticket.pdf";
    private final String BTicketFileName = "Ticket.bin";
    protected static ArrayList<Ticket> Tickets = new ArrayList <Ticket>();
    FileManger FManager = new FileManger();
    FManagerBinary FBManger = new FManagerBinary();
    
    public Ticket() {
    }
    

    public Ticket(int id, String Date, int Rent_days, String UseAs, int Sitting_Capacity, Customer Cust, Car car) {
        this.id = id;
        this.Date = Date;
        this.Rent_days = Rent_days;
        this.Sitting_Capacity = Sitting_Capacity;
        this.Cust = Cust;
        this.car = car;
    }

    public void setCust(Customer Cust) {
        this.Cust = Cust;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    
    

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public int getRent_days() {
        return Rent_days;
    }

    public void setRent_days(int Rent_days) {
        this.Rent_days = Rent_days;
    }

    public int getSitting_Capacity() {
        return Sitting_Capacity;
    }

    public void setSitting_Capacity(int Sitting_Capacity) {
        this.Sitting_Capacity = Sitting_Capacity;
    }

    public int Calculate_Total_Rent()
    {
        return Rent_days*car.RentValue;
    }
    

    
    public boolean CommitToFile ()
    {
        return FBManger.write(BTicketFileName,Tickets);
    }
    public void LoadFromFile()
    {
        Tickets=(ArrayList<Ticket>)FBManger.read(BTicketFileName);
    }
    
    @Override
    public String toString()
    {
        return "BrandName :"+car.Brands.BName+"\n"+
                "CarNo:"+car.CarNo+"\n"+
                "Car variant:"+car.variant+"\n"+
                "Car Model"+car.vechileModel+"\n"+
                "Car Use"+this.car.UseAs+"\n"+
                "Customer Name"+Cust.name+"\n"+
                "Customer ID"+Cust.id+"\n"+
                "Customer Adress"+Cust.address+"\n"+
                "Customer Gender"+Cust.Gender+"\n"+
                "Date:"+this.Date+"\n"+
                "Price:"+this.Calculate_Total_Rent()+"\n"
                ;
    }
    
    public boolean PrintTicket()
    {
        return FManager.write(this.toString(), TicketFileName, true);
    }
    
    private int GetTicketIndex(int id) {
        for (int i = 0; i < Tickets.size(); i++) {
            if (Tickets.get(i).getID() == id) {
                return i;
            }
        }

        return -1;
    }
    
    public String DisplayAllTickets() {
        LoadFromFile();
        String S=new String();
        for (Ticket x : Tickets) {
            S = S + x.toString();
        }
        return S;
    }
    
    public Ticket SearchTicket(int id) {
        LoadFromFile();
        int index = GetTicketIndex(id);
        if (index != -1) {
            return Tickets.get(index);
        } else {
            return new Ticket();
        }
    }
    
    public boolean AddTicket() {
        LoadFromFile();
        Tickets.add(this);
        return CommitToFile();
    }
    
    public boolean UpdateTicket(int oldID, Ticket x) {
        LoadFromFile();
        int index = GetTicketIndex(oldID);

        if (index != -1) {
            Tickets.set(index, x);

            return CommitToFile();
        }

        return false;
    }

    public boolean DeleteTicket(int id) {
        LoadFromFile();
        int index = GetTicketIndex(id);

        if (index != -1) {
            Reports.remove(index);

            return CommitToFile();
        }

        return false;
    }

    
}

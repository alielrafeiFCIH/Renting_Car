    package project_pl1;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ali
 */

import java.util.ArrayList;

import java.io.Serializable;
public class Employee extends Staff implements Serializable{
    private String Date_of_join;
    private String qualifications;
    private final String EmployeeFileName = "Employee.bin";
    public static ArrayList<Employee> Employees = new ArrayList();
    //-------------------------------------------------------------------------------------------//   
    
     //////////////////////////////
    //    constructors          //
   //////////////////////////////
   public Employee(){
       
   }
   
   public Employee(String Date_of_join,String qualifications,String name, int id, String address, String Date_Of_Birth, String Phone_No, String Gender,String Username,String Password ){
       super(Username, Password, name, id, address, Date_Of_Birth, Phone_No, Gender);
       this.Date_of_join=Date_of_join;
       this.qualifications=qualifications;
   }
   //==========================================================================================//
   ////////////////////////////////
  //           Methods          //
 ////////////////////////////////
   
   public void Set_Date_of_join(String Date_of_join){
       
       this.Date_of_join=Date_of_join;
   }
   
   
   public void Set_qualifications(String qualifications){
       
       this.qualifications=qualifications;
   }
   
   
   public String Get_Date_of_join(){
       return this.Date_of_join;
   }
   
   
   public String Get_qualification(){
       return this.qualifications;
   }
  
   
   public int Get_Employee_id(int id){
        int Size = Employees.size();
        for(int i=0;i<Size;i++){
            if(Employees.get(i).getId()==id){
                return i;
            }
        }
       return -1;
        
    }
    
   public int Get_Employee_Username(String Username){

        for(int i=0;i<Employees.size();i++){
            if(Employees.get(i).getUsername().equals(Username)){
                return i;
            }
        }
       return -1;
        
    }
    
   public Employee Search_For_Employee(String Username){
       Employee temp = new Employee();
       Load_From_File();
       int index = Get_Employee_Username(Username);
       if(index!=-1){
           return Employees.get(index);
       }else{
           return temp;
       }
   }
  public void Load_From_File(){
       Employees = (ArrayList<Employee>) (Object) FManger.read(EmployeeFileName);
    }
  
   public boolean Add_New_Employee(){
       Load_From_File();
       Employees.add(this);
       return commit_to_File();
   }
   
   public boolean Update_Employee(int id,Employee emp){
       Load_From_File();
      int index = Get_Employee_id(id);
      if(index!=-1){
          Employees.set(index, emp);
        commit_to_File();
        return true;
      }else{
        
        return false;
      }
       
   }
   public String DisplayAllEmployee(){
       Load_From_File();
       String s="\nAll Employee\n";
       for(Employee x: Employees){
           s=s+x.to_string();
       }
       return s;
   }
   
   public boolean Delete_Employee(int id){
       Load_From_File();
      int Index = Get_Employee_id(id);
      if(Index!=-1){
          Employees.remove(Index);
          return commit_to_File();
          
      }else{
          return false;
      }
   }
   public ArrayList<Employee> ListEmployees(){
       Load_From_File();
       return Employees;
   }
   public boolean commit_to_File(){
       return FManger.write(EmployeeFileName,Employees);
   }
   
   
   
   
  //==============================Driver============================//
 
   public void Add_New_Driver(String experience,String photo,String name, int id, String address, String Date_Of_Birth, String Phone_No, String Gender){
       Driver div = new Driver(experience,photo,name,id,address,Date_Of_Birth,Phone_No, Gender);
       if(div.Add_Driver()){
       System.out.println("added Sucsccfuly......\n");
       }else{
       System.out.println("");
           }
   }
   
   //SearchDriver
//   public boolean Search_For_Driver(int id){
//       Driver div = new Driver();
//       if(div.Search_Driver(id)){
//           return true;
//       }else{
//           return false;
//       }
//       
//   }
   
   
   public void Update_Old_Driver(int Oldid ,Driver Div){
       Driver div = new Driver();
       div.Update_Driver(Oldid,Div);
   }
   
    public void Delete_old_Driver(int id){
        Driver div = new Driver();
        div.Delete_Driver(id);
    }
   //==========================Customer===========================//
    
    
    
    
   public boolean  Add_New_Customer(String username , String password , int Rent_Days , String Book_Date , String UsAs , int SettingCapasity , String name , int id , String address , String Date_of_birth , String Phone_No , String gender){
       Customer cu = new Customer();
       return cu.Add_Customer();
       
   }
   
//   public boolean Search_For_Customer(int id){
//       Customer cu = new Customer();
//      return cu.Search_Customer(id);
//   }
   
   public boolean Update_old_Customer(int id,Customer NCu){
       Customer cu = new Customer();
       return cu.Update_Customer(id,NCu);
   }
   
   public boolean Delete_Old_Customer(int id){
       Customer Cu = new Customer();
       return Cu.Delete_Customer(id);
   }
   
   
   
   
   //=====================ticket=====================//
   

   private boolean Add_New_Ticket(){
       Ticket tic = new Ticket();
      return tic.AddTicket();  
   }
  //=====================Report=====================//
   private boolean Add_New_Report(){
       Report re = new Report();
       return re.Add_Report();
   }
   private boolean Search_For_Report(int id){
       Report re = new Report();
       return re.Search_Report(id);
   }
   private boolean Update_old_Report(int id){
        Report re = new Report();
        return re.Update_Report(id, re);
   }
   private boolean Delete_old_Report(int id){
        Report re = new Report();
        return re.Delete_Report(id);
   }
   
   
   public String to_string(){
        return "mu name id"+ this.name+"\n"+"id:"+this.id+"\n"+"address:"+this.address+"Date_of_birth:"+this.Date_Of_Birth+"\n"+"phone:"
                +this.Phone_No+"\n"+"gender:"+this.Gender+"\n";
    }
       
    @Override
  public boolean Login(String userName, String Pass){
        Load_From_File();
        for (Employee x : Employees) {
            if (userName.equals(x.Username) && Pass.equals(x.Password)) {
                return true;
            }
        }
        return false;
    }
  

    
}

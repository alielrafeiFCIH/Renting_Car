
package project_pl1;



import java.io.Serializable;
import java.util.ArrayList;

public class Report implements Serializable {
    protected String Date;
    protected String Title;
    protected String Description;
    protected int ID;


    private final String ReportFile = "Report.bin";
    public static ArrayList <Report> Reports = new ArrayList<Report>();


    FManagerBinary FBManger = new FManagerBinary();

    
    public Report ()
    {
    }

    public Report(String Date, String Title, String Description, int ID) {
        this.Date = Date;
        this.Title = Title;
        this.Description = Description;
        this.ID = ID;
    }
    
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    
    
     

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    public boolean CommitToFile ()
    {
        return FBManger.write(ReportFile,Reports);
    }
    public void LoadFromFile()
    {
        Reports=(ArrayList<Report>)FBManger.read(ReportFile);
    }
    
    @Override
    public String toString()
    {
        return "\n\t "+Title+"\n Date:"+Date+"\n"+Description+"\n";
    }
    
    private int GetReportIndex(int id) {
        for (int i = 0; i < Reports.size(); i++) {
            if (Reports.get(i).getID() == id) {
                return i;
            }
        }

        return -1;
    }
    
    public String DisplayAllReports() {
        LoadFromFile();
        String S=new String();
        for (Report x : Reports) {
            S = S + x.toString();
        }
        return S;
    }
    
    public boolean Search_Report(int ID) {
        LoadFromFile();
        int index = GetReportIndex(ID);
        if (index != -1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean Add_Report() {
        LoadFromFile();
        Reports.add(this);
        return CommitToFile();
    }
    
    public boolean Update_Report(int oldID, Report x) {
        LoadFromFile();
        int index = GetReportIndex(oldID);

        if (index != -1) {
            Reports.set(index, x);

            return CommitToFile();
        }

        return false;
    }

    public boolean Delete_Report(int id) {
        LoadFromFile();
        int index = GetReportIndex(id);

        if (index != -1) {
            Reports.remove(index);

            return CommitToFile();
        }

        return false;
    }
    
}



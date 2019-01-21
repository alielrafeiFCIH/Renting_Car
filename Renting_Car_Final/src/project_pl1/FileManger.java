package project_pl1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;


public class FileManger implements Serializable {

    public boolean write(String Query, String FilePath, boolean appendType) {

        PrintWriter writter = null;
        try {
            
            writter = new PrintWriter(new FileWriter(new File(FilePath), appendType));
            writter.println(Query);
            System.out.print("\nWritting in ! " + FilePath);
            return true;
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            writter.close();
        }
        return false;
    }

}

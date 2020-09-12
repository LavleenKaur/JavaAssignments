//Create a method named WriteData and pass the rowCount and that method will write till that rowCount and you have to take the data from user, that should be write in the file.
package com.pkg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingA1 {
  public static void main(String[] args) throws IOException {
    System.out.println("Enter the row count");
    Scanner s= new Scanner(System.in);
    int rowCount=s.nextInt();
    System.out.println("Enter your text");
    for(int i=1;i<=rowCount;i++) {
    String Text=s.next();
    System.out.println("The text has been written to the file");
    FileHandlingA1 h=new FileHandlingA1();
    h.WriteData(rowCount,Text);
    }
  }
  public void WriteData(int rowCount,String Text) throws IOException {
    File f= new File("../First Project/FileHandling1.txt");// Create a new file in the project
    FileWriter fw=new FileWriter(f);
    BufferedWriter b= new BufferedWriter(fw);
    for(int i=1;i<=rowCount;i++) {
      b.write(Text);
      b.newLine();
    }
    b.close();
  }
 
}
  

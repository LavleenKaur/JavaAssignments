package com.pkg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingA2 {
//Create a method named ReadData and pass the row No and that method will read the data of that particular row.
  public static void main(String[] args) throws IOException {
    System.out.println("Enter the row number");
    Scanner s=new Scanner(System.in);
    int row=s.nextInt();
    FileHandlingA2 a=new FileHandlingA2();
    a.ReadData(row);
  }
  public void ReadData(int rowNum) throws IOException {
    File f =new File("../First Project/FileHandling2.txt");
    FileReader fr=new FileReader(f);
    BufferedReader br=new BufferedReader(fr);
   String s;
    for(int i=1;i<=rowNum;i++) {
      if(i==rowNum) {
        s=br.readLine();
        System.out.println("The text at "+rowNum+" is:" +s);
      }
      else
      {
        s=br.readLine();
      }
    }
  }

}

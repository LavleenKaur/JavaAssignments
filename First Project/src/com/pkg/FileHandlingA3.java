package com.pkg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingA3 {
  //Create a method named ReadDataofRange & pass the initial row no and end row no, that method will read the data of that particular range.
  public static void main(String[] args) throws IOException {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the start row number");
    int Start=s.nextInt();
    System.out.println("Enter the end row number");
    int End=s.nextInt();
    FileHandlingA3 a=new FileHandlingA3();
    a.ReadDataofRange(Start,End);
  }
  public void ReadDataofRange(int rowStart,int rowEnd) throws IOException {
    File f =new File("../First Project/FileHandling2.txt");
    FileReader fr=new FileReader(f);
    BufferedReader br=new BufferedReader(fr);
   String s;
     s=br.readLine();
     int len=s.length();
     System.out.println(len);
     System.out.println(s);
      
      
  }
}

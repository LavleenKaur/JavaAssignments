package com.pkg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteData {
  public static void main(String[] args) throws IOException {
    File f= new File("../First Project/myfile2.txt");// Create a new file in the project
    FileWriter fw=new FileWriter(f);
    BufferedWriter b= new BufferedWriter(fw);
    b.write("I am writing data to the text file");
    b.newLine();//moving to the new line
    b.write("I am writing second line to the text file");
    b.close();// save and close the file
  }

}

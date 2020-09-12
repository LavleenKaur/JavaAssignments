package com.pkg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDataLine {
  public static void main(String[] args) throws IOException {
    File f = new File("../First Project/myfile.txt");
    FileReader fr=new FileReader(f);
    BufferedReader b=new BufferedReader(fr);
    String s;
    while((s=b.readLine())!=null) {
      System.out.println(s);
    }
  }

}

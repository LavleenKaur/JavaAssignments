package com.pkg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendData {
  public static void main(String[] args) throws IOException {
    File f=new File("../First Project/myfile2.txt");
    FileWriter fw=new FileWriter(f, true);// append at the end of file when true
    fw.write("\nNew data");
    fw.close();
   }

}

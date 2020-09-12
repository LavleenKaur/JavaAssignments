package com.pkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDataReadChar {
  public static void main(String[] args) throws IOException {
    File f=new File("../First Project/myfile.txt");//connection establish
    FileReader fr=new FileReader(f); // read file character by character
    int a;
    while((a=fr.read())!=-1) {//-1 means end of the file has been reached,read() will give ASCII value of character
    System.out.println((char)a);  
    }
  }

}

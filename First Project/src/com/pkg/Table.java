package com.pkg;

import java.util.Scanner;

public class Table {
  public static void main(String[] args) {
    System.out.println("Enter any number");
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    s.close();
    for(int i=1;i<=10;i++) {
      int mul=num*i;
      System.out.println(num+" * "+i+" = "+mul);
    }
  }

}

package com.pkg;

import java.util.Scanner;

public class Prime {

  public static void main(String[] args) {
    System.out.println("Enter any number");
    Scanner s=new Scanner(System.in);
    int n= s.nextInt();
    s.close();
    boolean flag=false;
    for(int i=2;i<=2;i++) {
      if(n%i==0) {
        flag=true;
        break;
      }
    }
    if(!flag)
      System.out.println(n+ " is a prime number");
    else
      System.out.println(n+ "is not a prime number");
  }
  
}  

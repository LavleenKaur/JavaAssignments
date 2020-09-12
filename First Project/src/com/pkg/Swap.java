package com.pkg;

import java.util.Scanner;

public class Swap {
  public void swap(int a, int b) {
    a= a+b;
    b=a-b;
    a=a-b;
    System.out.println("After swapping values are: "+"a="+a+" b="+b);
  }
  public static void main(String[] args) {
    System.out.println("Enter the value");
    Scanner s= new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    System.out.println("Before swapping values are: "+"a="+a+" b="+b);
    s.close();
    Swap v=new Swap();
    v.swap(a,b);   
  }

}

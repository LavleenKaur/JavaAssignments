package com.pkg;

import java.util.Scanner;

public class SwapVar {
  public void swap(int a, int b) {
    int c;
    c=a;
    a=b;
    b=c;
    System.out.println("After swapping values are: "+"a="+a+" b="+b);
  }
  public static void main(String[] args) {
    System.out.println("Enter the value");
    Scanner s= new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    System.out.println("Before swapping values are: "+"a="+a+" b="+b);
    s.close();
    SwapVar v=new SwapVar();
    v.swap(a,b);   
  }

}

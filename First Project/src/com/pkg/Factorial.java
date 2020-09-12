package com.pkg;

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    System.out.println("Enter any number");
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    int fact=1;
    s.close();
    for(int i=1;i<=num;i++) {
      fact=fact*i;
    }
    System.out.println("Factorial of "+num+" = "+fact);
  }

}

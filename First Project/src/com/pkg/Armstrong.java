package com.pkg;

import java.util.Scanner;

public class Armstrong {
  public static void main(String[] args) {
    System.out.println("Enter a number");
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    s.close();
    int oldnum=num,sum=0;
    while(num>0) {
      int rem=num%10;
      sum=sum+rem*rem*rem;
      num=num/10;
    }
    if(oldnum==sum) {
      System.out.println(oldnum+" is armstrong");
    }
    else {
      System.out.println(oldnum+" is not armstrong");
    }
  }

}

package com.pkg;

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    System.out.println("Fibonacci series: ");
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    s.close();
    int first=0,second=1,fibo;
    System.out.println(first);
    System.out.println(second);
    for(int i=1;i<=num;i++) {
       fibo=first+second;
       first=second;
       second=fibo;
       System.out.println(fibo);
    }
  }

}

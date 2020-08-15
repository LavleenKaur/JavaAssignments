package com.pkg;

import java.util.Scanner;

public class Temperature {
  public float div(float a,float b)
  {
    float c=a/b;
    System.out.println("Div is: "+c);
    return c;
  }
  public float mul(int a,float b)
  {
    float c=a*b;
    System.out.println("mul is: "+c);
    return c;
  }
  public float sum(float a,float b)
  {
    float c=a+b;
    System.out.println("Sum is: "+c);
    return c;
  }
  public static void main(String[] args) {
    System.out.println("Enter the value in Celcius");
    Scanner s = new Scanner(System.in);
    int x=s.nextInt();
    s.close();
    Temperature temp=new Temperature();
    float d=temp.div(9, 5);// d is 1.8
    float m=temp.mul(x, d);
    float a=temp.sum(m, 32);
    System.out.println("The value in Fahrenheit is:"+a);
    
  }

}

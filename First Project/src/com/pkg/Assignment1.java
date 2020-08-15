package com.pkg;

public class Assignment1 {
  {
    System.out.println("Expression is: (((((10+2)+2)-2)*2)/2)");
  }

  public int sum(int a, int b) {
    int c;
    c = a + b;
    System.out.println("Sum is: " + c);
    return c;
  }

  public int sub(int a, int b) {
    int c;
    c = a - b;
    System.out.println("Subtraction is: " + c);
    return c;
  }

  public int mul(int a, int b) {
    int c;
    c = a * b;
    System.out.println("Multiplication is: " + c);
    return c;
  }

  public void div(int a, int b) {
    int c;
    c = a / b;
    System.out.println("Final Result after Division is: " + c);
  }

  public static void main(String[] args) {
    Assignment1 result = new Assignment1();
    int add1 = result.sum(10, 2);
    int add2 = result.sum(add1, 2);
    int sub1 = result.sub(add2, 2);
    int mul1 = result.mul(sub1, 2);
    result.div(mul1, 2);
  }

}

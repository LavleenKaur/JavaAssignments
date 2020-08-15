package com.pkg;

/**
 * The Assignment2 class
 * 
 * @author Lk
 *
 */
public class Assignment2 {

  {
    System.out.println("Expression: (((((10-2)+2)-2)*2)/2)");
  }

  /**
   * The Subtraction method.
   * 
   * @param a represents first int value
   * @param b represents second int value
   * @return
   */
  public int sub(int a, int b) {
    int c;
    c = a - b;
    System.out.println("Subtraction is: " + c);
    return c;
  }

  public int sum(int a, int b) {
    int c;
    c = a + b;
    System.out.println("Sum is: " + c);
    return c;
  }

  public int mul(int a, int b) {
    int c;
    c = a * b;
    System.out.println("Multiplication is: " + c);
    return c;
  }

  /**
   * 
   * @param a
   * @param b
   */
  public void div(int a, int b) {
    int c;
    c = a / b;
    System.out.println("Final Result after Division is: " + c);
  }

  public static void main(String[] args) {
    Assignment2 result = new Assignment2();
    int sub1 = result.sub(10, 2);
    int add1 = result.sum(sub1, 2);
    int sub2 = result.sub(add1, 2);
    int mul1 = result.mul(sub2, 2);
    result.div(mul1, 2);
  }

}

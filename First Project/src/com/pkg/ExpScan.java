package com.pkg;

import java.util.Scanner;

public class ExpScan {
	public int add(int a,int b) {
		int c= a+b;
		System.out.println("Addition is: "+c);
		return c;
		
	}
	public int sub(int a , int b) {
		int c=a-b;
		System.out.println("Subtraction is: "+c);
		return c;
	}
	public int mul(int a, int b) {
		int c=a*b;
		System.out.println("Multiplication is: " +c);
		return c;
	}
	public void div(int a,int b) {
		int c=a/b;
		System.out.println("Final result is: "+c);
	}
	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner s=new Scanner(System.in);
		int x1=s.nextInt();
		int x2=s.nextInt();
		int x3=s.nextInt();
		int x4=s.nextInt();
		int x5=s.nextInt();
		int x6=s.nextInt();
		s.close();
		ExpScan e= new ExpScan();
		int sum=e.add(x1, x2);
		int min=e.sub(sum, x3);
		int mult=e.mul(min, x4);
		int sum1=e.add(mult,x5);
		e.div(sum1, x6);
		
		}
	

}

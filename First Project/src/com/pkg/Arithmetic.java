package com.pkg;

public class Arithmetic {
	
	public int add(int a, int b) {
		int c;
		c=a+b;
		System.out.println("Sum is: "+c);
		return c;
	}
	public int sub(int a, int b) {
		int c;
		c=a-b;
		System.out.println("Subtraction is: "+c);
		return c;
	}
	public void mul(int a, int b)
	{
	int c;
	c=a*b;
	System.out.println("Multiplication is: "+c);
	}
	public static void main(String[] args) {
		Arithmetic result=new Arithmetic();
		int sumresult=result.add(10, 2);
		int subresult=result.sub(10, 2);
		result.mul(sumresult, subresult);
		
	}

}

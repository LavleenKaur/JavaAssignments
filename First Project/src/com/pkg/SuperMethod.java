package com.pkg;

public class SuperMethod {
	public void Cons()
	{
		this.Cons(10);
		System.out.println("Default Parent Constructor");
	}
	public void Cons(int a) {
		System.out.println("One Parameterized Parent Constructor");
	}
	public void Cons(int a, int b) {
		this.Cons();
		System.out.println("Two Parameterized Parent Constructor");
	}
	public void Cons(int a, int b, int c) {
		this.Cons(10,20);
		System.out.println("Three Parameterized Parent Constructor");
	}
	public void Cons(int a,int b,int c,int d) {
		this.Cons(10,20,30);
		System.out.println("Four Parameterized Parent Constructor");
	}
	public static void main(String[] args) {
		SuperMethod c=new SuperMethod();
		c.Cons(10,20,30,40);

	}

}



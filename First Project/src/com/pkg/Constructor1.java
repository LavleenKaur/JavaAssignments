package com.pkg;

public class Constructor1 {

	public Constructor1() {
		this(12,43,56,77);
		System.out.println("This is a default constructor");
	}
	public Constructor1(int a) {
		this();
		System.out.println("This is one parameterized constructor");
	}
	public Constructor1(int a, int b) {
		this(12);
		System.out.println("Thiss is two parameterized character");
	}
	public Constructor1(int a, int b, int c) {
		this(12,43);
		System.out.println("This is three parameterized constructor");
	}
	public Constructor1(int a, int b, int c, int d) {
		System.out.println("This is a four parameterized constructor");
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Constructor1 obj=new Constructor1(12,43,56);
		}
}

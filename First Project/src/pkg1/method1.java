
package pkg1;

public class method1 {

	public void method2() {
		this.method2(11,22,33);
		System.out.println("This is a default constructor");
		this.method2(11);
		this.method2(11,22);
		this.method2(11,22,33,44);
	}
	public void method2(int a) {
		System.out.println("This is one parameterized constructor");
	}
	public void method2(int a, int b) {
		System.out.println("This is two parameterized character");
	}
	public void method2(int a, int b, int c) {
		System.out.println("This is three parameterized constructor");
	}
	public void method2(int a, int b, int c, int d) {
		System.out.println("This is a four parameterized constructor");
	}
	public static void main(String[] args) {
		method1 obj=new method1();
		obj.method2();
		}
}
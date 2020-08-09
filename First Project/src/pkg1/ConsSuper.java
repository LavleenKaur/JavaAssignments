package pkg1;

public class ConsSuper {
	public ConsSuper()
	{
		this(10,20,30);
		System.out.println("Default Parent Constructor");
	}
	public ConsSuper(int a) {
		this(10,20,30,40);
		System.out.println("One Parameterized Parent Constructor");
	}
	public ConsSuper(int a, int b) {
		this(12);
		System.out.println("Two Parameterized Parent Constructor");
	}
	public ConsSuper(int a, int b, int c) {
		System.out.println("Three Parameterized Parent Constructor");
	}
	public ConsSuper(int a,int b,int c,int d) {
		this();
		System.out.println("Four Parameterized Parent Constructor");
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ConsSuper c=new ConsSuper(10,20);

	}

}

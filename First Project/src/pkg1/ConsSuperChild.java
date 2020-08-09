package pkg1;

public class ConsSuperChild extends ConsSuper{
	public ConsSuperChild()
	{
		super(50,60);
		System.out.println("Default Child Constructor");
	}
	public ConsSuperChild(int a) {
		this(10,20,30);
		System.out.println("One Parameterized Child Constructor");
	}
	public ConsSuperChild(int a, int b) {
		this(12);
		System.out.println("Two Parameterized Child Constructor");
	}
	public ConsSuperChild(int a, int b, int c) {
		this(10,20,30,40);
		System.out.println("Three Parametrized Child Constructor");
	}
	public ConsSuperChild(int a,int b,int c,int d) {
		this();
		System.out.println("Four Parameterized Child Constructor");
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ConsSuperChild c=new ConsSuperChild(10,20);

	}

}

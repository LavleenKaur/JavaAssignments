package pkg1;

public class SuperMethodChild extends SuperMethod{
	public void ConsChild()
	{
	    super.Cons(10,20,30,40);
		System.out.println("Default Child Constructor");
	}
	public void ConsChild(int a) {
		this.ConsChild();
		System.out.println("One Parameterized Child Constructor");
	}
	public void ConsChild(int a, int b) {
		this.ConsChild(10);
		System.out.println("Two Parameterized Child Constructor");
	}
	public void ConsChild(int a, int b, int c) {
		this.ConsChild(10,20,30,40);
		System.out.println("Three Parameterized Child Constructor");
	}
	public void ConsChild(int a,int b,int c,int d) {
		this.ConsChild(10,20);
		System.out.println("Four Parameterized Child Constructor");
	}
	public static void main(String[] args) {
		SuperMethodChild c=new SuperMethodChild();
		c.ConsChild(10,20,30);

	}
}

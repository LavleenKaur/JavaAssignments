package pkg1;

public class Assignment2 {
	
	{
		System.out.println("Expression: (((((10-2)+2)-2)*2)/2)");
	}
	public int sub(int a, int b) {
	int c;
	c=a-b;
	System.out.println("Subtraction is: "+c);
	return c;
	}
	public int sum(int a,int b) {
		int c;
		c=a+b;
		System.out.println("Sum is: "+c);
		return c;
	}
	public int mul(int a,int b) {
		int c;
		c=a*b;
		System.out.println("Multiplication is: "+c);
		return c;
	}
	public void div(int a, int b)
	{
		int c;
		c=a/b;
		System.out.println("Final Result after Division is: "+c);
	}
	 public static void main(String[] args) {
		 Assignment2 result=new Assignment2();
		int sub1= result.sub(10, 2);
		int add1=result.sum(sub1, 2);
		int sub2=result.sub(add1, 2);
		int mul1=result.mul(sub2, 2);
		result.div(mul1, 2);
	 }

}

package pkg1;

public class Student 
{
	int rollno,age;
	public void method1()
	{
		System.out.println("Welcome All");
	}
	public void method2()
	{
		System.out.println("Automation is Easy");
	}
	public static void main(String[] args) {
		Student Deepak=new Student();
		Deepak.rollno=1434910028;
		System.out.println("Roll no is: "+Deepak.rollno);
		Deepak.age=23;
		System.out.println("Age is: "+Deepak.age);
		Deepak.method1();
		Deepak.method2();
	}
}
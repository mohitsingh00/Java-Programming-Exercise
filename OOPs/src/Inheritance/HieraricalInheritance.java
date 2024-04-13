package Inheritance;
class A2
{
	void showA()
	{
		System.out.println("A class method.");
	}
}

class B1 extends A
{
	void showB()
	{
		System.out.println("B class method.");
	}
}

public class HieraricalInheritance extends A
{
	void showC()
	{
		System.out.println("C class method.");
	}

	public static void main(String[] args)
	{
		
		//From A class object I can only access class A methods
		A2 ob = new A2();
		ob.showA();
		//ob.showB();
		//ob.showC();
		
		System.out.println("---------------------------------");
		
		//From B class object I can access my own class methods & class A methods
		B1 ob1  = new B1();
		ob1.showA();
		ob1.showB();
		//ob.showC();
		
		System.out.println("---------------------------------");
		
		//From my class object I can access my own class & class A
		HieraricalInheritance ob3 = new HieraricalInheritance();
		ob3.showA();
		//ob3.showB();
		ob3.showC();
	}

}

package Inheritance;

class A1
{
	void showA()
	{
		System.out.println("A class method.");
	}
}

class B extends A
{
	void showB()
	{
		System.out.println("B class method.");
	}
}

public class MutlilevelInheritance extends B
{

	void showC()
	{
		System.out.println("C class method.");
	}
	
	public static void main(String[] args)
	{

		//From A class object I can only access class A methods
		A1 ob = new A1();
		ob.showA();
		//ob.showB();
		//ob.showC();
		
		System.out.println("---------------------------------");
		
		//From B class object I can access my own class methods & class A1 methods
		B ob1  = new B();
		ob1.showA();
		ob1.showB();
		//ob.showC();
		
		System.out.println("---------------------------------");
		
		//From my class object I can access my own class, class A & class B methods
		MutlilevelInheritance ob2 = new MutlilevelInheritance();
		ob2.showA();
		ob2.showB();
		ob2.showC();
	}

}

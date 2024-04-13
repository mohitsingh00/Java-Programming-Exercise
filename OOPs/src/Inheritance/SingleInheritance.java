package Inheritance;
class A
{
	void showA()
	{
		System.out.println("A class method.");
	}
}

public class SingleInheritance extends A
{
	void showB()
	{
		System.out.println("B class method.");
	}

	public static void main(String[] args) 
	{
		//From A class object I can only access class A methods
		A ob = new A();
		ob.showA();
		//ob.showB();
		
		System.out.println("---------------------------------");
		
		//From SingleInheritance class object I can access my own class methods & class A methods
		SingleInheritance ob1  = new SingleInheritance();
		ob1.showA();
		ob1.showB();

	}

}

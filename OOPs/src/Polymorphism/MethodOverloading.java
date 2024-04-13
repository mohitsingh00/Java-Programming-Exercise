package Polymorphism;


public class MethodOverloading {
	
	//No. of parameters should be different
	void show(int a, int b)
	{
		System.out.println("1");
	}
	
	void show(int a)
	{
		System.out.println("2");
	}
	
	//Sequence of parameters should be different
	void show(int b, String s)
	{
		System.out.println("3");
	}
	
	void show(String a, int b)
	{
		System.out.println("4");
	}
	
	//Types of parameters should be different
	void show(String s)
	{
		System.out.println("3");
	}
	
	void show(char c)
	{
		System.out.println("4");
	}
	
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.show(0);
		

	}

}

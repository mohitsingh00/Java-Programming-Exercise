package Polymorphism;
class Test
{
	//No. of parameters should be same
	void show(int a, int b)
	{
		System.out.println("1");
	}
	
	//Sequence of parameters should be same
	void show(int c, String s)
	{
		System.out.println("2");
	}
	
	//Types of parameters should be same
	void show(int x)
	{
		System.out.println("2");
	}
}

public class MethodOverriding extends Test
{
	    //No. of parameters should be same
		void show(int a, int b)
		{
			System.out.println("1");
		}
		
		//Sequence of parameters should be same
		void show(int c, String s)
		{
			System.out.println("2");
		}
		
		//Types of parameters should be same
		void show(int x)
		{
			System.out.println("2");
		}   

	public static void main(String[] args) {
		
		MethodOverriding obj = new MethodOverriding();
		obj.show(0);

	}

}

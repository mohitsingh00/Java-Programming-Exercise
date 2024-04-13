package Super;
//Use to invoke parent class method
class A
{
	void m1()
	{
		System.out.println("I'm in Parent class");
	}
}
public class SuperUse1 extends A
{
	void m1()
	{
		System.out.println("I'm in Child class.");
	}
	
	void show()
	{
		m1();
		super.m1();
	}

	public static void main(String[] args) {
		
		SuperUse1 obj = new SuperUse1();
		obj.show();

	}

}

package Super;
//Use to invoke parent class constructor
class Test1
{
	Test1()
	{
		System.out.println("I'm in Parent class consructor");
	}
}

public class SuperUse2 extends Test1
{
	SuperUse2()
	{
		//Even if we don't write the "super" method constructor will automatically 
		//call the parent class constructor
		super();
		System.out.println("I'm in Child class constructor.");	
	}

	public static void main(String[] args) {
		
		SuperUse2 obj = new SuperUse2();
		
	}

}

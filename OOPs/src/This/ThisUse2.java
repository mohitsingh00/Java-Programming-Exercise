package This;
//this() keyword used to invoke current class constructor
class Test2
{
	Test2()
	{
		this(1);
		System.out.println("Non-Argument Constructor");
	}
	
	Test2(int a)
	{
		//this();
		System.out.println("Parameterized Constructor");
	}
}
public class ThisUse2 {

	public static void main(String[] args) {
		
		Test2 t = new Test2();

	}

}

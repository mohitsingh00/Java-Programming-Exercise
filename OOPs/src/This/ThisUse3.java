package This;
//Used to pass as an argument in the method call
class Test3
{
	void m1(Test3 t)
	{
		System.out.print("I'm in m1 method");
	}
	
	void m2()
	{
		m1(this);
	}
}
public class ThisUse3 {

	public static void main(String[] args) {
		
		Test3 t = new Test3();
		t.m2();

	}

}

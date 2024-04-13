package This;
//Used to invoke current class method (implicitly)
class Test1
{
	void print()
	{
		System.out.print("Hello");
	}
	
	void show()
	{
		//invoking current class method
		//Even if we don't write "this" keyword complier will automatically add "this" keyword
		this.print();
	}
}
public class ThisUse1 {

	public static void main(String[] args) {
		
		Test1 t = new Test1();
		t.show();
	}

}

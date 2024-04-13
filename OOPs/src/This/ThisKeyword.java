package This;
//Used to refer current class instance variable
class Test
{
	int i;
	void set(int i)
	{
		//refer current class instance variable
		this.i = i;
	}
	
	void show()
	{
		System.out.print(i);
	}
}

public class ThisKeyword {

	public static void main(String[] args) {
		
		Test obj = new Test();
		obj.set(100);
		obj.show();
	}

}

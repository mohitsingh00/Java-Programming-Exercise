package Super;
class Test
{
	int i = 10;
}
public class SuperKeyword extends Test
{
	
	int i = 20;

	void show(int i)
	{
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
	
	public static void main(String[] args) {
		
		SuperKeyword obj = new SuperKeyword();
		obj.show(100);
		
		
	}

}

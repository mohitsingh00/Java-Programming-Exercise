interface I1
{
	//All methods are "public abstract" in interface and not necessary to write "public abstract"
	public abstract void show();
	
	//All fields are "public static final" in interface and not necessary to write "public static final"
	public static final int a = 10;	
	
	//After java 8  we can create default concrete methods
	default void run()
	{
		
	}
	
	//After java 8  we can create static methods
	static void show1()
	{
		
	}
	
	//After java 9 we can create private methods
	private void show2()
	{
		
	}
}

interface I2
{
	int i = 1;
	
	void show4();
	
	default void run1()
	{
		
	}

	static void show5()
	{
		
	}
	
	private void show6()
	{
		
	}
}

//Here we are achieving multiple inheritance through interface by implementing I1 & I2
public class InterfaceExample implements I1,I2
{
	public void show()
	{
		
	}

	public void show4()
	{
		
	}
	
	public static void main(String[] args) {
		
		

	}

}

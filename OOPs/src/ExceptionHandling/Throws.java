package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Test
{
	void read() throws FileNotFoundException
	{
		FileInputStream fm = new FileInputStream("d:/abc.text");
	}
}
public class Throws {

	public static void main(String[] args)  {
		
		Test t = new Test();
		try 
		{
			t.read();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}

	}

}

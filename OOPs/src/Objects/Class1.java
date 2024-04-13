package Objects;

public class Class1 {

	int num = 6;
	
	public void Method()
	{
		System.out.println("Another class Method");
		
		//Now we are creating a class inside the method
		class ClassInsideMethod
		{
			String localInnerClassVariable = "Calling a class of method created inside the method";
			
			public void localInnerClassVariable()
			{
				System.out.println(localInnerClassVariable);
			}
		}
		
		ClassInsideMethod ci = new ClassInsideMethod();
		ci.localInnerClassVariable();
	}

}

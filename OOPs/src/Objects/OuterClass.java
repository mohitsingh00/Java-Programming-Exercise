package Objects;

public class OuterClass {

	int num = 6;
	
	void outerMethod()
	{
		System.out.println("Outer Method");
	}

public class InnerClass
{
	int innerNum = 2;
	
	void innerMethod()
	{
		System.out.println("Inner Method");
	}
}

public static class InnerClass2
{
	int innerNumber = 2;

	void staticInnerMethod()
	{
		System.out.println("Static class Inner Method");
	}
}

}


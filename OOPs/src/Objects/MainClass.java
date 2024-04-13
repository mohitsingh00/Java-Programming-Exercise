package Objects;

public class MainClass {

	public static void main(String[] args) {
		
		OuterClass outer = new OuterClass();
		outer.outerMethod();
		
		//We can only access the inner class through the object of outer class
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.innerMethod();
		
		//For Static inner class we don't need instance of outer class
		OuterClass.InnerClass2 inner1  = new OuterClass.InnerClass2();
		inner1.staticInnerMethod();
		
		Class1 c = new Class1();
		c.Method();
		

	}

}

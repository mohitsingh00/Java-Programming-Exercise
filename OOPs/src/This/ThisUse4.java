package This;
//Used to pass as an argument in the constructor call
class T1
{
	//Passing the reference parameter of below class
	T1(Test4 a)
	{
		System.out.print("T1 class Constructor");
	}
}
class Test4
{
	void m1()
	{
		//calling the above class constructor using "this" keyword as an argument
		T1 t = new T1(this);
	}
}
public class ThisUse4 {

	public static void main(String[] args) {
		
		Test4 obj = new Test4();
		obj.m1();

	}

}

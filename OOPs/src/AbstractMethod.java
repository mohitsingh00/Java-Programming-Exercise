abstract class Vehicle
{
	abstract void start();
}

class Car extends Vehicle
{
	void start()
	{
		System.out.println("Car start by key");
	}
}
public class AbstractMethod extends Vehicle
{
	void start()
	{
		System.out.println("Bike start by kick");
	}
	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.start();
		
		AbstractMethod obj = new AbstractMethod();
		obj.start();

	}

}

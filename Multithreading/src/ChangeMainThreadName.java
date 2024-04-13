//Changing the "main" thread name without extending Thread class
public class ChangeMainThreadName {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Mohit");
		System.out.println(Thread.currentThread().getName());
		System.out.println(10/0);

	}

}

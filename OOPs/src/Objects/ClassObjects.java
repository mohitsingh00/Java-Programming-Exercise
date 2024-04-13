package Objects;

public class ClassObjects {

	public static void main(String[] args) {
			
		ClassObjects doggie = new ClassObjects();
		doggie.dogs();
		 
		//create object of another class
		Birds cb = new Birds();
		//calling another class method
		cb.eagle();
		
	}
	
	public void dogs()
	{
		System.out.println("Buzo is a dog.");
	}

}

//Another Class
 class Birds
 {
	 void eagle()
	 {
		 System.out.println("Eagle is a bird.");
	 }
 }

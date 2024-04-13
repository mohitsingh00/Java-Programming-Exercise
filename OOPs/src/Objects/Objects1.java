//Initialize object using Reference Variable
package Objects;

public class Objects1 {

	int id;
	String name;
	
	public static void main(String[] args) {
		
		Objects1 ob = new Objects1();
		
		//Initializing the objects using reference variable
		ob.id = 12;
		ob.name = "James";
		
		System.out.println("ID: "+ob.id);
		System.out.print("Name: "+ob.name);
		
	}

}

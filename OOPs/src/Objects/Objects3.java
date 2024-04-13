//Initialize object using Constructor
package Objects;

public class Objects3 {
	
	int id;
	String name;
	
	public Objects3(int i, String s)
	{
		id = i;
		name = s;
	}
	
	public void display()
	{
		System.out.println("ID: "+id+"\nName: "+name);
	}

	public static void main(String[] args) {
		
		//Initializing the objects using constructor
		Objects3 ob = new Objects3(01, "Zack");
		ob.display();
		
		

	}

}

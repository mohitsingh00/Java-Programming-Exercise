//Initialize object using Methods
package Objects;

public class Objects2 {
	
	int id;
	String name;
	
	public void detail(int i,String n)
	{
		id = i;
		name = n;
	}
	
	public void display()
	{
		System.out.println("ID: "+id+"\nName: "+name);
	}

	public static void main(String[] args) {
		
		Objects2 ob = new Objects2();
		
		//Initializing the objects using methods
		ob.detail(01, "Josh");
		ob.display();
		

	}

}

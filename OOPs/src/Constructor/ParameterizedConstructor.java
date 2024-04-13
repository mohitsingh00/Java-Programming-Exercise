package Constructor;

public class ParameterizedConstructor {

	int id;
	String name;
	
	ParameterizedConstructor(int i, String s)
	{
		//Storing the value of "i" & "s" in the "id" & "name" variable
		id = i;
		name = s;
	}
	
	public static void main(String[] args) {
		
		//Calling the Parameter Constructor & storing the values in "i" & "s".
		ParameterizedConstructor emp1 = new ParameterizedConstructor(01,"Jason");
		ParameterizedConstructor emp2 = new ParameterizedConstructor(02,"Mark");
		ParameterizedConstructor emp3 = new ParameterizedConstructor(03,"Smith");
		
		//Printing the variables "id" & "name"
		System.out.println("Employee: "+emp1.id+", "+emp1.name);
		System.out.println("Employee: "+emp2.id+", "+emp2.name);
		System.out.print("Employee: "+emp3.id+", "+emp3.name);
		

	}

}

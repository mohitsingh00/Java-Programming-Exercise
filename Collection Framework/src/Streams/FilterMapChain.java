package Streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Employee1
{
	int eID;
	String ename;
	int salary;
	
	Employee1(int id, String name, int sal)
	{
		eID = id;
		ename = name;
		salary = sal;
	}
}
public class FilterMapChain {

	public static void main(String[] args) {

		List<Employee1> emp = Arrays.asList(
				new Employee1(101,"Arun", 30000),
				new Employee1(102,"Virat", 20000),
				new Employee1(101,"Rohit", 50000),
				new Employee1(101,"Subhman", 40000));
		
		 List<String> list = emp.stream().filter(e -> e.salary > 20000).map(e -> e.ename).collect(Collectors.toList());
		 System.out.println(list);
	}
}

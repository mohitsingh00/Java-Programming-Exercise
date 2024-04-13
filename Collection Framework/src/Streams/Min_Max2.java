package Streams;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
class Employee
{
	String ename;
	int salary;
	int age;
	
	Employee(String n, int sal, int a)
	{
		 ename = n;
		 salary = sal;
		 age = a;
	}
	
	public int getAge() 
	{
	      return age;
    }
}
public class Min_Max2 {

	public static void main(String[] args) {

		List<Employee> emp = Arrays.asList(
				new Employee("Dave",30000,32),
				new Employee("Kate",20000,22),
				new Employee("Mark",40000,56),
				new Employee("Vin",60000,42));
		Optional<Employee> op = emp.stream().min(Comparator.comparing(Employee::getAge));
		 if (op.isPresent()) 
		 {
	            Employee youngestEmployee = op.get();
	            System.out.println("Youngest employee: " + youngestEmployee.ename + ", Age: " + youngestEmployee.age);
	     } 
		 else 
		 {
	            System.out.println("No employees found.");
	     }
	}
}

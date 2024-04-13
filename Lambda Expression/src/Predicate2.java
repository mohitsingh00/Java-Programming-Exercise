import java.util.ArrayList;
import java.util.function.Predicate;

class Employee
{
	String ename;
	int salary;
	int exprience;
	
	Employee(String n, int sal, int exp)
	{
		 ename = n;
		 salary = sal;
		 exprience = exp;
	}
}
public class Predicate2 {

	public static void main(String[] args) {

		ArrayList <Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Dave", 50000, 5));
		al.add(new Employee("John", 20000, 2));
		al.add(new Employee("Mark", 30000, 3));
		al.add(new Employee("Ben", 40000, 4));
		
		Predicate <Employee> p = e -> (e.salary > 30000 && e.exprience > 3);
		for(Employee e : al)
		{
			if(p.test(e))
			{
				System.out.println(e.ename+"  "+e.salary);
			}
		}
	}
}

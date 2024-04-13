import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
class Employee2
{
	String ename;
	int salary;
	String gender;
	
	Employee2(String n, int sal, String g)
	{
		 ename = n;
		 salary = sal;
		 gender = g;
	}
}
public class Consumer2 {

	public static void main(String[] args) {
		
		ArrayList <Employee2> al = new ArrayList<Employee2>();
		al.add(new Employee2("Dave", 50000, "Male"));
		al.add(new Employee2("John", 20000, "Male"));
		al.add(new Employee2("Mark", 30000, "Male"));
		al.add(new Employee2("Ben", 40000, "Male"));
		
		Function<Employee2,Integer> f = e -> (e.salary * 10) / 100;
		Predicate<Integer> p = b -> b > 500;
		Consumer<Employee2> c = emp -> 
		{
			System.out.println(emp.ename+"  "+emp.salary+"  "+emp.gender);
		};
		
		for(Employee2 e : al)
		{
			int bonus = f.apply(e);
			if(p.test(bonus))
			{
				c.accept(e);
				System.out.println("Employee Bonus: "+bonus);
			}
		}
	}
}

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
class Employee1
{
	String ename;
	int salary;
	
	Employee1(String n, int sal)
	{
		 ename = n;
		 salary = sal;
	}
}
public class Function2 {

	public static void main(String[] args) {

		ArrayList <Employee1> al = new ArrayList<Employee1>();
		al.add(new Employee1("Dave", 50000));
		al.add(new Employee1("John", 20000));
		al.add(new Employee1("Mark", 30000));
		al.add(new Employee1("Ben", 40000));
		
		Function <Employee1,Integer> f = e -> 
		{
			int  sal = e.salary;
			if(sal >= 10000 && sal <= 20000)
				return (sal * 10/100);
			
			else if (sal > 20000 && sal <= 30000)
				return(sal * 20/100);
			
			else if (sal > 30000 && sal <= 40000)
				return(sal * 30/100);
			else
				return(sal * 40/100);
		};
		
		Predicate<Integer> p = b -> b > 5000;
		
		for(Employee1 emp : al)
		{
			int bonus = f.apply(emp);
			if(p.test(bonus))
			{
				System.out.println(emp.ename+"  "+emp.salary);
				System.out.println("Bonus is "+bonus);
			}
		}
	}

}

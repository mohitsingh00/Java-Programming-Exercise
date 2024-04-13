class Employee
{
	private int emp_id;
	
	void setEmpID(int empId)
	{
		emp_id = empId;
	}
	
	int getEmpId()
	{
		return emp_id;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		
		Employee obj = new Employee();
		obj.setEmpID(100);
		System.out.print(obj.getEmpId());
		
	}

}

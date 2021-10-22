public class Singleton
{
	public static void main(String args[])
	{
		Employee obj1 = Employee.getInstance();
	}
}
class Employee 
{
	private String name ;
	private int eId;
	private int salary;
	
	static Employee obj = new Employee();
	
	private Employee()
	{
		this.name = "Ajay";
		this.eId = 101;
		this.salary = 5000;
	}
	public static Employee getInstance()
	{
		return obj;
	}
}

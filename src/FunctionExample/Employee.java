package FunctionExample;

public class Employee {
	public String name;
	public double salary;
	Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "name=" + name + ":salary=" + salary +"";
	}
	
}

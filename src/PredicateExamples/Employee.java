package PredicateExamples;

public class Employee {
	public String name;
	public String designation;
	public double salary;
	public String city;

	Employee(String name, String designation, double salary, String city) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public String toString() {
		String s = String.format("(%s,%s,%.2f,%s)",name,designation,salary,city);
		return s;
	}
	
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		if(name.equals(e.name) && designation.equals(e.designation) && salary == e.salary && city.equals(e.city) ) {
			return true;
		}else {
			return false;
		}
	}
}

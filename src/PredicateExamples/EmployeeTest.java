package PredicateExamples;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeTest {
	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		/*
		 * Employee e1 = new Employee("Sagar", "Lead Developer", 100000, "Banaglore");
		 * Employee e2 = new Employee("Ram", "Manager", 200000, "Delhi");
		 * empList.add(e1); empList.add(e2);
		 */
		populate(empList);
		//System.out.println(empList);
		
		// predicate to only print Manager
		Predicate<Employee> p = Employee -> Employee.designation.equals("Manager");
		//display(p,empList);
		
		// predicate to only print Bangalore information employees
		//Predicate<Employee> p1 = Employee -> Employee.city.equals("Bangalore");
		Predicate<Employee> p1 = Employee -> Employee.city.equals("Delhi");
		//display(p1,empList);
		
		//predicate to display employee whose salary is less than 20000
		Predicate<Employee> p2 = Employee -> Employee.salary < 20000;
		//display(p2,empList);
		
		
		//display(p.and(p1),empList);
		
		//display(p2.or(p),empList);
		
		display(p.negate(),empList);
		
		
		
	}

	public static void display(Predicate<Employee> p, ArrayList<Employee> empList) {
		for(Employee e: empList) {
			if(p.test(e)) {
				//e.salary = e.salary + 35000;
				System.out.println(e);
			}
		}
	}

	public static void populate(ArrayList<Employee> empList) {
		empList.add(new Employee("Sagar", "Lead Developer", 100000, "Bangalore"));
		empList.add(new Employee("Ram", "Manager", 200000, "Delhi"));
		empList.add(new Employee("Pavan", "QA", 300000, "Charlotte"));
		empList.add(new Employee("Vikas", "Trainee", 15000, "Chennai"));
	}
}
